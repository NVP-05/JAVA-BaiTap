package Bai9;

class BankAccount {
    private String accountId;
    private double balance;

    public BankAccount() {
        this.accountId = "";
        this.balance = 0;
    }

    public BankAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    // Getter và Setter
    public String getAccountId() {
        return accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Phương thức gửi tiền
    public void deposit(double amount) throws Exception {
        if(amount <= 0) {
            throw new Exception("Số tiền gửi phải là số dương!");
        }
        balance += amount;
        System.out.println("Gửi tiền thành công. Số dư mới: " + balance);
    }

    // Phương thức rút tiền
    public void withdraw(double amount) throws Exception {
        if(amount <= 0) {
            throw new Exception("Số tiền rút phải là số dương!");
        }
        if(amount > balance) {
            throw new Exception("Số tiền rút vượt quá số dư!");
        }
        balance -= amount;
        System.out.println("Rút tiền thành công. Số dư mới: " + balance);
    }

    // Phương thức chuyển tiền
    public void transfer(BankAccount dest, double amount) throws Exception {
        if(dest == null) {
            throw new Exception("Tài khoản chuyển đến không tồn tại!");
        }
        if(amount <= 0) {
            throw new Exception("Số tiền chuyển phải là số dương!");
        }
        if(amount > balance) {
            throw new Exception("Số tiền chuyển vượt quá số dư!");
        }
        // Thực hiện chuyển tiền
        balance -= amount;
        dest.balance += amount;
        System.out.println("Chuyển tiền thành công. Số dư mới của tài khoản " + accountId + ": " + balance);
    }
}


