package src.services;

import src.models.Student;
import src.models.Course;
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

    // Add method for enrolling student in a course
    public boolean enrollStudentInCourse(Student student, Course course) {
        if (student != null && course != null) {
            student.enrollInCourse(course.getCourseName());
            return true;
        }
        return false;
    }
}
