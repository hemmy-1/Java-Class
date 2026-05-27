import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        // FileOutputStream fos = new FileOutputStream("text.txt");

        // String text = "This is the content of the file";

        // fos.write(text.getBytes());

 
    // BufferedInputStream bis = new BufferedInputStream(new FileInputStream("text.txt"));      
    //     // System.out.println(bis.read());

    //     int work;

    //     while ((work = bis.read()) != -1) {
    //         System.out.print((char) work);
            
    //     }
    // FileReader reader = new FileReader("text.txt");
    // System.out.println(reader.read());

//   FileWriter JohnWrites = new FileWriter("Java.txt");
//   JohnWrites.write("Java class is currently on going \n");

//   JohnWrites.write("Dont forget we are closing by 5pm");

// JohnWrites.close();


// BufferedReader bff = new BufferedReader( new FileReader("Java.txt"));
// int read;
            Scanner input = new Scanner(new File("Java.txt"));

      while (input.hasNextLine()){
        System.out.println(input.nextLine());
      }
}




    }

