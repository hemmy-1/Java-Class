
public class Clothing extends Product implements Discountable{
    private String size;

    public Clothing(int productId, String productName, double price, String size ){
        super(productId, productName, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    void displayProduct(){
        System.out.println(getProductName() + "  -  ₦" + getPrice() + "  -  size:" + getSize() );
    }

    @Override
    public double applyDiscount(){
        return getPrice() * 0.80;
    }
    
}
