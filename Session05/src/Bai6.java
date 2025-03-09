import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] originalArray = new int[20];
        int[] markingArray = new int[1000];
        int max = 0;

        for (int i = 0; i < originalArray.length; i++) {
            System.out.print("arr[" + i + "] = ");
            originalArray[i] = sc.nextInt();
            markingArray[originalArray[i]]++;
        }
        for(int i = 0; i < markingArray.length; i++){
            max = Math.max(max, markingArray[i]);
        }
        for(int i = 0; i < markingArray.length; i++){
            if (markingArray[i] == max) {
                System.out.println("Phần tử " + i + " xuất hiện " + max + " lần" );
            }
        }
    }
}