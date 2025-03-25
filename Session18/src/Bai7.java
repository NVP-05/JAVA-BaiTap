import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        while (true) {
            System.out.print("Nhập số phần tử của mảng (N): ");
            N = scanner.nextInt();
            if (N > 0) {
                break;
            }
            System.out.println("N phải là số nguyên dương. Vui lòng nhập lại.");
        }
        int[] arr = new int[N];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            System.out.printf("Phần tử thứ %d: ", i + 1);
            arr[i] = scanner.nextInt();
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequencyMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println("\nSố lần xuất hiện của các phần tử (sắp xếp theo số lần xuất hiện tăng dần):");
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.printf("%d : %d\n", entry.getKey(), entry.getValue());
        }
    }
}
