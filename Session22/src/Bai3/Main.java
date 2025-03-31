package Bai3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String str = "Welcom to Thanh Hoa";
        String inputFileName = "input.txt";
        String copyFileName = "copy.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFileName))) {
            writer.write(str);
            System.out.println("Đã tạo file " + inputFileName + " và ghi nội dung thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(copyFileName))){
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Đã sao chép nội dung từ " + inputFileName + " sang " + copyFileName);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}