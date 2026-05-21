
public class Order {
    private Customer customer;
    private Product product;

    public Order(Customer customer, Product product){
        this.customer = customer;
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    void displayOrder(){
        System.out.println("Customer Name:  " + customer.getCustomerName());
        System.out.println("Product" + product.getProductName());
        System.out.println("Orignal price" + product.getPrice());

        if (product instanceof Discountable) {
            Discountable discountableProduct = (Discountable) product;
            System.out.println("Discounted Price: " + "\u20A6" + discountableProduct.applyDiscount());
        } else {
            System.out.println("Discounted Price: N/A (No discount available)");
        }
        System.out.println("--------------");
    }
}
