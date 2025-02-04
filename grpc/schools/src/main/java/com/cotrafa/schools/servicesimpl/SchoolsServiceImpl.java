package com.cotrafa.schools.servicesimpl;


import com.cotrafa.schools.entities.Schools;
import com.cotrafa.schools.repositories.SchoolsRepository;
import com.cotrafa.schools.services.SchoolsService;
import org.modelmapper.ModelMapper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

@Service
public class SchoolsServiceImpl implements SchoolsService {

    private final SchoolsRepository schoolsRepository;

    public SchoolsServiceImpl(SchoolsRepository schoolsRepository) {
        this.schoolsRepository = schoolsRepository;
    }

    @Async("asyncExecutor")
    @Override
    public CompletableFuture<Schools> save(Schools school) {
        school.setStatus(1);
        return CompletableFuture.completedFuture(schoolsRepository.save(school));
    }

    @Async("asyncExecutor")
    @Override
    public CompletableFuture<Schools> getOneById(Long id) {
        Optional<Schools> school = schoolsRepository.findById(id);
        return CompletableFuture.completedFuture(school.orElse(null));
    }

    @Async("asyncExecutor")
    @Override
    public CompletableFuture<List<Schools>> getAll() {
        return CompletableFuture.completedFuture(schoolsRepository.findAll());
    }

    @Async("asyncExecutor")
    @Override
    public CompletableFuture<Schools> update(Schools school, Long id) {
        Optional<Schools> findStudent = schoolsRepository.findById(id);
        if (findStudent.isPresent() && findStudent.get().getId() != null) {
            ModelMapper modelMapper = new ModelMapper();
            Schools updateStudent = modelMapper.map(findStudent, Schools.class);
            return CompletableFuture.completedFuture(schoolsRepository.save(updateStudent));
        } else {
            return null;
        }
    }

    @Async("asyncExecutor")
    @Override
    public CompletableFuture<Schools> delete(Long id) {
        Optional<Schools> findStudent = schoolsRepository.findById(id);
        if (findStudent.isPresent() && findStudent.get().getId() != null) {
            findStudent.get().setStatus(0);
            ModelMapper modelMapper = new ModelMapper();
            Schools deleteStudent = modelMapper.map(findStudent, Schools.class);
            return CompletableFuture.completedFuture(schoolsRepository.save(deleteStudent));
        } else {
            return null;
        }
    }
}
