package com.course.courses.service;

import com.course.courses.entities.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public List<Course> getCourses();
    Optional<Course> getCourse(long courseId);

    public Course addCourse(Course course );
    public Course putCourse(Course course);
    public Course delCourse(long parseLong);

}
