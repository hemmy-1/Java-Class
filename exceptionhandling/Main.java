import java.io.IOError;
import java.io.IOException;
import java.lang.Exception;

class Test{

    int divide(int a, int b) throws IOException{
        return a/b;
    }
}
public class Main {

    public static void main(String args[]){
        int a = 5;
        int b = -1;

        Test t = new Test();
        try{
        t.divide(8, 0);
        }
        catch(IOException e){
            
        }
        // try{
        //     if (b<0){
        //         throw new RuntimeException("Your denominator cannot be negative");
        //     }
        // System.out.println(a/b);
        // }
        // finally{
        //     System.out.println("This will work anytime");
        // }
        System.out.println("I am still working");
    }}