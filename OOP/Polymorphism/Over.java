class OmoDudu{
    public void Doyin(int a, int b){
        System.out.println(a + b);
    }

    public void Doyin(double a){
        System.out.println(a*2);
    }
    public void Doyin(int a){
        System.out.println(a*5);
    }

    public void Doyin(String s){
        System.out.println(s.substring(0, 3) + "...");
    }

    public void Doyin(){
        System.out.println("I am tall, dark and handsome");
    }

}

public class Over {
    public static void main(String[] args){
        OmoDudu cephas = new OmoDudu();

        cephas.Doyin();
        cephas.Doyin("John");
        cephas.Doyin(2, 8);
        cephas.Doyin(7);
    }
    
}
