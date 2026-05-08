class Animal{
    public void speak(){
        System.out.println("I am speaking as an animal");
    }
}

class Dog extends Animal {

    @Override
    public void speak(){
        System.out.println("I am barking");
    }
}
public class Overriding {

    public static void main(String args[]){
    Animal an = new Animal();
    Dog dg = new Dog();
    
    an.speak();

    }
    }
