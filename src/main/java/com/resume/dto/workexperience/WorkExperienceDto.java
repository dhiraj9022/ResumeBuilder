package com.resume.dto.workexperience;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkExperienceDto {
    private String jobTitle;
    private String Employer;
    private String city;
    private String country;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean currentlyWorking;

}
