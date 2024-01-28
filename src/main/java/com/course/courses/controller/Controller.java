package com.course.courses.controller;

import com.course.courses.entities.Course;
import com.course.courses.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RestController
public class Controller {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        return "home page";
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Optional<Course> getCourse(@PathVariable long courseId){
        return this.courseService.getCourse(courseId);
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return  this.courseService.addCourse(course);
    }
    @PutMapping("/courses")
    public Course putCourse(@RequestBody Course course){
        return this.courseService.putCourse(course);

    }
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> delCourse(@PathVariable String courseId){
        try{
            this.courseService.delCourse(Long.parseLong(courseId));
            return  new ResponseEntity<HttpStatus>(HttpStatus.OK);
        }catch(Exception e){
            return  new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

}
