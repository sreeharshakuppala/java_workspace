
class Shape {

    @Override
    public String toString() {

        return calculatearea() + ":";

    }

    public double calculatearea() {
        return 0;

    }

}

class Circle extends Shape {

    double pie = Math.PI;
    int r = 6;

    @Override
    public double calculatearea() {

        return pie * r * r;
    }

    @Override
    public String toString() {

        return pie + ":" + r + ":" + calculatearea();

    }

}

class Rectangle extends Shape {

    int length = 6;
    int breadth = 3;

    @Override
    public double calculatearea() {

        return length * breadth;
    }

}

class Triangle extends Shape {

    int height = 12;
    int base = 6;

    @Override
    public double calculatearea() {

        return 0.5 * base * height;
    }

    @Override
    public String toString() {

        return height + ":" + base + ":" + calculatearea();

    }
}

public class polymorphysmupdated {

    public static void classnames(Shape s) {
        System.out.println(s.getClass().getName());

    }

    public static void main(String[] args) {
        Shape s = new Shape();

        classnames(s);

        s = new Circle();
        
        System.out.println(s.calculatearea());
        classnames(s);
        System.out.println(s);

        s = new Rectangle();
        
        System.out.println(s.calculatearea());
        classnames(s);
        System.out.println(s);

        s = new Triangle();

        System.out.println(s.calculatearea());
        classnames(s);
        System.out.println(s);

    }

}
