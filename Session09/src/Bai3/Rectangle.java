public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
        this.width = this.height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return (2 * (this.width + this.height));
    }

    public void display(){
        System.out.printf("Chiều dài: %.1f, Chiều rộng: %.1f, Chu vi: %.1f, Diện tích: %.1f\n", this.width, this.height, this.getPerimeter(), this.getArea());
    }
}