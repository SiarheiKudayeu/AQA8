package lesson13.exception.ex1;

public class WorkerMain {
    public static void main(String[] args) {
        Worker alex = new Worker("Alex", 2000, 0);
        try {
            alex.canHaveParty(DaysOfWeek.SATURDAY);
        }catch (LowSalaryException | NotWeekEndException | WithoutFriendsException ex){
            System.out.println(ex.getMessage());
        }
    }
}
