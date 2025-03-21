import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> words = new ArrayList<String>();
        System.out.print("Nhập độ dài mảng: ");
        int size = Integer.parseInt(sc.nextLine());

        while(size < 0){
            System.out.println("Độ dài mảng không được âm.");
            size = Integer.parseInt(sc.nextLine());
        }

        for(int i = 0; i < size; i++){
            System.out.printf("words[%d] = ",i + 1);
            words.add(sc.nextLine());
        }

        System.out.println("Danh sách trước khi sắp xếp");
        System.out.println(words);

        sortWords(words);

        System.out.println("Danh sách sau khi sắp xếp");
        System.out.println(words);
    }

    public static int compareWords(String w1, String w2) {
        if (w1.length() != w2.length()) {
            return w1.length() - w2.length();
        }
        return w1.compareTo(w2);
    }

    public static void sortWords(List<String> words) {
        int n = words.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (compareWords(words.get(i), words.get(j)) > 0) {
                    String temp = words.get(i);
                    words.set(i, words.get(j));
                    words.set(j, temp);
                }
            }
        }
    }
}
