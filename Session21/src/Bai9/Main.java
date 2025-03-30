package Bai9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static BankAccount findAccountById(List<BankAccount> accounts, String accountId) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountId().equals(accountId)) {
                return acc;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new BankAccount("A001", 1000000));
        accounts.add(new BankAccount("A002", 500000));
        accounts.add(new BankAccount("A003", 2000000));

        while (true) {
            System.out.println("******** Hệ thống giao dịch ngân hàng ********");
            System.out.println("1. Gửi tiền");
            System.out.println("2. Rút tiền");
            System.out.println("3. Chuyển tiền");
            System.out.println("4. Xem số dư các tài khoản");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Bạn phải nhập một số hợp lệ cho lựa chọn!");
                continue;
            }

            try {
                switch (choice) {
                    case 1: // Gửi tiền
                        System.out.print("Nhập số tài khoản: ");
                        String accIdDeposit = scanner.nextLine();
                        BankAccount accDeposit = findAccountById(accounts, accIdDeposit);
                        if (accDeposit == null) {
                            throw new Exception("Tài khoản không tồn tại!");
                        }
                        System.out.print("Nhập số tiền gửi: ");
                        double depositAmount = Double.parseDouble(scanner.nextLine());
                        accDeposit.deposit(depositAmount);
                        break;

                    case 2: // Rút tiền
                        System.out.print("Nhập số tài khoản: ");
                        String accIdWithdraw = scanner.nextLine();
                        BankAccount accWithdraw = findAccountById(accounts, accIdWithdraw);
                        if (accWithdraw == null) {
                            throw new Exception("Tài khoản không tồn tại!");
                        }
                        System.out.print("Nhập số tiền rút: ");
                        double withdrawAmount = Double.parseDouble(scanner.nextLine());
                        accWithdraw.withdraw(withdrawAmount);
                        break;

                    case 3: // Chuyển tiền
                        System.out.print("Nhập số tài khoản nguồn: ");
                        String sourceId = scanner.nextLine();
                        BankAccount sourceAcc = findAccountById(accounts, sourceId);
                        if (sourceAcc == null) {
                            throw new Exception("Tài khoản nguồn không tồn tại!");
                        }
                        System.out.print("Nhập số tài khoản đích: ");
                        String destId = scanner.nextLine();
                        BankAccount destAcc = findAccountById(accounts, destId);
                        if (destAcc == null) {
                            throw new Exception("Tài khoản đích không tồn tại!");
                        }
                        System.out.print("Nhập số tiền chuyển: ");
                        double transferAmount = Double.parseDouble(scanner.nextLine());
                        sourceAcc.transfer(destAcc, transferAmount);
                        break;

                    case 4: // Xem số dư các tài khoản
                        System.out.println("Danh sách tài khoản:");
                        for (BankAccount acc : accounts) {
                            System.out.println("Tài khoản " + acc.getAccountId() + " - Số dư: " + acc.getBalance());
                        }
                        break;

                    case 5:
                        System.out.println("Thoát chương trình.");
                        return;

                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }
}
