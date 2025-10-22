package lesson_12_loops;

public class Main {

    static void main() {

        int[] arr = {-3, 7, 5, -100, 66, 4, 9, 20};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

