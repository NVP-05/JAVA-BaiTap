import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bai1 {
    public static void main(String[] args){
        List<String> students = new ArrayList<>();

        students.add("Nguyễn Phúc");
        students.add("Minh");
        students.add("Lương");
        students.add("Hiếu");
        students.add("Hiệp");

        System.out.print("Duyệt bằng for");
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }

        System.out.print("Duyệt băng for-each");
        for(String student : students ){
            System.out.println(student);
        }

        System.out.print("Duyệt Iterator");
        Iterator<String> iterator = students.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
