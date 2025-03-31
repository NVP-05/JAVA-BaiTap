package Bai5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("bai5.txt"))) {
            writer.write("Văn Lâm");
            writer.newLine();
            writer.write("Tiến Linh");
            writer.newLine();
            writer.write("Xuân Son");
            writer.newLine();
            writer.write("Hoàng Đức");
            writer.newLine();
            writer.write("Văn Hâu");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("bai5.txt"))) {
            String line;
            List<String> listStr = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                listStr.add(line);
            }

            String maxStr = null;
            int max = listStr.get(0).length();

            for (String str : listStr) {
                if (str.length() > max) {
                    max = str.length();
                    maxStr = str;
                }
            }
            System.out.printf("Tên dài nhất là: %s với độ dài %d ký tự", maxStr, max);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}