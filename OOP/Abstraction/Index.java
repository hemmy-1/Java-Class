
abstract class PaymentGateway{
     abstract String makePayment();
    abstract String withdraw();

    String details(){
        return "This is all you need to know about me";
    }
}


class Paypal extends PaymentGateway {
    

    public String makePayment(){
        return "Making payment with paypal";
    }

    public String withdraw(){
        return "withdrawing throuhg paypal";
    }
    
}

class PayStack extends PaymentGateway{
    public String makePayment(){
        return "Making payment with paystack";
    }
    
    public String withdraw(){
        return "withdrawing throuhg paystack";
    }
}


public class Index{
    public static void main(String[] args){
        Paypal pp = new Paypal();
        PayStack ps = new PayStack();

        System.out.println(pp.makePayment());
        System.out.println(ps.makePayment());
    }
}


