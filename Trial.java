import java.utill.Scanner;

public class Main{
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter the number:");
        int y = input.nextInt();

        System.out.println("enter the second number");
        int x = input.nextInt();

        int z = y * x;
        System.out.println("here is your answer" + z);
     
        
    }
}