import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Bai5 {
    public static void main(String[] args) {
        List<Integer> normalList = List.of(10, 5, 8, 20, 7);
        List<Integer> singleElementList = List.of(10);
        List<Integer> allSameList = List.of(10, 10, 10);

        findSecondHeighestNumber(normalList);
        findSecondHeighestNumber(singleElementList);
        findSecondHeighestNumber(allSameList);
    }

    public static void findSecondHeighestNumber(List<Integer> list) {
        Optional<Integer> secondNumber = list.stream().distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst();
        if (secondNumber.isPresent()) {
            System.out.println("Số lớn thứ 2 là: " + secondNumber.get());
        } else System.out.println("Không có số lớn thứ 2");
    }
}
