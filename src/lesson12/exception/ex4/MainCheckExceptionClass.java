package lesson12.exception.ex4;

public class MainCheckExceptionClass {
    public static void main(String[] args) throws Example4Task.LessThatThreeWordsException {
        Example4Task task = new Example4Task();
        try {
            task.checkString4("Anyww except2ion");
        } catch (Example4Task.ContainsWordException | Example4Task.NechetLengthException e){
            System.out.println(e.getMessage());
        }

    }
}
