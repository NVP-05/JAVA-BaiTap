package Bai9;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Đã rút " + amount + " đô la từ tài khoản nặng lãi " + accountNumber);
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Nạp thành công " + amount + " đô la vào tài khoản nặng lãi " + accountNumber);
    }
    @Override
    public void displayBalance() {
        System.out.println("Số dư của tài khoản nặng lãi " + accountNumber + " là: " + balance + " đô la");
    }
}


