package homework_30_interface;

public class StackFullException extends RuntimeException {
    public StackFullException(String message) {
        super(message);
    }
}
