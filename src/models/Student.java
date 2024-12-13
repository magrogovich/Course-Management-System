package src.models;

import java.util.ArrayList;

public class Student extends User {
    private ArrayList<String> enrolledCourses;

    public Student(String id, String name) {
        super(id, name);
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(String courseName) {
        enrolledCourses.add(courseName);
    }

    public ArrayList<String> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Enrolled Courses: " + enrolledCourses);
    }
}
