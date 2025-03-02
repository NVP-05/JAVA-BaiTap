import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        boolean a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextBoolean();
        b = sc.nextBoolean();
        c = sc.nextBoolean();
        System.out.println( a && b? "Cả hai đều đúng" : "Hoạc a sai, hoặc b sai");
        System.out.println(a|| b? "Trong a, b có ít nhất 1 giâ trị đúng" : "a và b đều sai" );
        System.out.println(!c? "Phủ định của c là sai" : "Phủ định của c là đúng");
    }
}
