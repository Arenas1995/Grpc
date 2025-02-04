package com.cotrafa.students.servicesimpl;

import com.cotrafa.students.entities.Students;
import com.cotrafa.students.repositories.StudentsRepository;
import com.cotrafa.students.services.StudentsService;
import org.modelmapper.ModelMapper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
public class SudentsServiceImpl implements StudentsService {

    private final StudentsRepository studentsRepository;

    public SudentsServiceImpl(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @Async("asyncExecutor")
    @Override
    public CompletableFuture<Students> save(Students student) {
        student.setStatus(1);
        return CompletableFuture.completedFuture(studentsRepository.save(student));
    }

    @Async("asyncExecutor")
    @Override
    public CompletableFuture<Students> getOneById(Long id) {
        Optional<Students> student = studentsRepository.findById(id);
        return CompletableFuture.completedFuture(student.orElse(null));
    }

    @Async("asyncExecutor")
    @Override
    public CompletableFuture<List<Students>> getAll() {
        return CompletableFuture.completedFuture(studentsRepository.findAll());
    }

    @Async("asyncExecutor")
    @Override
    public CompletableFuture<Students> update(Students student, Long id) {
        Students findStudent = studentsRepository.getById(id);
        if(findStudent.getId() != null){
            ModelMapper modelMapper = new ModelMapper();
            Students updateStudent = modelMapper.map(findStudent,Students.class);
            return CompletableFuture.completedFuture(studentsRepository.save(updateStudent));
        }else {
            return null;
        }
    }

    @Async("asyncExecutor")
    @Override
    public CompletableFuture<Students> delete(Long id) {
        Students findStudent = studentsRepository.getById(id);
        if(findStudent.getId() != null){
            findStudent.setStatus(0);
            return CompletableFuture.completedFuture(studentsRepository.save(findStudent));
        }else {
            return null;
        }
    }
}
