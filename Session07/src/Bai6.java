import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Hello";
        StringBuilder word = new StringBuilder(str);
        StringBuffer sb = new StringBuffer(word);
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            str.concat(" world!");
        }
        long end = System.currentTimeMillis();
        System.out.println("String: " + (end - start));
        start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            word.append(" world!");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (end - start));
        start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            sb.append(" world!");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer: " + (end - start));
    }
}