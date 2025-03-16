package Bai9;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankAccount savingAccount = new SavingAccount("S1001", 5000);
        BankAccount checkingAccount = new CheckingAccount("C2001", 2000);
        bank.addAccount(savingAccount);
        bank.addAccount(checkingAccount);
        savingAccount.deposit(1000);
        savingAccount.withdraw(2000);
        savingAccount.withdraw(5000);
        checkingAccount.deposit(500);
        checkingAccount.withdraw(3000);
        bank.displayBalance();
    }
}

