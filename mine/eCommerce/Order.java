package mine.eCommerce;

public abstract class Order {
    private Customer customer;
    private Product product;

    public Order(Customer customer, Product product){
        this.product = product;
        this.customer = customer;
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

    
    public void displayOrder(){
        System.out.println("Customer Name" + get);
    }
}
