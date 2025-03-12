import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Số tài khoản 1: ");
        String aNum = sc.nextLine();
        System.out.printf("Tên tài khoản 1: ");
        String aHolder = sc.nextLine();
        BankAccount b1 = new BankAccount("BA01", "Vỹ");

        System.out.printf("Số tài khoản 2: ");
        aNum = sc.nextLine();
        System.out.printf("Tên tài khoản 2: ");
        aHolder = sc.nextLine();
        BankAccount b2 = new BankAccount("BA02", "Hai");

        b1.display();
        b2.display();

        System.out.printf("Lượng tiền: ");
        double amount = Double.parseDouble(sc.nextLine());
        b1.deposit(amount);
        System.out.printf("Lượng tiền: ");
        amount = Double.parseDouble(sc.nextLine());
        b2.withdraw(amount);
        System.out.printf("Lượng tiền: ");
        amount = Double.parseDouble(sc.nextLine());
        b1.transfer(b2, amount);

        b1.display();
        b2.display();
    }
}