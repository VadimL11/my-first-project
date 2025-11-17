package homework_28;

public class Main {

    static void main() {

        Shape circle = new Circle(5);
        circle.displayInfo();

        System.out.println("------------------");

        Shape rectangle = new Rectangle(4, 7);
        rectangle.displayInfo();
    }
}

