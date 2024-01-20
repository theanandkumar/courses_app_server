package com.course.courses.dau;

import com.course.courses.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDau extends JpaRepository<Course, Long> {


}
