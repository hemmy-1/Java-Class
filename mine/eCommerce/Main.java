

public class Main {
    public static void main(String[] args) {

        Electronics laptop = new Electronics(101, "Laptop", 450000.0, 12);

        Clothing shirt = new Clothing(201, "Designer Shirt", 15000.0, "Large");


        Customer customer1 = new Customer(01, "Emma", "ema@gmail.com");

        Order order1 = new Order(customer1, shirt);
        Order order2 = new Order(customer1, laptop);

        order1.displayOrder();
        System.out.println("");
        order2.displayOrder();
    }
}
