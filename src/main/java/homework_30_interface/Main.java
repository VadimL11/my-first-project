package homework_30_interface;

public class Main {

     static void main() {

        Stack stack = new Stack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.push(40);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.pop());
    }
}
