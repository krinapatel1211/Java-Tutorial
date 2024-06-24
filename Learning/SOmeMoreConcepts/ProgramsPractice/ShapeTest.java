package Learning.SOmeMoreConcepts.ProgramsPractice;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10.5);
        System.out.println(circle.calculateArea());

        Square square = new Square(10);
        System.out.println(square.calculateArea());
    }
}
