import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer str = new StringBuffer();
        str.append(scanner.nextLine());
        StringBuilder lowerSb = new StringBuilder(str.toString().toLowerCase());
        if(lowerSb.toString().equals(str.reverse().toString())){
            System.out.println("Chuỗi đối xứng");
        }else{
            System.out.println("Chuôi không đối xứng");
        }
    }
}