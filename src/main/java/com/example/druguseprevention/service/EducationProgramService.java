package com.example.druguseprevention.service;

import com.example.druguseprevention.model.EducationProgram;
import com.example.druguseprevention.repository.EducationProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationProgramService {

    @Autowired
    private EducationProgramRepository educationProgramRepository;

    public List<EducationProgram> getAllPrograms() {
        return educationProgramRepository.findAll();
    }

    public EducationProgram getProgramById(Long id) {
        return educationProgramRepository.findById(id).orElse(null);
    }

    public EducationProgram createProgram(EducationProgram program) {
        return educationProgramRepository.save(program);
    }

    public EducationProgram updateProgram(Long id, EducationProgram programDetails) {
        EducationProgram program = educationProgramRepository.findById(id).orElse(null);
        if (program != null) {
            program.setTitle(programDetails.getTitle());
            program.setContent(programDetails.getContent());
            program.setFeedback(programDetails.getFeedback());
            return educationProgramRepository.save(program);
        }
        return null;
    }

    public void deleteProgram(Long id) {
        educationProgramRepository.deleteById(id);
    }
}