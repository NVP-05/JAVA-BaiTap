import java.util.*;

public class Bai8 {
    public static void main(String[] args){
        int[] arr = {1, 5, 7, -1, 5, 4, 3, 2, 8, 6};
        int k = 6;
        Set<String> pairSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    int num1 = Math.min(arr[i], arr[j]);
                    int num2 = Math.max(arr[i], arr[j]);
                    pairSet.add(num1 + "," + num2);
                }
            }
        }
        List<int[]> sortedPairs = new ArrayList<>();
        for (String pair : pairSet) {
            String[] parts = pair.split(",");
            sortedPairs.add(new int[]{Integer.parseInt(parts[0]), Integer.parseInt(parts[1])});
        }
        for (int i = 1; i < sortedPairs.size(); i++) {
            int[] key = sortedPairs.get(i);
            int j = i - 1;
            while (j >= 0 && sortedPairs.get(j)[0] > key[0]) {
                sortedPairs.set(j + 1, sortedPairs.get(j));
                j--;
            }
            sortedPairs.set(j + 1, key);
        }
        for (int[] pair : sortedPairs) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]");
        }
    }
}
