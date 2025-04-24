package lab.shape.entity;
// Shape.java - 추상 도형 클래스
public abstract class Shape {
    private String name;
    
    public Shape(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    // 면적 계산 추상 메소드
    public abstract double calculateArea();
    
    // 둘레 계산 추상 메소드
    public abstract double calculatePerimeter();
    
    @Override
    public String toString() {
        return name + " - 면적: " + String.format("%.2f", calculateArea()) + 
               ", 둘레: " + String.format("%.2f", calculatePerimeter());
    }
}