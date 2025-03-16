package Bai9;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts;
    private final int MAX_ACCOUNTS = 10;
    public Bank() {
        accounts = new ArrayList<>();
    }
    public void addAccount(BankAccount account) {
        if(accounts.size() < MAX_ACCOUNTS) {
            accounts.add(account);
            System.out.println("Đã thêm tài khoản " + account.accountNumber + " vào ngân hàng.");
        } else {
            System.out.println("Đã đạt giới hạn tối đa tài khoản. Không thể thêm tài khoản " + account.accountNumber);
        }
    }
    public void displayBalance() {
        System.out.println("\nSố dư của tất cả các tài khoản:");
        for(BankAccount account : accounts) {
            account.displayBalance();
        }
    }
}


