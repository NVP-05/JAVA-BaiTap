import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if(n < 0){
            System.out.println("Giá trị không hợp lệ.");
            return;
        }
        String characters = "ABCDEFGHabcdefgh0123456789";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            int index = (int) (Math.random() * characters.length());
            sb.append(characters.charAt(index));
        }
        System.out.println(sb.toString());
    }
}