package com.resume.controller;

import com.resume.dto.education.EducationDto;
import com.resume.dto.personal.PersonalDetailsDto;
import com.resume.dto.skills.SkillsDto;
import com.resume.dto.summary.SummaryDto;
import com.resume.dto.workexperience.WorkExperienceDto;
import com.resume.service.ResumeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/resumes")
public class ResumeController {

    final ResumeService resumeService;
    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @PostMapping
    public PersonalDetailsDto saveDetails(@RequestBody PersonalDetailsDto dto){
        return resumeService.savePersonalDetails(dto);
    }

    @PostMapping
    public WorkExperienceDto saveWorkExp(@RequestBody WorkExperienceDto dto){
        return resumeService.saveWorkExp(dto);
    }

    @PostMapping
    public EducationDto saveEducationDetails(@RequestBody EducationDto dto){
        return resumeService.saveEducationDetails(dto);
    }

    @PostMapping
    public SkillsDto saveSkillsDetails(@RequestBody SkillsDto dto){
        return resumeService.saveSkillDetails(dto);
    }

    @PostMapping
    public SummaryDto saveSummaryDetails(@RequestBody SummaryDto dto){
        return resumeService.saveSummaryDetails(dto);
    }
}
