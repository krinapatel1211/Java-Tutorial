package Learning.SOmeMoreConcepts.com.example.util;

import Learning.SOmeMoreConcepts.com.example.geometry.Circle;
import Learning.SOmeMoreConcepts.com.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);

        System.out.println(circle.calculateArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setBreadth(20);
        System.out.println(rectangle.calculateArea());
        
    }

}
