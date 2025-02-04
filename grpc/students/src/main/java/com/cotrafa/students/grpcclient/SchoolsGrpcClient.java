package com.cotrafa.students.grpcclient;

import com.cotrafa.students.entities.CompleteInfoDTO;
import com.cotrafa.students.entities.School;
import com.cotrafa.students.entities.Students;
import com.cotrafa.students.repositories.StudentsRepository;
import com.schoolsservicegrpc.grpc.SchoolId;
import com.schoolsservicegrpc.grpc.SchoolObject;
import com.schoolsservicegrpc.grpc.SchoolServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.netty.NettyChannelBuilder;
import org.springframework.stereotype.Service;

@Service
public class SchoolsGrpcClient {

    private final StudentsRepository studentsRepository;

    public SchoolsGrpcClient(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    public CompleteInfoDTO getCompleInfoStudent(Long id){

        ManagedChannel channel = NettyChannelBuilder.forTarget("dns:///localhost:9090").usePlaintext().build();

        Students student = studentsRepository.getReferenceById(id);
        SchoolServiceGrpc.SchoolServiceBlockingStub stub = SchoolServiceGrpc.newBlockingStub(channel);
        SchoolObject retrievedSchool = stub.getOneByID(SchoolId.newBuilder()
                .setId(student.getSchoolId())
                .build());
        channel.shutdown();

        return getCompleteInfoDTO(retrievedSchool, student);
    }

    private static CompleteInfoDTO getCompleteInfoDTO(SchoolObject retrievedSchool, Students student) {
        School school = new School();
        school.setId(retrievedSchool.getId());
        school.setName(retrievedSchool.getName());
        school.setLocation(retrievedSchool.getLocation());
        school.setStatus(retrievedSchool.getStatus());

        CompleteInfoDTO completeInfo = new CompleteInfoDTO();
        completeInfo.setId(student.getId());
        completeInfo.setName(student.getName());
        completeInfo.setLastName(student.getLastName());
        completeInfo.setSchool(school);
        completeInfo.setStatus(student.getStatus());

        return completeInfo;
    }
}
