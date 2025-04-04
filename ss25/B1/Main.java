package ss25.B1;

public class Main {
    public static void main(String[] args) {

        Account a = Account.getInsance();
        Thread t1 = new Thread(new MyRunagle());
        Thread t2 = new Thread(new MyRunagle());
        t1.start();
        t2.start();
//        Account a2 = Account.getInsance();
//        Account a3 = Account.getInsance();
//        System.out.println(a.getName());
//        a2.setName("abc");
//        System.out.println(a2.getName());
//        System.out.println(a3.getName());
    }

}
