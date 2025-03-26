import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai5 {
    public static void countString(List<String> string){
        int count = 0;
        for(String s : string){
            if(s.startsWith("A") && s.length() >= 5){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng chuỗi: ");
        int numOfString = Integer.parseInt(sc.nextLine());

        List<String> newString = new ArrayList<>();
        for(int i = 0; i < numOfString; i++){
            newString.add(sc.nextLine());
        }
        countString(newString);
    }
}