package src.services;

import src.models.Student;
import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> students;

    public StudentService() {
        this.students = new ArrayList<>();
    }

    public void registerStudent(String id, String name) {
        students.add(new Student(id, name));
    }

    public void displayStudents() {
        for (Student student : students) {
            student.displayDetails();
        }
    }

    public Student getStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }
}
