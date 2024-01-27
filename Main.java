package OOP_Seminar1.Home_work_1;
// Егай, гр. 5284
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double circleArea = circle.calculateArea();
        double circlePerimeter = circle.calculatePerimeter();
        System.out.println("Площадь круга: " + circleArea);
        System.out.println("Периметр круга: " + circlePerimeter);

        Rectangle rectangle = new Rectangle(3, 4);
        double rectangleArea = rectangle.calculateArea();
        double rectanglePerimeter = rectangle.calculatePerimeter();
        System.out.println("Площадь прямоугольника: " + rectangleArea);
        System.out.println("Периметр прямоугольника: " + rectanglePerimeter);

        Square square = new Square(5);
        double squareArea = square.calculateArea();
        double squarePerimeter = square.calculatePerimeter();
        System.out.println("Площадь квадрата: " + squareArea);
        System.out.println("Периметр квадрата: " + squarePerimeter);
    }
}
