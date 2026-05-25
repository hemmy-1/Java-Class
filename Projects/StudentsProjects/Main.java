import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Students stud = new Students();

        while (true) {
            
            System.out.println("--- Student Portal ---");
            System.out.println();
            System.out.println("1. Add Student");
            System.out.println("2. View all students");
            System.out.println("3. Exit");
    
            System.out.println();
            int option = Integer.parseInt(scan.nextLine());
    
            if (option == 1){
                stud.addStudent();
                System.out.println("Student added succesfully");
            }
            else if (option == 2) {
                stud.viewAllStudents();
            }
            else if (option == 3){
                System.out.println("Exiting the Student Portal");
                break;
            }
        }



    }
}
