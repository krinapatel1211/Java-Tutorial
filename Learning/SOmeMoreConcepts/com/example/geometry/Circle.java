package Learning.SOmeMoreConcepts.com.example.geometry;

public class Circle {
    private int radius;
    final double PI = 3.142;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public double calculateArea(){
        return (PI*Math.pow(getRadius(), 2));
    }
}
