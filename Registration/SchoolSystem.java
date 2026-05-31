import java.util.Scanner;

public class SchoolSystem {

    private static Scanner scanner = new Scanner(System.in);
    private static RegistrationSystem manager = new RegistrationSystem();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Registration System ---");
            System.out.println("1. Add Student\n2. Add Course\n3. Register Student for Course");
            System.out.println("4. View All Students\n5. View All Courses\n6. View Student Courses\n7. Exit");
            System.out.print("Select an option: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> addStudent();
                    case 2 -> addCourse();
                    case 3 -> registerCourse();
                    case 4 -> viewStudents();
                    case 5 -> viewCourses();
                    case 6 -> viewStudentCourses();
                    case 7 -> System.exit(0);
                    default -> System.out.println("Invalid option.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void addStudent() {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Dept: ");
        String dept = scanner.nextLine();
        manager.addStudent(new Student(id, name, dept));
        System.out.println("Student added successfully.");
    }

    private static void addCourse() {
        System.out.print("Enter Code: ");
        String code = scanner.nextLine();
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Units: ");
        int units = Integer.parseInt(scanner.nextLine());
        manager.addCourse(new Course(code, title, units));
        System.out.println("Course added successfully.");
    }

    private static void registerCourse() throws Exception {
        System.out.print("Enter Student ID: ");
        int sId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Course Code: ");
        String cCode = scanner.nextLine();

        Student s = manager.getStudent(sId);
        Course c = manager.getCourse(cCode);

        if (s == null || c == null)
            throw new Exception("Student or Course not found.");
        s.registerCourse(c);
        System.out.println("Registration successful!");
    }

    private static void viewStudents() {
        manager.getAllStudents().forEach(System.out::println);
    }

    private static void viewCourses() {
        manager.getAllCourses().forEach(System.out::println);
    }

    private static void viewStudentCourses() {
        System.out.print("Enter Student ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student s = manager.getStudent(id);
        if (s != null) {
            System.out.println("Courses for " + s.getName() + ":");
            s.getRegisterCourses().forEach(System.out::println);
        } else {
            System.out.println("Student not found.");
        }
    }

}