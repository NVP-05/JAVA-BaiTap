package Bai6;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1 (Ưu tiên thấp)");
        MyThread thread2 = new MyThread("Thread 2 (Ưu tiên trung bình)");
        MyThread thread3 = new MyThread("Thread 3 (Ưu tiên cao)");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
        thread3.start();
    }
    /*
    Mức độ ưu tiên không đảm bảo 100% thứ tự thực hiện giữa các luồng. Bởi vì:

    1. Mức độ ưu tiên chỉ là gợi ý cho JVM, không bắt buộc phải tuân theo thứ tự đó.

    2. Việc lập lịch trình của CPU phụ thuộc vào hệ điều hành và thuật toán quản lý luồng.

    3. Một số hệ thống có thể bỏ qua mức ưu tiên, đặc biệt nếu tài nguyên CPU bị giới hạn.

    4. Nếu một luồng có mức ưu tiên cao nhưng một luồng ưu tiên thấp đã chiếm CPU, luồng ưu tiên cao vẫn phải chờ.
     */
}