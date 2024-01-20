package com.course.courses.service;

import com.course.courses.dau.CourseDau;
import com.course.courses.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseDau courseDau;

//    List<Course> list;
    public CourseServiceImpl(){
//        list=new ArrayList<>();
//        list.add(new Course(14,"java","good course"));
//        list.add(new Course(15,"spring","not bad"));

    }

    @Override
    public List<Course> getCourses(){
        return courseDau.findAll();
    }

    public Optional<Course> getCourse(long courseId) {
//        Course c =null;
//        for(Course course:list){
//            if(course.getId()==courseId){
//                c=course;
//                break;
//            }
//        }
        //return new Course();
        return courseDau.findById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
        courseDau.save(course);
        return course;
    }

////    @Override
////    public Course putCourse(Optional<Course> course) {
////        return null;
//    }

    //put
    @Override
    public Course putCourse(Course course) {

//        list.forEach(e->{
//            if(e.getId()==course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });
        courseDau.save(course);
        return course;
    }
//delete
    public Course delCourse(long parseLong) {
//        list = this.list.stream().filter(e -> e.getId() != parseLong).collect(Collectors.toList());
        Course entity = courseDau.getOne(parseLong);
        courseDau.delete(entity);
        return null;
    }
    }
