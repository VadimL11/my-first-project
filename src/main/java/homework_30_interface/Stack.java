package homework_30_interface;

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
            System.out.println("Стек повний!");
            return;
        }

        top++;
        data[top] = element;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Стек порожній!");
            return -1;
        }

        int value = data[top];
        top--;
        return value;

    }

    @Override
    public int peek() {
        if (isEmpty()) {
            System.out.println("Стек порожній!");
            return -1;
        }

        return data[top];
    }
}