public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double caculateMagnitude(){
        return Math.sqrt(x * x + y * y);
    }

    public Vector2D add(Vector2D v){
        return new Vector2D(this.x + v.x, this.y + v.y);
    }

    public Vector2D sub(Vector2D v){
        return new Vector2D(this.x - v.x, this.y - v.y);
    }

    public Vector2D dotProduct(Vector2D v){
        return new Vector2D(this.x * v.x, this.y * v.y);
    }

    public void displayVector(){
        System.out.printf("(%.2f, %.2f)\n", this.x, this.y);
    }
}
