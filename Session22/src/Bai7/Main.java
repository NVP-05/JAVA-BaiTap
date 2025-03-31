package Bai7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country(1, "AU", "Australia"));
        countryList.add(new Country(2, "CN", "China"));
        countryList.add(new Country(3, "AU", "Australia"));
        countryList.add(new Country(4, "CN", "China"));
        countryList.add(new Country(5, "JP", "Japan"));
        countryList.add(new Country(6, "CN", "China"));
        countryList.add(new Country(7, "JP", "Japan"));
        countryList.add(new Country(8, "TH", "Thailand"));
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Bai7.txt"))) {
            for (Country country : countryList) {
                writer.write(country.toString());
                writer.newLine();
            }
            System.out.println("Thêm quốc gia thành công vào file");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader("Bai7.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String code = parts[1].trim();
                    String name = parts[2].trim();
                    System.out.println("[  ID:  " + id + "   | CODE:  " + code + "   | NAME:  " + name + "   ]");
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}