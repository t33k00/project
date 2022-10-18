package com.school.project.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.school.project.data.Course;
import com.school.project.service.CourseService;
import com.school.project.data.Student;
import java.util.List;


@RestController
public class ProjectRestController {

    
    @Autowired
    CourseService pCourse;

    @Autowired
    CourseService pStudent;

    @GetMapping("courses")
    public List<Course> getCourses(){
        return pCourse.getAllCourses();
    }

    @PostMapping("addcourse")
    public Course addCourse(@RequestBody Course course){
        pCourse.addCourse(course);
        return course;
    }
    
    @GetMapping("students")
    public List<Student> getStudents(){
        return pStudent.getAllStudents();
    }

    @PostMapping("addstudent")
    public Student addStudent(@RequestBody Student student){
        pStudent.addStudent(student);
        return student;
    }

}
