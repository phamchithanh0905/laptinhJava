package com.example.druguseprevention.service;

import com.example.druguseprevention.model.Survey;
import com.example.druguseprevention.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    public List<Survey> getAllSurveys() {
        return surveyRepository.findAll();
    }

    public Survey getSurveyById(Long id) {
        return surveyRepository.findById(id).orElse(null);
    }

    public Survey createSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    public Survey updateSurvey(Long id, Survey surveyDetails) {
        Survey survey = surveyRepository.findById(id).orElse(null);
        if (survey != null) {
            survey.setTitle(surveyDetails.getTitle());
            survey.setQuestions(surveyDetails.getQuestions());
            return surveyRepository.save(survey);
        }
        return null;
    }

    public void deleteSurvey(Long id) {
        surveyRepository.deleteById(id);
    }
}