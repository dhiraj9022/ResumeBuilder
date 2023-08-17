package com.resume.model;

import com.resume.status.MaritalStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "resumes")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Resume {

    @Id
    private UUID id;

    private String firstName;
    private String surname;
    private String Profession;
    private String city;
    private String country;
    private String phoneNumber;
    private String email;
    private String pincode;
    private LocalDate dob;
    private String language;
    private String hobbies;
    private MaritalStatus status;
    private String nationality;
    private String avatar;
    private String jobTitle;
    private String Employer;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean currentlyWorking;
    private String collegeName;
    private String collegeLocation;
    private String Degree;
    private String specializationBranch;
    private String skillsName;
    private String summary;
    private String certificateLinks;

}
