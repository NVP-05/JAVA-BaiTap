import java.util.*;

public class Bai7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();
        String[] words = s.toLowerCase().split("\\W+");
        Set<String> uniqueWords = new HashSet<>();
        for(String word : words){
            uniqueWords.add(word);
        }
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        Collections.sort(wordList);
        Map<String, Integer> wordCount = new LinkedHashMap<>();
        for (String word : wordList) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
