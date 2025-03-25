import java.util.Map;
import java.util.TreeMap;

public class Bai4 {
    public static void main(String[] args) {
        TreeMap<String, Double> employeeSalaries = new TreeMap<>();
        employeeSalaries.put("NV001", 5000.0);
        employeeSalaries.put("NV002", 5500.0);
        employeeSalaries.put("NV003", 6000.0);
        employeeSalaries.put("NV004", 6500.0);
        employeeSalaries.put("NV005", 7000.0);
        System.out.println("Danh sách nhân viên và mức lương:");
        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
            System.out.println("Mã NV: " + entry.getKey() + ", Lương: " + entry.getValue());
        }
        if (employeeSalaries.containsKey("NV003")) {
            employeeSalaries.put("NV003", 6200.0);
            System.out.println("\nĐã cập nhật lương cho NV003.");
        } else {
            System.out.println("\nKhông tìm thấy nhân viên có mã NV003.");
        }
        if (employeeSalaries.containsKey("NV002")) {
            employeeSalaries.remove("NV002");
            System.out.println("\nĐã xóa nhân viên NV002 khỏi danh sách.");
        } else {
            System.out.println("\nKhông tìm thấy nhân viên có mã NV002.");
        }
        System.out.println("\nDanh sách nhân viên sau khi cập nhật:");
        for (Map.Entry<String, Double> entry : employeeSalaries.entrySet()) {
            System.out.println("Mã NV: " + entry.getKey() + ", Lương: " + entry.getValue());
        }
    }
}

