package com.mkcollege.dpdd_year2_student_management_system.data.dto;

import com.mkcollege.dpdd_year2_student_management_system.data.entity.StudentDetails;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class StudentDetailsDto {

    private int studentNumber;

    private String firstName;

    private String lastName;

    private String parentEmail;

    private String parentPhone1;

    private String parentPhone2;

    private String projectedGrade;

    private String dob;

    public StudentDetailsDto(StudentDetails studentDetails) {
        studentDetails.setStudentNumber(studentNumber);
        studentDetails.setFirstName(firstName);
        studentDetails.setLastName(lastName);
        studentDetails.setParentEmail(parentEmail);
        studentDetails.setParentPhone1(parentPhone1);
        studentDetails.setParentPhone2(parentPhone2);
        studentDetails.setProjectedGrade(projectedGrade);
        studentDetails.setDob(dob);
    }
}
