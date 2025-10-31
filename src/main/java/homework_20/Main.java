package homework_20;

public class Main {
    static void main() {

        Car peugeot = new Car(13, 7, 2025);

        System.out.println(peugeot);
        System.out.println("Може їхати: " + peugeot.canDrive());
        System.out.println("Допущена: " + peugeot.isAllowedToDrive());
        System.out.println("Дистанція: " + peugeot.getRange() + " км");
    }
}