import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String inputString = "";
        int[] array = new int[100];

        do {
            System.out.println("===== MENU CHÍNH =====");
            System.out.println("1. Xử lý chuỗi");
            System.out.println("2. Xử lý số nguyên");
            System.out.println("3. Thoát chương trình");
            System.out.print("Chọn chức năng (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                int stringChoice;
                do {
                    System.out.println("===== MENU XỬ LÝ CHUỖI =====");
                    System.out.println("1. Nhập chuỗi");
                    System.out.println("2. Loại bỏ khoảng trắng thừa trong chuỗi");
                    System.out.println("3. Đếm số lần xuất hiện của từng ký tự");
                    System.out.println("4. Chuyển đổi chuỗi thành dạng chuẩn");
                    System.out.println("5. Quay lại menu chính");
                    System.out.print("Chọn chức năng (1-5): ");
                    stringChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (stringChoice == 1) {
                        System.out.print("Nhập chuỗi: ");
                        inputString = scanner.nextLine();
                    } else if (stringChoice == 2) {
                        System.out.println("Chuỗi sau khi loại bỏ khoảng trắng thừa: " + inputString.replaceAll("\\s+", " ").trim());
                    } else if (stringChoice == 3) {
                        int[] count = new int[256];
                        for (char c : inputString.toCharArray()) count[c]++;
                        for (int i = 0; i < 256; i++)
                            if (count[i] > 0) System.out.println((char) i + ": " + count[i]);
                    } else if (stringChoice == 4) {
                        String[] words = inputString.split("\\s+");
                        StringBuilder sb = new StringBuilder();
                        for (String word : words) {
                            if (!word.isEmpty())
                                sb.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
                        }
                        System.out.println("Chuỗi chuẩn hóa: " + sb.toString().trim());
                    }
                } while (stringChoice != 5);
            } else if (choice == 2) {
                int numberChoice;
                do {
                    System.out.println("===== MENU XỬ LÝ MẢNG SỐ NGUYÊN =====");
                    System.out.println("1. Nhập mảng số nguyên");
                    System.out.println("2. Tìm số nguyên tố lớn nhất trong mảng");
                    System.out.println("3. Đếm số phần tử có chữ số đầu tiên là số lẻ");
                    System.out.println("4. Kiểm tra mảng có phải là mảng đối xứng không");
                    System.out.println("5. Quay lại menu chính");
                    System.out.print("Chọn chức năng (1-5): ");
                    numberChoice = scanner.nextInt();

                    if (numberChoice == 1) {
                        System.out.print("Nhập số phần tử của mảng: ");
                        int n = scanner.nextInt();
                        array = new int[n];
                        for (int i = 0; i < n; i++) {
                            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                            array[i] = scanner.nextInt();
                        }
                    } else if (numberChoice == 2) {
                        int maxPrime = -1;
                        for (int num : array) {
                            if (num < 2) continue;
                            boolean isPrime = true;
                            for (int i = 2; i <= Math.sqrt(num); i++) {
                                if (num % i == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                            if (isPrime) maxPrime = Math.max(maxPrime, num);
                        }
                        System.out.println("Số nguyên tố lớn nhất: " + maxPrime);
                    } else if (numberChoice == 3) {
                        int count = 0;
                        for (int num : array) {
                            int firstDigit = Integer.parseInt(Integer.toString(num).substring(0, 1));
                            if (firstDigit % 2 != 0) count++;
                        }
                        System.out.println("Số lượng phần tử có chữ số đầu tiên là số lẻ: " + count);
                    } else if (numberChoice == 4) {
                        boolean symmetric = true;
                        for (int i = 0; i < array.length / 2; i++) {
                            if (array[i] != array[array.length - 1 - i]) {
                                symmetric = false;
                                break;
                            }
                        }
                        System.out.println("Mảng đối xứng: " + (symmetric ? "Có" : "Không"));
                    }
                } while (numberChoice != 5);
            }
        } while (choice != 3);

        System.out.println("Thoát chương trình!");
        scanner.close();
    }
}