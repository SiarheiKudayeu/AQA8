package lesson13.exception.ex1;

public class LowSalaryException extends Exception {
    public LowSalaryException(String message) {
        super(message);
    }
}
