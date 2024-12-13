# Student Course Management System

This project is a **Java-based Student Course Management System**. It uses object-oriented programming principles to manage students, courses, and their interactions. Below are the steps to compile and run the project.

## Prerequisites

1. **Java Development Kit (JDK)**: Ensure JDK is installed on your system.
   - Verify installation:
     ```bash
     java -version
     javac -version
     ```
   - [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html) if not installed.

2. **Directory Structure**: The project files should be organized as follows:
   ```
   StudentCourseManagementSystem/
   └── src/
       ├── Main.java
       ├── User.java
       ├── Student.java
       ├── Course.java
       ├── CourseService.java
       ├── StudentService.java
       └── MenuUtils.java
   ```

## How to Run

### Step 1: Navigate to the Project Directory

Open a terminal or command prompt and navigate to the root directory of the project:
```bash
cd path/to/StudentCourseManagementSystem
```

### Step 2: Compile the Java Files

Compile all the Java files located in the `src` directory:
```bash
javac src/*.java
```

This will generate `.class` files in the `src` directory.

### Step 3: Run the Application

Run the `Main` class to start the program:
```bash
java -cp src Main
```

### Step 4: Using the Application

Follow the on-screen menu prompts to perform actions like managing students, courses, and enrollments.

## Troubleshooting

1. **Error: Could not find or load main class src.Main**
   - Ensure the `Main.java` file contains the correct package declaration (`package src;`).
   - Ensure the directory structure matches the package declaration.

2. **File Not Found Errors**
   - Verify the directory structure and that all `.java` files are in the `src` folder.

3. **Classpath Issues**
   - Always specify the classpath using the `-cp` option when running the program.

## Project Description

This project implements a simple student course management system using object-oriented programming concepts such as:
- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

It includes the following features:
- Add and remove students.
- Add and remove courses.
- Enroll students in courses.
- Display all students and courses.

---
Enjoy managing your students and courses efficiently! 😊
