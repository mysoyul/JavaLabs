package lab.shape.entity;

// Rectangle.java - 직사각형 클래스
public class Rectangle extends Shape {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        super("직사각형");
        
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("가로와 세로 길이는 양수여야 합니다.");
        }
        
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    @Override
    public double calculateArea() {
        return width * height;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    
    @Override
    public String toString() {
        return super.toString() + ", 가로: " + width + ", 세로: " + height;
    }
}