package Bai6;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("bai6.txt"))){
            writer.write("Hello PTIT");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("bai6.txt"))) {
            String line;
            StringBuilder builder = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            System.out.println("Chuỗi sau khi đảo ngược là: " + builder.reverse());
        }catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
