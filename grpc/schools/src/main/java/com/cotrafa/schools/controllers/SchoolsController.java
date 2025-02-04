package com.cotrafa.schools.controllers;


import com.cotrafa.schools.entities.Schools;
import com.cotrafa.schools.services.SchoolsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("api/v1/schools")
public class SchoolsController {

    private final SchoolsService schoolsService;

    public SchoolsController(SchoolsService schoolsService) {
        this.schoolsService = schoolsService;
    }

    @PostMapping("")
    public CompletableFuture<ResponseEntity> postRecord(@RequestBody Schools school) {
        return schoolsService.save(school).thenApply(ResponseEntity::ok);
    }

    @GetMapping("")
    public CompletableFuture<ResponseEntity> getAll() {
        return schoolsService.getAll().thenApply(ResponseEntity::ok);
    }

    @PutMapping("/{id}")
    public CompletableFuture<ResponseEntity> update(@RequestBody Schools school, @PathVariable Long id) {
        return schoolsService.update(school, id).thenApply(ResponseEntity::ok);
    }

    @DeleteMapping("/{id}")
    public CompletableFuture<ResponseEntity> delete(@PathVariable Long id) {
        return schoolsService.delete(id).thenApply(ResponseEntity::ok);
    }
}
