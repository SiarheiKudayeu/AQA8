package lesson13.exception.ex1;

public class Worker {
    private String name;
    private int salary;
    private int countOfFriends;

    public Worker(String name, int salary, int countOfFriends) {
        this.name = name;
        this.salary = salary;
        this.countOfFriends = countOfFriends;
    }

    public String getName() {
        return name;
    }

    private void isDayOff(DaysOfWeek day) throws NotWeekEndException {
        if(day.equals(DaysOfWeek.SUNDAY) || day.equals(DaysOfWeek.SATURDAY)){
            System.out.println("Greetings, WEEKEND!!!");
        }else {
            throw new NotWeekEndException("Today is a working day. GO TO WORK!!!");
        }
    }

    private void ieSalaryEnough() throws LowSalaryException {
        if(salary < 3000){
            throw new LowSalaryException("Please save your money....");
        }else {
            System.out.println("All is good with salary...");
        }
    }

    private void doYouHaveFriends() throws WithoutFriendsException {
        if (countOfFriends <=0){
            throw new WithoutFriendsException("You are so lonely...");
        }else {
            System.out.println("Friends are ready!!!");
        }
    }

    public void canHaveParty(DaysOfWeek day) throws LowSalaryException, WithoutFriendsException, NotWeekEndException {
        ieSalaryEnough();
        doYouHaveFriends();
        isDayOff(day);
        System.out.println("Let's have a party!!!");
    }
}
