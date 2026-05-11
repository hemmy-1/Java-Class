package Abstraction;

interface Institutions{
    String teach();
    String graduate();
    
}

class Cephas implements Institutions{
    public String teach(){
        return "We are teaching";
    }

    public String graduate(){
        return "Our students graduates";
    }
}

public class Main {
    public static void main(String[] ars){
    
    }
}
