abstract class Payment{
    abstract void pay();
}
class UPIPayment extends Payment{
    void pay(){
        System.out.println("This is UPI payment method");
    }
}

class creditPayment extends Payment{
    void pay(){
        System.out.println("This is credit payment method");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Payment payment = new UPIPayment();
        payment.pay();
        payment = new creditPayment();
        payment.pay();
    }
}
