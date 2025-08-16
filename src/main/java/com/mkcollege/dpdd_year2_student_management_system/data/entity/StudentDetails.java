package com.mkcollege.dpdd_year2_student_management_system.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class StudentDetails {

    @Id
    private Long studentNumber;
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Email(message="invalid email format")
    @NotBlank
    @Column(nullable = false)
    private String parentEmail;

    @Column(nullable = false)
    private String parentPhone1;

    @Column(nullable = true)
    private String parentPhone2;

    @Column(nullable = true)
    private String projectedGrade;

    @Column(nullable = false)
    private String dob;
}
