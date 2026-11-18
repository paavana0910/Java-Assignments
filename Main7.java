class Payment {

    double calculateAmount(double amount) {
        return amount;
    }

    double calculateAmount(double amount, double discount) {
        return amount - (amount * discount / 100);
    }
}

class CardPayment extends Payment {

    @Override
    double calculateAmount(double amount) {
        return amount + (amount * 0.02);
    }
}

class UPIPayment extends Payment {

    @Override
    double calculateAmount(double amount) {
        return amount + (amount * 0.005);
    }
}

public class Main7 {
    public static void main(String[] args) {

        Payment p;

        p = new CardPayment();
        System.out.println("Card Payment: " +
                p.calculateAmount(1000));

        p = new UPIPayment();
        System.out.println("UPI Payment: " +
                p.calculateAmount(1000));

        System.out.println("Discount Amount: " +
                p.calculateAmount(1000, 10));
    }
}
