
interface FunctionalInterface {

    int add(int a, int b);
}
// }}{}

// class Implementor implements FunctionalInterface{

//     @Override
//     public int add(int a, int b) {
//        return a+b;
//     }
    
// }

public class Main {
    public static void main(String args[]){
        FunctionalInterface fi = new FunctionalInterface(){
            public int add(int a, int b) {return a+b;}
            
        };
        fi.add(3, 10);
    }    
}
