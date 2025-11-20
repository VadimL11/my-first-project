package homework_30_interface;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}