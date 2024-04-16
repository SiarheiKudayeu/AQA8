package lesson12.exception.ex3;

public class SiarheiNameException extends Exception {
    @Override
    public String getMessage() {
        return "Don't input name Siarhei";
    }
}
