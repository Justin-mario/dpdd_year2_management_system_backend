package com.mkcollege.dpdd_year2_student_management_system.service;

import com.mkcollege.dpdd_year2_student_management_system.data.dto.StudentDetailsDto;
import org.springframework.stereotype.Service;

@Service
public interface StudentDetailsService {
    StudentDetailsDto addStudentDetails(StudentDetailsDto studentDetailsDto);
}
