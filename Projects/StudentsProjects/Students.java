import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    List<Student> studList = new ArrayList<Student>();
    Scanner input = new Scanner(System.in);

    public void loadStudent(){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"));){
            studList = (List<Student>) ois.readObject();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public void addStudent(){
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"));){
        
        
        System.out.println("Enter the Id for the student: ");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter the name of the student: ");
        String name = input.nextLine();
        System.out.println("Enter the level of the student: ");
        int level = Integer.parseInt(input.nextLine());

        Student st = new Student(id, name, level);

        studList.add(st);

        oos.writeObject(studList);

        }
        catch(IOException e){
            e.printStackTrace();
        }


    }

    public void viewAllStudents(){
        
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"));){

           List<Student> sList = (List<Student>) ois.readObject();

            if (sList.isEmpty()){
                System.out.println("No student are here");
    
                return;
            }
    
            System.out.println("The list of all students: ");
            System.out.println();
            for (Student s : sList){
                System.out.println(s.toString());
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }


        }


    }
