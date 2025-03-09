import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập URL: ");
        String url = sc.nextLine();

        if (url.startsWith("http://") || url.startsWith("https://")) {
            int domainStart = url.indexOf("://") + 3;
            int pathStart = url.indexOf("/", domainStart);

            String protocol = url.substring(0, domainStart - 3);
            String domain = (pathStart != -1) ? url.substring(domainStart, pathStart) : url.substring(domainStart);
            String path = (pathStart != -1) ? url.substring(pathStart) : "/";

            if (!domain.isEmpty()) {
                System.out.println("Giao thức: " + protocol);
                System.out.println("Tên miền: " + domain);
                System.out.println("Đường dẫn: " + path);
            } else {
                System.out.println("URL không hợp lệ.");
            }
        } else {
            System.out.println("URL không hợp lệ.");
        }
    }
}