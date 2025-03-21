import java.util.*;

public class Bai7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>();

        System.out.print("Nhập độ dài mảng: ");
        int size = Integer.parseInt(sc.nextLine());

        while(size < 0){
            System.out.println("Độ dài mảng không được âm.");
            size = Integer.parseInt(sc.nextLine());
        }

        for(int i = 0; i < size; i++){
            System.out.printf("arr[%d] = ",i + 1);
            nums.add(Integer.parseInt(sc.nextLine()));
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.print("Các phần tử xuất hiện đúng 1 lần:");
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " ");
        }

        System.out.println("Các phần tử trùng lặp kèm số lần xuất hiện:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
            }
        }


    }
}
