package homework_39;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

class FunctionalUtilsTest {

    @Test
    void shouldCheckIsPrimePredicate() {
        // прості числа
        Assertions.assertTrue(FunctionalUtils.isPrime.test(2));
        Assertions.assertTrue(FunctionalUtils.isPrime.test(3));
        Assertions.assertTrue(FunctionalUtils.isPrime.test(17));

        // не прості
        Assertions.assertFalse(FunctionalUtils.isPrime.test(1));
        Assertions.assertFalse(FunctionalUtils.isPrime.test(0));
        Assertions.assertFalse(FunctionalUtils.isPrime.test(9));
        Assertions.assertFalse(FunctionalUtils.isPrime.test(18));
    }

    @Test
    void shouldPrintFromZeroToNConsumer() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            FunctionalUtils.printToN.accept(3);
        } finally {
            System.setOut(originalOut); // повертаємо стандартний out
        }

        String output = outContent.toString().trim(); // "0\n1\n2\n3"

        String[] lines = output.split("\\R"); // розбиваємо по рядках
        Assertions.assertEquals(4, lines.length);
        Assertions.assertEquals("0", lines[0].trim());
        Assertions.assertEquals("1", lines[1].trim());
        Assertions.assertEquals("2", lines[2].trim());
        Assertions.assertEquals("3", lines[3].trim());
    }

    @Test
    void shouldReturnRandomDaySupplier() {
        List<String> days = List.of("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun");

        String day = FunctionalUtils.randomDay.get();

        Assertions.assertNotNull(day);
        Assertions.assertTrue(days.contains(day));
    }

    @Test
    void shouldRoundDoubleToLongFunction() {
        // given
        double value = 4.6;

        // when
        long result = FunctionalUtils.roundDouble.apply(value);

        // then
        Assertions.assertEquals(5L, result);
    }

    @Test
    void shouldCalculateFibonacciUnaryOperator() {

        Assertions.assertEquals(0, FunctionalUtils.fibonacci.apply(0));
        Assertions.assertEquals(1, FunctionalUtils.fibonacci.apply(1));
        Assertions.assertEquals(1, FunctionalUtils.fibonacci.apply(2));


        Assertions.assertEquals(5, FunctionalUtils.fibonacci.apply(5));
        Assertions.assertEquals(55, FunctionalUtils.fibonacci.apply(10));
    }
}
