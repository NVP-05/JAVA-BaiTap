package Bai9;

public class SavingAccount extends BankAccount {
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    public void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Số tiền rút vượt quá số dư của tài khoản tiết kiệm " + accountNumber);
        } else {
            balance -= amount;
            System.out.println("Rút thành công " + amount + " đô la từ tài khoản tiết kiệm " + accountNumber);
        }
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Nạp thành công " + amount + " đô la vào tài khoản tiết kiệm " + accountNumber);
    }
    @Override
    public void displayBalance() {
        System.out.println("Số dư của tài khoản tiết kiệm " + accountNumber + " là: " + balance + " đô la");
    }
}


