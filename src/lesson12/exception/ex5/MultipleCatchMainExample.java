package lesson12.exception.ex5;

public class MultipleCatchMainExample {
    public static void main(String[] args) {
        try {
            System.out.println("try");
        } catch ( ArithmeticException | NullPointerException e){
            System.out.println("exception");
        }
    }
}
