public class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
        }
        System.out.println("Số tiền nạp không hợp lệ");
    }

    public void withdraw(double amount){
        if(amount > 0){
            this.balance -= amount;
        }
        System.out.println("Số tiền trong tài khoản không đủ để rút");
    }

    public void transfer(BankAccount recipient, double amount){
        if(amount >= this.balance){
            recipient.deposit(amount);
            this.withdraw(amount);
        }
        System.out.println("Số tiền không đủ để chuyển");
    }

    public void display(){
        System.out.printf("Số tài khoản: %s\nTên tài khoản: %s\nSố dư tài khoản: %.2f\n", this.accountNumber, this.accountHolder, this.balance);
    }
}
