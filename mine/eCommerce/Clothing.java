package mine.eCommerce;

abstract class Clothing extends Product implements Discountable {
    private String size;

    public Clothing(int productId, String productName, double price, int warrantyMonths, String size) {

        super(productId, productName, price);
        this.size = size;

    }
    
    @Override
    void displayProduct() {
        System.out.println(getProductName() + "- ₦" + getPrice() + " - " + getSize() );
    }
 


    public String getSize() {
        return size;
    }


    @Override
    public double applyDiscount(){
        return getPrice() * 0.80;
    }



   
    
}
