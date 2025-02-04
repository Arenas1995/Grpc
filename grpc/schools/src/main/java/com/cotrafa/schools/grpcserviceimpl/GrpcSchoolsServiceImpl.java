package com.cotrafa.schools.grpcserviceimpl;


import com.cotrafa.schools.entities.Schools;
import com.cotrafa.schools.services.SchoolsService;
import com.schoolsservicegrpc.grpc.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@GrpcService
public class GrpcSchoolsServiceImpl extends SchoolServiceGrpc.SchoolServiceImplBase {

    private final SchoolsService schoolsService;

    public GrpcSchoolsServiceImpl(SchoolsService schoolsService) {
        this.schoolsService = schoolsService;
    }

    @Override
    public void getOneByID(SchoolId request, StreamObserver<SchoolObject> responseObserver) {
        CompletableFuture<Schools> foundSchool = schoolsService.getOneById(request.getId());
        foundSchool.join();
        SchoolObject objectSchoolToReturn = SchoolObject.newBuilder()
                .setId(foundSchool.join().getId())
                .setLocation(foundSchool.join().getLocation())
                .setName(foundSchool.join().getName())
                .setStatus(foundSchool.join().getStatus())
                .build();
        responseObserver.onNext(objectSchoolToReturn);
        responseObserver.onCompleted();
    }

    @Override
    public void getAll(Empty request, StreamObserver<SchoolsList> responseObserver) {
        CompletableFuture<List<Schools>> completeList = schoolsService.getAll();
        List<SchoolObject> schoolsGrpcList = new ArrayList<>();
        for (int i = 0; i < completeList.join().size(); i++) {
            SchoolObject schoolToAdd = SchoolObject.newBuilder()
                    .setId(completeList.join().get(i).getId())
                    .setLocation(completeList.join().get(i).getLocation())
                    .setName(completeList.join().get(i).getName())
                    .setStatus(completeList.join().get(i).getStatus())
                    .build();

            schoolsGrpcList.add(schoolToAdd);
        }

        SchoolsList listToReturn = SchoolsList.newBuilder().addAllSchool(schoolsGrpcList).build();

        responseObserver.onNext(listToReturn);
        responseObserver.onCompleted();

    }
}
