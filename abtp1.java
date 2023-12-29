abstract class shape{
    abstract void shape();
    String color;
    boolean filled;
    double radius;

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        return "Shape [color=" + color + ", filled=" + filled + ", radius=" + radius + "]";
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class abtp1{
    public static void main(String[] args) {
        shape circle = new shape();
        circle.setRadius(5.0);
        circle.setColor("Red");
        circle.setFilled(true);

        // circle.getColor();
        // circle.getArea();
        // circle.isFilled();
        System.out.println(circle.toString());
        // System.out.println("Circle Color: " + circle.getColor());
        // System.out.println("Is Circle Filled? " + circle.isFilled());
        // System.out.println("Circle Area: " + circle.getArea());
    }
}
