import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder(scanner.nextLine());
        StringBuilder trimedSb = new StringBuilder(str.toString().trim());
        String[] words = trimedSb.toString().split(" ");
        for(int i = words.length - 1; i >= 0; i--){
            System.out.printf("%s", words[i]);
            if(i > 0){
                System.out.printf(" ");
            }
        }
    }
}