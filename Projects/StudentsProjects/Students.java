import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

Serializable
public class Students {

    List<Student> studList = new ArrayList<Student>();
    Scanner input = new Scanner(System.in);
    public void addStudent(){
        System.out.println("Enter the Id for the student: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter the name of the student: ");
        String name = input.nextLine();
        System.out.println("Enter the level of the student: ");
        int level = Integer.parseInt(input.nextLine());

        Student st = new Student(id, name, level);

        studList.add(st);
    }

    public void viewAllStudents(){

        if (studList.isEmpty()){
            System.out.println("No student are here");

            return;
        }

        System.out.println("The list of all students: ");
        System.out.println();
        for (Student s : studList){
            System.out.println(s.toString());
        }

        }


    }
