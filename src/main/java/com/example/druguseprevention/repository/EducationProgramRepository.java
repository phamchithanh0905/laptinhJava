package com.example.druguseprevention.repository;

import com.example.druguseprevention.model.EducationProgram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationProgramRepository extends JpaRepository<EducationProgram, Long> {
    // Additional query methods can be defined here if needed
}