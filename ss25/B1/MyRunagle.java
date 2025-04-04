package ss25.B1;

class MyRunagle implements Runnable {
    @Override
    public void run() {
        Account a = Account.getInsance();
        System.out.println(a);
    }
}