package lesson_16_class_object;

import lesson_16_class_object.animals.Dragon;
import java.util.Scanner;

public class Main {
    static void main() {

        Dragon morgul = new Dragon();
        morgul.setName("Morgul");
        morgul.setAge(90);
        morgul.setWeight(365);

        System.out.println("Дракона звати: " + morgul.getName());
        System.out.println("Вік дракона: " + morgul.getAge());
        System.out.println("Вага дракона: " + morgul.getWeight());

        Dragon amour = new Dragon("Vhagar", 68, 338);

        System.out.println("Дракона звати: " + amour.getName());
        System.out.println("Вік дракона: " + amour.getAge());
        System.out.println("Вага дракона: " + amour.getWeight());

        System.out.println("Створено повноцінного дракона");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.println("🔥 Створимо своїх драконів!");
        System.out.print("Скільки драконів хочеш створити? ");
        int count = scanner.nextInt();
        scanner.nextLine();


        Dragon[] myDragons = new Dragon[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Створюємо дракона №" + (i + 1));

            System.out.print("Введіть ім'я дракона: ");
            String name = scanner.nextLine();

            System.out.print("Введіть вік дракона: ");
            int age = scanner.nextInt();

            System.out.print("Введіть вагу дракона: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();

            myDragons[i] = new Dragon(name, age, weight);
        }

        // 3. Виводимо всіх створених драконів
        System.out.println("=== Твої дракони ===");
        for (Dragon d : myDragons) {
            System.out.println("Ім'я: " + d.getName() + ", Вік: " + d.getAge() + ", Вага: " + d.getWeight());
        }

        System.out.println("=== Дракони ожили! ===");
        for (Dragon d : myDragons) {
            d.roar();
        }

        scanner.close();

        }

    }

