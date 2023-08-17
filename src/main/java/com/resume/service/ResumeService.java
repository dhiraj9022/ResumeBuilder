package com.resume.service;

import com.resume.dto.education.EducationDto;
import com.resume.dto.personal.PersonalDetailsDto;
import com.resume.dto.skills.SkillsDto;
import com.resume.dto.summary.SummaryDto;
import com.resume.dto.workexperience.WorkExperienceDto;
import com.resume.repo.ResumeRepo;
import org.springframework.stereotype.Service;

@Service
public class ResumeService {

    final ResumeRepo resumeRepo;

    public ResumeService(ResumeRepo resumeRepo) {
        this.resumeRepo = resumeRepo;
    }

    public PersonalDetailsDto savePersonalDetails(PersonalDetailsDto dto) {

        return null;
    }

    public WorkExperienceDto saveWorkExp(WorkExperienceDto dto) {
        return  null;
    }

    public EducationDto saveEducationDetails(EducationDto dto) {
        return null;
    }

    public SummaryDto saveSummaryDetails(SummaryDto dto) { return null;
    }

    public SkillsDto saveSkillDetails(SkillsDto dto) { return null;
    }
}
