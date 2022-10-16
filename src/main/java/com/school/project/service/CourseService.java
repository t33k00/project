package com.school.project.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.*;
import com.school.project.data.Course;

@Service
public class CourseService {
    private List<Course> courses = new ArrayList<>();
    
    public void addCourse(Course course) {
        courses.add(course);
    }
    public List<Course> getAllCourses() {
        return courses;
    
    }
    public Course getbyId(long id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }
}
