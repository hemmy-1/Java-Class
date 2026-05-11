
interface PaymentGateway{
    String name();
}
class Paypal implements PaymentGateway {
    @Override
    public String name(){
        return "Paypal Gateway";
    }
}

class PayStack implements PaymentGateway{
    @Override
    public String name(){
        return "PayStack Gateway";
    }
}

class Flutterwave implements PaymentGateway{
    @Override
    public String name(){
        return "Flutterwave Gateway";
    }
}

class Payment {

    void makePayment(PaymentGateway p){
        System.out.println("I am making payment through " + p.name());
    }
    
}

public class Index{
    public static void main(String[] args){
        Payment py = new Payment();
        Paypal pp = new Paypal();
        Flutterwave ff =  new Flutterwave();
        PayStack ps = new PayStack();
        py.makePayment(pp);
        py.makePayment(ff);
        py.makePayment(ps);
    }
}


