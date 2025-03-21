import java.util.*;

public class Bai5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> nums = new ArrayList<Integer>();

        System.out.print("Nhập độ dài mảng: ");
        int size = Integer.parseInt(input.nextLine());

        while(size < 0){
            System.out.print("Độ da mảng không được âm.");
            size = Integer.parseInt(input.nextLine());
        }

        for(int i = 0; i < size; i++){
            System.out.printf("arr[%d] = ",i + 1);
            nums.add(Integer.parseInt(input.nextLine()));
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue() + " lần");
        }
    }
}
