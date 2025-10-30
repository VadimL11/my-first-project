package lesson_16_class_object;

import lesson_16_class_object.animals.Breed;
import lesson_16_class_object.animals.Dragon;
import java.util.Scanner;

public class Main {

    static void main() {

        Dragon morgul = new Dragon();
        morgul.setName("Morgul");
        morgul.setAge(90);
        morgul.setWeight(365);
        morgul.setBreed(Breed.WYVERN);

        System.out.println("Дракона звати: " + morgul.getName());
        System.out.println("Вік дракона: " + morgul.getAge());
        System.out.println("Вага дракона: " + morgul.getWeight());
        System.out.println("Порода дракона: " + morgul.getBreed());

        Dragon vhagar = new Dragon("Vhagar", 68, 338, Breed.AMPHITHERE);

        System.out.println("Дракона звати: " + vhagar.getName());
        System.out.println("Вік дракона: " + vhagar.getAge());
        System.out.println("Вага дракона: " + vhagar.getWeight());
        System.out.println("Порода дракона: " + vhagar.getBreed());

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

            System.out.println("Виберіть породу:");
            System.out.println("1 — WYVERN");
            System.out.println("2 — AMPHITHERE");
            System.out.println("3 — DRAKE");
            System.out.print("Ваш вибір: ");
            int breedChoice = scanner.nextInt();
            scanner.nextLine();

            Breed breed;
            switch (breedChoice) {
                case 1 -> breed = Breed.WYVERN;
                case 2 -> breed = Breed.AMPHITHERE;
                case 3 -> breed = Breed.DRAKE;
                default -> breed = Breed.WYVERN;
            }

            myDragons[i] = new Dragon(name, age, weight, breed);
        }

        // 3. Виводимо всіх створених драконів
        System.out.println("=== Твої дракони ===");
        for (Dragon d : myDragons) {
            System.out.println("Ім'я: " + d.getName() +
                               ", Вік: " + d.getAge() +
                               ", Вага: " + d.getWeight() +
                               ", Порода: " + d.getBreed());
        }

        System.out.println("=== Дракони ожили! ===");
        for (Dragon d : myDragons) {
            d.roar();
        }
        for (Dragon d : myDragons) {
            d.voice();
        }


        scanner.close();


        }

    }

