
public class Main {

    public static void main(String args[]){

        int a= 5;
        int b = args.length; 

        int c = -7;

        Calc ca = new Calc();
        
        System.out.println(ca.divide(5, 0));

        // try{
        //     if (c < 0){
        //         throw new RuntimeException("You cannot input negative numbers");
        //     }
        //     System.out.println(a/b);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("The error has been caught");
        // }
        // catch(RuntimeException e){
        //     System.out.println("This error occured: " + e);
        // }
        // finally{

        //     System.out.println("Succesful"); 
        // }

        // System.out.println("This is still working");
        
        
        
    }}
