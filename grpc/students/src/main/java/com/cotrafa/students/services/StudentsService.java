package com.cotrafa.students.services;

import com.cotrafa.students.entities.Students;

import java.util.List;
import java.util.concurrent.CompletableFuture;
public interface StudentsService {
    CompletableFuture<Students> save(Students student);
    CompletableFuture<Students> getOneById(Long id);
    CompletableFuture<List<Students>> getAll();
    CompletableFuture<Students> update(Students student, Long id);
    CompletableFuture<Students> delete(Long id);
}
