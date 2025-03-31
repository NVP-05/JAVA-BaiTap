package Bai1;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi văn bản: ");
        String input = scanner.nextLine();
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(input);
            System.out.println("Ghi vào file output.txt thành công!");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
        try (FileReader reader = new FileReader("output.txt");
             BufferedReader br = new BufferedReader(reader)) {
            String line;
            System.out.println("Nội dung file output.txt:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}

