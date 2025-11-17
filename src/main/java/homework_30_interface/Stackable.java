package homework_30_interface;

public interface Stackable {
     boolean isEmpty();
     boolean isFull();
     void push(int element);
     int pop();
     int peek();
}
