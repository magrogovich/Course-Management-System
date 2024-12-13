# Student Course Management System

This is a Java-based application to manage students, courses, and related functionalities.

## Project Structure

```
.
├── README.md
└── src
    ├── Main.class
    ├── Main.java
    ├── models
    │   ├── Course.class
    │   ├── Course.java
    │   ├── Student.class
    │   ├── Student.java
    │   ├── User.class
    │   └── User.java
    ├── services
    │   ├── CourseService.class
    │   ├── CourseService.java
    │   ├── StudentService.class
    │   └── StudentService.java
    └── utils
        ├── MenuUtils.class
        └── MenuUtils.java
```

## Prerequisites

- Install Java Development Kit (JDK) version 8 or higher.
- Ensure `javac` (Java Compiler) and `java` (Java Runtime) are available in your `PATH`.

## Compilation Instructions

1. Open a terminal or command prompt.
2. Navigate to the project root directory (where the `src` folder is located).
3. Compile all Java files using the following command:

   ```bash
   javac src/**/*.java
   ```

   This will compile all `.java` files in the `src` directory and its subdirectories.

## Running the Application

1. Navigate to the project root directory.
2. Run the `Main` class with the following command:

   ```bash
   java -cp src Main
   ```

## Notes

- Make sure the `Main.java` file has the correct `package` declaration (or none if it is in the root directory).
- The `-cp` flag specifies the `src` directory as the classpath.

## Troubleshooting

- If you encounter errors such as `ClassNotFoundException`, ensure the directory structure matches the `package` declarations in your `.java` files.
- Ensure all required `.java` files have been compiled successfully.

## Example Usage

After running the application, follow the on-screen menu to interact with the system. Use the menu options to manage students, courses, and more.
