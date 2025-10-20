package lesson_11_switch;

public class Main {

    static void main() {

        int days = 2;

        switch (days) {

            case 1 -> System.out.println("Понеділок");
            case 2 -> System.out.println("Вівторок");
            case 3 -> System.out.println("Середа");
            case 4 -> System.out.println("Четвер");
            case 5 -> System.out.println("П'ятниця");
            case 6 -> System.out.println("Субота");
            case 7 -> System.out.println("Неділя");
            default -> System.out.println("Немає такого тижня");

        }

    }
}

