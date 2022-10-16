package com.school.project.service;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import com.school.project.data.Student;


@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();
    private List<Student> oncourses= new ArrayList<>();
    public void addStudent(Student student) {
        students.add(student);
        oncourses.add(student);
        
    }

    public List<Student> getAllStudents() {
        return oncourses;
        
    }

    public Student getbyId(long idnum) {
        for (Student student : students) {
            if (student.getIdnum() == idnum) {
                return student;
            }
        }
        return null;
    }



}
