package lab.shape.entity;

// Circle.java - 원 클래스
public class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        super("원");
        this.radius = radius;
        
        if (radius <= 0) {
            throw new IllegalArgumentException("반지름은 양수여야 합니다.");
        }
    }
    
    public double getRadius() {
        return radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", 반지름: " + radius;
    }
}