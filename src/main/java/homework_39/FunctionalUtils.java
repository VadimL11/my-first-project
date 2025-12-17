package homework_39;

import java.util.List;
import java.util.Random;
import java.util.function.*;


public class FunctionalUtils {

    // Predicate
    public static Predicate<Integer> isNegative = number -> number < 0;

    // Consumer
    public static Consumer<Cat> prettyPrintCat = cat ->
            System.out.println("Cat{name='" + cat.getName() + "', age=" + cat.getAge() + "}");


    // Supplier
    public static Supplier<Integer> randomNumber = () -> new Random().nextInt(100);
    public static Supplier<Integer> throwsNullPointer = () -> { throw new NullPointerException(); };


    // Function
    public static Function<Integer, String> intToString = n -> String.valueOf(n);

    public static Function<Cat, Raccoon> catToRaccoon = cat ->
            new Raccoon(cat.getName(), cat.getAge());


    // UnaryOperator
    public static UnaryOperator<Double> squareRoot = n -> Math.sqrt(n);

    public static UnaryOperator<Integer> factorial = n -> {
        int result = 1;
        for (int i = 2; i <= n; i++) { result *= i; }
        return result;
    };



    // Predicate
    public static Predicate<Integer> isPrime = num -> {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    };

    // Consumer
    public static Consumer<Integer> printToN = n -> {
        for (int i = 0; i <= n; i++) System.out.println(i);
    };

    // Supplier
    public static Supplier<String> randomDay = () -> {
        List<String> days = List.of("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");
        return days.get(new Random().nextInt(days.size()));
    };

    // Function
    public static Function<Double, Long> roundDouble = x -> Math.round(x);

    // UnaryOperator
    public static UnaryOperator<Integer> fibonacci = n -> {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    };
}
