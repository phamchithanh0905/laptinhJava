package com.example.druguseprevention.repository;

import com.example.druguseprevention.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
    // Additional query methods can be defined here if needed
}