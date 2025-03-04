import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Kiem tra so nguyen to");
            System.out.println("2. Kiem tra so hoan hao");
            System.out.println("3. Tinh tong cac uoc cua so");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon (1-4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhap so nguyen duong: ");
                    int numPrime = scanner.nextInt();
                    if (numPrime <= 1) {
                        System.out.println(numPrime + " khong phai so nguyen to");
                    } else {
                        boolean isPrime = true;
                        for (int i = 2; i <= Math.sqrt(numPrime); i++) {
                            if (numPrime % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            System.out.println(numPrime + " la so nguyen to");
                        } else {
                            System.out.println(numPrime + " khong phai so nguyen to");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Nhap so nguyen duong: ");
                    int numPerfect = scanner.nextInt();
                    if (numPerfect <= 0) {
                        System.out.println("Vui long nhap so nguyen duong!");
                    } else {
                        int sum = 0;
                        for (int i = 1; i < numPerfect; i++) {
                            if (numPerfect % i == 0) {
                                sum += i;
                            }
                        }
                        if (sum == numPerfect) {
                            System.out.println(numPerfect + " la so hoan hao");
                        } else {
                            System.out.println(numPerfect + " khong phai so hoan hao");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Nhap so nguyen duong: ");
                    int numDivisors = scanner.nextInt();
                    if (numDivisors <= 0) {
                        System.out.println("Vui long nhap so nguyen duong!");
                    } else {
                        int sumDivisors = 0;
                        System.out.print("Cac uoc cua " + numDivisors + " la: ");
                        for (int i = 1; i <= numDivisors; i++) {
                            if (numDivisors % i == 0) {
                                System.out.print(i + " ");
                                sumDivisors += i;
                            }
                        }
                        System.out.println("\nTong cac uoc: " + sumDivisors);
                    }
                    break;

                case 4:
                    System.out.println("Tam biet!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le! Vui long chon tu 1-4.");
            }
        } while (choice != 4);
    }
}