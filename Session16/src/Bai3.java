import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            nums.add((int)(100 * Math.random()));
        }
        System.out.println("Array List: " + nums);
        
        int min = nums.getFirst();
        int max = nums.getFirst();
        for(int num: nums){
            max = Math.min(num, max);
            min = Math.max(num, min);
        }

        System.out.println("Số lớn nhất: " + max);
        System.out.println("Số nhỏ nhất: " + min);
    }
}
