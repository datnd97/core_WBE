package CircleExam;

public class SimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of "+circle1.radius+" and area is: "+circle1.getArea());
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of "+circle2.radius+" and area is: "+circle2.getArea());
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of " + circle3.radius + " and area is: "+circle3.getArea());
        circle2.radius = 10;
        System.out.println("The area of "+ circle2.radius + " and area is: "+circle2.getArea());
    }

    double radius;

    public SimpleCircle() {
        radius = 1;
    }
    public SimpleCircle(double newRadius) {
        radius = newRadius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getPerimeter() {
        return  2 * radius * Math.PI;
    }
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
}