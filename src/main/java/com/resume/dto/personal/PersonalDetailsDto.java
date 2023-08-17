package com.resume.dto.personal;

import com.resume.status.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalDetailsDto {

    private String firstName;
    private String surname;
    private String Profession;
    private String city;
    private String country;
    private String phoneNumber;
    private String email;
    private String pincode;
    private LocalDate dob;
    private MaritalStatus status;
}
