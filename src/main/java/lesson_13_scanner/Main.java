package lesson_13_scanner;

import java.util.Scanner;

public class Main {
    static void main() {

        // Зчитати з клавіатури розмір масиву n. (n x m - для сміливих)
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        // Створити масив цілих чисел і заповнити його даними користувача.
        int[] num = new int[n];
        // Вивести текстове меню

        for (int i = 0; i < num.length; i++) {
            System.out.print("Введіть число №" + (i + 1) + ":");
            num[i] = scanner.nextInt();
        }

        while (true) {

            System.out.println("1 - Порахувати суму елементів");
            System.out.println("2 - Знайти середнє арифметичне");
            System.out.println("3 - Знайти найбільший елемент");
            System.out.println("4 - Знайти найменший елемент");
            System.out.println("5 - Завершити програму");

            System.out.print("Ваш вибір: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Сума елементів
                    int sum = 0;
                    for (int value : num) {
                        sum += value;
                    }
                    System.out.println("Сума елементів: " + sum);
                    break;

                case 2: // Середнє арифметичне
                    double total = 0;
                    for (int value : num) {
                        total += value;
                    }
                    double average = total / num.length;
                    System.out.println("Середнє арифметичне: " + average);
                    break;

                case 3: // Найбільший елемент
                    int max = num[0];
                    for (int value : num) {
                        if (value > max) {
                            max = value;
                        }
                    }
                    System.out.println("Найбільший елемент: " + max);
                    break;

                case 4: // Найменший елемент
                    int min = num[0];
                    for (int value : num) {
                        if (value < min) {
                            min = value;
                        }
                    }
                    System.out.println("Найбільший елемент: " + min);
                    break;

                case 5:
                    System.out.println("Програму завершено.");
                    return; // або break якщо хочеш вийти з while іншим способом

                default: // Невірний вибір
                    System.out.println("Невірний вибір, спробуйте ще раз.");

            }
        }
    }
}