public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1.0;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public void display(){
        System.out.printf("Bán kính: %.2f, Chu vi: %.2f, Diện tích: %.2f\n", this.radius, this.getArea(), this.getCircumference());
    }
}
