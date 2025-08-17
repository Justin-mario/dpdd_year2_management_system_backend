package com.mkcollege.dpdd_year2_student_management_system.service;

import com.mkcollege.dpdd_year2_student_management_system.data.dto.StudentDetailsDto;
import com.mkcollege.dpdd_year2_student_management_system.repository.StudentDetailsRepository;


public class StudentDetailsServiceImpl implements StudentDetailsService {
    private StudentDetailsRepository studentDetailsRepository;

    public StudentDetailsServiceImpl(StudentDetailsRepository studentDetailsRepository) {
        this.studentDetailsRepository = studentDetailsRepository;
    }

    @Override
    public StudentDetailsDto addStudentDetails(StudentDetailsDto studentDetailsDto) {
        return null;
    }
}
