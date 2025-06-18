package com.example.druguseprevention.controller;

import com.example.druguseprevention.model.EducationProgram;
import com.example.druguseprevention.service.EducationProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/education-programs")
public class EducationProgramController {

    @Autowired
    private EducationProgramService educationProgramService;

    @GetMapping
    public List<EducationProgram> getAllEducationPrograms() {
        return educationProgramService.getAllEducationPrograms();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EducationProgram> getEducationProgramById(@PathVariable Long id) {
        EducationProgram program = educationProgramService.getEducationProgramById(id);
        return program != null ? ResponseEntity.ok(program) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public EducationProgram createEducationProgram(@RequestBody EducationProgram educationProgram) {
        return educationProgramService.createEducationProgram(educationProgram);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EducationProgram> updateEducationProgram(@PathVariable Long id, @RequestBody EducationProgram educationProgram) {
        EducationProgram updatedProgram = educationProgramService.updateEducationProgram(id, educationProgram);
        return updatedProgram != null ? ResponseEntity.ok(updatedProgram) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEducationProgram(@PathVariable Long id) {
        boolean isDeleted = educationProgramService.deleteEducationProgram(id);
        return isDeleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}