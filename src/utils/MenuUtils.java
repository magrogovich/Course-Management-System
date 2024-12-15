package src.utils;

import src.services.CourseService;
import src.services.StudentService;
import src.models.Student;
import src.models.Course;

import java.util.Scanner;

public class MenuUtils {
    private static CourseService courseService = new CourseService();
    private static StudentService studentService = new StudentService();

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Student Course Management System");
            System.out.println("1. Manage Courses");
            System.out.println("2. Manage Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> displayCourseMenu();
                case 2 -> displayStudentMenu();
                case 3 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayCourseMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Course Management");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. View Courses");
            System.out.println("4. Return to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Course ID: ");
                    String id = scanner.next();
                    System.out.print("Enter Course Name: ");
                    String name = scanner.next();
                    System.out.print("Enter Credit Hours: ");
                    int credits = scanner.nextInt();
                    courseService.addCourse(id, name, credits);
                    System.out.println("Course added successfully!");
                }
                case 2 -> {
                    System.out.print("Enter Course ID to remove: ");
                    String id = scanner.next();
                    courseService.removeCourse(id);
                    System.out.println("Course removed successfully!");
                }
                case 3 -> courseService.displayCourses();
                case 4 -> {
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayStudentMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Student Management");
            System.out.println("1. Register Student");
            System.out.println("2. View Students");
            System.out.println("3. Enroll in Course");
            System.out.println("4. Return to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Student ID: ");
                    String id = scanner.next();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.next();
                    studentService.registerStudent(id, name);
                    System.out.println("Student registered successfully!");
                }
                case 2 -> studentService.displayStudents();
                case 3 -> enrollInCourse(scanner);
                case 4 -> {
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void enrollInCourse(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.next();
        Student student = studentService.getStudentById(studentId);

        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.println("Available Courses:");
        courseService.displayCourses();

        System.out.print("Enter Course ID to enroll in: ");
        String courseId = scanner.next();
        Course selectedCourse = findCourseById(courseId);

        if (selectedCourse == null) {
            System.out.println("Course not found!");
        } else {
            // Enroll the student in the selected course
            if (studentService.enrollStudentInCourse(student, selectedCourse)) {
                System.out.println("Successfully enrolled in: " + selectedCourse.getCourseName());
            } else {
                System.out.println("Failed to enroll in the course.");
            }
        }
    }

    private static Course findCourseById(String courseId) {
        for (Course course : courseService.getCourses()) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }
}
