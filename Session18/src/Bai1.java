import java.util.HashMap;
import java.util.Map;

public class Bai1 {
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Nguyen Van A", 90);
        studentScores.put("Tran Thi B", 85);
        studentScores.put("Le Van C", 78);
        studentScores.put("Pham Thi D", 92);
        studentScores.put("Hoang Van E", 88);
        System.out.println("Danh sách học sinh và điểm số:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Học sinh: " + entry.getKey() + ", Điểm: " + entry.getValue());
        }
        String searchName = "Nguyen Van A";
        if (studentScores.containsKey(searchName)) {
            System.out.println("Điểm số của " + searchName + ": " + studentScores.get(searchName));
        } else {
            System.out.println("Không tìm thấy học sinh " + searchName);
        }
    }
}
