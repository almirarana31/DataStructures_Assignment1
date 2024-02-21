class CreditCard {
    private static String customer = "Ally";
    private static String bank = "BCA";
    private static String account = "101010";
    private static int limit = 1000000;
    private static double balance = 0.0;

    public static String getCustomer() {
        return customer;
    }

    public static String getBank() {
        return bank;
    }

    public static String getAccount() {
        return account;
    }

    public static int getLimit() {
        return limit;
    }

    public static double getBalance() {
        return balance;
    }

    public static void makePayment(double amount) {
        balance -= amount;
    }

    public static boolean charge(double amount) {
        return amount > limit;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Customer: " + CreditCard.getCustomer());
        System.out.println("Bank: " + CreditCard.getBank());
        System.out.println("Account: " + CreditCard.getAccount());
        System.out.println("Limit: " + CreditCard.getLimit());
        System.out.println("Balance: " + CreditCard.getBalance());

        double paymentAmount = 500.0;
        CreditCard.makePayment(paymentAmount);
        System.out.println("Balance after payment: " + CreditCard.getBalance());

        boolean shouldCharge = CreditCard.charge(paymentAmount);
        if (shouldCharge) {
            System.out.println("Credit card is charged.");
        } else {
            System.out.println("Credit card is not charged");
        }
    }
}
