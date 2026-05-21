
public class Main {
    public static void main(String [] args){

        Electronics laptop = new Electronics(123, "Laptop", 20000.0, 12);

        Clothing shirt = new Clothing(321, "black shirt", 50000, "XL");

        Customer Adekunle = new Customer(98, "Adekunle", "oluwa@gmail.com");
        Customer Kunle = new Customer(99, "Kunle", "oluwaa@gmail.com");



        Order firstOrder = new Order(Kunle, shirt);
        Order seconOrder = new Order(Adekunle, laptop);

        firstOrder.displayOrder();
        System.out.println("");
        seconOrder.displayOrder();
    }
}
