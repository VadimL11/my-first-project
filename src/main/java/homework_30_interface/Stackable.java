package homework_30_interface;

import java.util.Optional;

public interface Stackable {
     boolean isEmpty();
     boolean isFull();
     void push(int element);
     int pop();
     int peek();
    Optional<Integer> popOptional();
}
