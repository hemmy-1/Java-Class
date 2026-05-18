package mine.eCommerce;

public abstract class Customer{
    private int customerId;
    private String customerName;
    private String email;


    public Customer(int customerId, String customerName, String email){
        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void dispalyCustomerInfo(){
        System.out.println("Customer ID" + this.customerId);
        System.out.println("Customer Name" + this.customerName);
        System.out.println("Customer Email" + this.email);
    }

    

}
