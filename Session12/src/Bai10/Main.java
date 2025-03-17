package Bai10;

public class Main{
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCard(1000);
        PaymentMethod debitCard = new DebitCard(1000);
        PaymentMethod cash = new Cash(1000);
        System.out.println("Thanh toán bằng thẻ tín dụng:");
        System.out.println("Phí: " + creditCard.calculateFee());
        System.out.println("Tổng số tiền: " + creditCard.processPayment());
        System.out.println("Tổng số tiền (đơn vị USD): " + creditCard.processPayment("USD"));
        System.out.println("\nThanh toán bằng thẻ ghi nợ:");
        System.out.println("Phí: " + debitCard.calculateFee());
        System.out.println("Tổng số tiền: " + debitCard.processPayment());
        System.out.println("Tổng số tiền (đơn vị USD): " + debitCard.processPayment("USD"));
        System.out.println("\nThanh toán bằng tiền mặt:");
        System.out.println("Phí: " + cash.calculateFee());
        System.out.println("Tổng số tiền: " + cash.processPayment());
        System.out.println("Tổng số tiền (đơn vị USD): " + cash.processPayment("USD"));

    }
}
