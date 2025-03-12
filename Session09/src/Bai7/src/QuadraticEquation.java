public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant(){
        return ((Math.pow(this.b, 2) - 4* this.a * this.c));
    }

    public boolean hasRealRoots(){
        return this.getDiscriminant() >= 0;
    }

    public double getRoot1(){
        if(this.hasRealRoots()) {
            return (-b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
        }
        return Double.NaN;
    }

    public double getRoot2(){
        if(this.hasRealRoots()) {
            return (-b - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
        }
        return Double.NaN;
    }

    public void display(){
        System.out.println("Phương trình " + a + "x^2 + " + b + "x + " + c);

        double delta = this.getDiscriminant();
        if(delta < 0){
            System.out.println("Phương trình không có nghiệm thực");
        }else if(delta == 0){
            System.out.println("Phương trình có nghiệm kép: " + this.getRoot1());
        }else{
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.println("x1 = " + this.getRoot1());
            System.out.println("x2 = " + this.getRoot2());
        }
    }
}
