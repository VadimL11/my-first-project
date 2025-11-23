package homework_30_interface;


import java.util.Optional;

public class Stack implements Stackable {

    private int[] data;
    private int top;

    public Stack(int size) {
        data = new int[size];
        top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == data.length - 1;
    }

    @Override
    public void push(int element) {
        if (isFull()) {
            throw new StackFullException("Стек повний!");

        }

        top++;
        data[top] = element;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            throw new StackEmptyException("Стек порожній!");

        }

        int value = data[top];
        top--;
        return value;

    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new StackEmptyException("Стек порожній!");

        }

        return data[top];


    }

    @Override
    public Optional<Integer> popOptional() {
        if (isEmpty()) {
            return Optional.empty();
        }

        int value = data[top];
        top--;
        return Optional.of(value);
    }
}