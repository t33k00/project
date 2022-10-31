package com.school.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("courses")//lists all courses
    public List<Course> getCourses() {
        return pCourse.getAllCourses();
        // http://localhost:8080/courses
    }

    @PostMapping("addcourse")//add course
    public Course addCourse(@RequestBody Course course) {
        pCourse.addCourse(course);
        return course;
        // http://localhost:8080/addcourse
    }

    @GetMapping("students")//lists all students
    public List<Student> getStudents() {
        return pStudent.getAllStudents();
        // http://localhost:8080/students
    }

    @PostMapping("addstudent")//add student
    public Student addStudent(@RequestBody Student student) {
        pStudent.addStudent(student);
        return student;
        // http://localhost:8080/addstudent
    }

    @GetMapping("addtocourse")//add student to course using id:s
    public String addStocourse(
            @RequestParam Integer studentid, Integer courseid,
            @RequestBody(required = false) Student student) {
        pCourse.addStudentcourse(studentid, courseid);
        return "OK";
        // http://localhost:8080/addtocourse?studentid=?&courseid=?
        //replace ? with id:s
    }

    @GetMapping("delfromcourse")//delete student from course using id:s
    public String delSfromcourse(
            @RequestParam Integer studentid, Integer courseid,
            @RequestBody(required = false) Student student) {
        pCourse.delStudentcourse(studentid, courseid);
        return "OK";
        // http://localhost:8080/delfromcourse?studentid=?&courseid=?
    }

}
