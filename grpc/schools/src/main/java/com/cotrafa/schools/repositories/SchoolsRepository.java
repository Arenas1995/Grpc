package com.cotrafa.schools.repositories;

import com.cotrafa.schools.entities.Schools;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolsRepository extends JpaRepository<Schools, Long> {


}
