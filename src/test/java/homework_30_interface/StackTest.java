package homework_30_interface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class StackTest {

    @Test
    void shouldThrowExceptionWhenStackIsFull() {
        // given
        Stack stack = new Stack(1);
        stack.push(10);

        // then + when
        Assertions.assertThrows(StackFullException.class, () -> stack.push(20));
    }

    @Test
    void shouldThrowExceptionWhenStackIsEmptyOnPop() {
        // given
        Stack stack = new Stack(3);

        // then + when
        Assertions.assertThrows(StackEmptyException.class, stack::pop);
    }

    @Test
    void shouldThrowExceptionWhenStackIsEmptyOnPeek() {
        // given
        Stack stack = new Stack(3);

        // then + when
        Assertions.assertThrows(StackEmptyException.class, stack::peek);
    }

    @Test
    void shouldReturnEmptyOptionalWhenStackIsEmpty() {
        // given
        Stack stack = new Stack(3);

        // then
        Optional<Integer> result = stack.popOptional();

        //when
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    void shouldReturnOptionalWithValueWhenNotEmpty() {
        // given
        Stack stack = new Stack(3);
        stack.push(100);

        // then
        Optional<Integer> result = stack.popOptional();

        //when
        Assertions.assertTrue(result.isPresent());
        Assertions.assertEquals(100, result.get());
    }
}

