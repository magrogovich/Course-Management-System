package src.services;

import src.models.Course;
import java.util.ArrayList;

public class CourseService {
    private ArrayList<Course> courses;

    public CourseService() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(String courseId, String courseName, int creditHours) {
        courses.add(new Course(courseId, courseName, creditHours));
    }

    public void removeCourse(String courseId) {
        courses.removeIf(course -> course.getCourseId().equals(courseId));
    }

    public void displayCourses() {
        for (Course course : courses) {
            course.displayDetails();
        }
    }

    // Add this method to return the list of courses
    public ArrayList<Course> getCourses() {
        return courses;
    }
}
