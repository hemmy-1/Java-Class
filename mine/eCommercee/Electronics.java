

public class Electronics extends Product implements Discountable{
    private int warrantyMonths;

    public Electronics(int productId, String productName, double price, int warrantyMonths){
        super(productId, productName, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int warrantyMonths(){
        return warrantyMonths;
    }

    @Override
    void displayProduct(){
        System.out.println(getProductName() + "-  ₦" + getPrice() + "-  Warranty:  " + getWarrantyMonths() );

    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double applyDiscount(){
        return getPrice() * 0.90;
    }

    
    
}
