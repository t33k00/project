package com.school.project.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.*;
import com.school.project.data.Course;
import com.school.project.data.Student;
@Service
public class CourseService {

    private List<Course> courses = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

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


    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getbyIdnum(long idnum) {
        for (Student student : students) {
            if (student.getIdnum() == idnum) {
                return student;
            }
        }
        return null;
    }



    public boolean addStudentcourse(int idnum, int id){

        Student student = getbyIdnum(idnum);
        Course course = getbyId(id);

        if(student != null && course != null){
            course.addtocourse(student);
            return true;
        }

        return false;
    }

    
}
