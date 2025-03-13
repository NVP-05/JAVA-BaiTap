package Bai5;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5);
        myCircle.displayCircleInfo();
        Cylinder myCylinder = new Cylinder(5, 10);
        myCylinder.displayCylinderInfo();
        myCircle.setRadius(7);
        myCylinder.setRadius(7);
        myCylinder.setHeight(15);
        myCircle.displayCircleInfo();
        myCylinder.displayCylinderInfo();
        myCircle.setRadius(-10);
        myCylinder.setHeight(-20);
    }
}

