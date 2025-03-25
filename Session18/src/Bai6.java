import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bai6 {
    public static void main(String[] args) {
        Map<String, Double> studentScores = new LinkedHashMap<>();
        studentScores.put("Nguyễn Văn A", 7.5);
        studentScores.put("Trần Thị B", 8.0);
        studentScores.put("Lê Văn C", 4.5);
        studentScores.put("Phạm Thị D", 6.0);
        studentScores.put("Hoàng Văn E", 9.0);
        studentScores.put("Đặng Thị F", 3.5);
        studentScores.put("Bùi Văn G", 5.0);
        studentScores.put("Ngô Thị H", 7.0);
        studentScores.put("Dương Văn I", 6.5);
        studentScores.put("Vũ Thị J", 8.5);
        System.out.println("Danh sách học sinh và điểm số:");
        for (Entry<String, Double> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        double totalScore = 0;
        for (double score : studentScores.values()) {
            totalScore += score;
        }
        double averageScore = totalScore / studentScores.size();
        System.out.printf("\nĐiểm trung bình của tất cả học sinh: %.2f\n", averageScore);
        Iterator<Entry<String, Double>> iterator = studentScores.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Double> entry = iterator.next();
            if (entry.getValue() < 5.0) {
                iterator.remove();
            }
        }
        System.out.println("\nDanh sách học sinh sau khi xóa những người có điểm dưới 5:");
        for (Entry<String, Double> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
