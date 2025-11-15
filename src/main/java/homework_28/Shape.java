package homework_28;

public abstract class Shape {

    public double calculateArea() {
        System.out.println("Площа не визначена");
        return 0;
    }

    public void displayInfo() {
        System.out.println("Фігура абстрактна");
    }

    public abstract double calculatePerimeter();
}
