package com.cotrafa.students.controllers;

import com.cotrafa.students.entities.CompleteInfoDTO;
import com.cotrafa.students.entities.Students;
import com.cotrafa.students.grpcclient.SchoolsGrpcClient;
import com.cotrafa.students.services.StudentsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("api/v1/students")
public class StudentsController {

    private final StudentsService studentsService;

    private final SchoolsGrpcClient schoolsGrpcClient;

    public StudentsController(StudentsService studentsService, SchoolsGrpcClient schoolsGrpcClient) {
        this.studentsService = studentsService;
        this.schoolsGrpcClient = schoolsGrpcClient;
    }

    @PostMapping("")
    public CompletableFuture<ResponseEntity> postRecord(@RequestBody Students student){
        return studentsService.save(student).thenApply(ResponseEntity::ok);
    }


    @GetMapping("")
    public CompletableFuture<ResponseEntity> getAll(){
        return studentsService.getAll().thenApply(ResponseEntity::ok);
    }


    @GetMapping("/{id}")
    public CompletableFuture<ResponseEntity> getOneById(@PathVariable Long id){
        return studentsService.getOneById(id).thenApply(ResponseEntity::ok);
    }

    @PutMapping("/{id}")
    public CompletableFuture<ResponseEntity> update(@RequestBody Students student,@PathVariable Long id){
        return studentsService.update(student,id).thenApply(ResponseEntity::ok);
    }

    @DeleteMapping("/{id}")
    public CompletableFuture<ResponseEntity> delete(@PathVariable Long id){
        return studentsService.delete(id).thenApply(ResponseEntity::ok);
    }

    @GetMapping("complete/{id}")
    public CompleteInfoDTO getStudentCompleteInfo(@PathVariable Long id){
        return schoolsGrpcClient.getCompleInfoStudent(id);
    }

}
