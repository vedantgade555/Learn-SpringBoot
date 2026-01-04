package com.kshtriya.youtube.LearningRestAPIs.repository;

import com.kshtriya.youtube.LearningRestAPIs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface
StudentRepository extends JpaRepository<Student,Long> {

}
