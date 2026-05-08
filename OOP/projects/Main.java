

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Student stArray[] = new Student[3];
  
        for (int i=0; i<3; i++){
            stArray[i] = new Student();

            // getting the name
            System.out.println("Enter the name of Student " + (i+1));
            String name = input.nextLine();
            stArray[i].setName(name);

            //gettting the age
            System.out.println("Enter the age of Student " + (i+1));
            int age = input.nextInt();
            stArray[i].setAge(age);

            //getting the score
            System.out.println("Enter the score of Student " + (i+1));
            int score = input.nextInt();
            stArray[i].setScore(score);
        }

        //Displaying the details
        for (int i=0; i<3; i++){
            stArray[i].displayInfo();
            stArray[i].checkResult();
            System.out.println();
            System.out.println("------");
        }
    }
    
}
