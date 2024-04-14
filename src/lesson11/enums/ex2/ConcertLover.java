package lesson11.enums.ex2;

public class ConcertLover {
    private String name;
    private int amountOfMoney;

    public ConcertLover(String name, int amountOfMoney) {
        this.name = name;
        this.amountOfMoney = amountOfMoney;
    }

    public void chooseConcert() {
        if (amountOfMoney < Groups.METALLICA.getCostOfTicket()) {
            System.out.println(name + ", please stay at home...");
        } else if (amountOfMoney < Groups.ACDC.getCostOfTicket()) {
            System.out.println(name + ", you can go to " + Groups.METALLICA + ".");
        } else if (amountOfMoney < Groups.QUEEN.getCostOfTicket()) {
            System.out.println(name + ", you can go to " + Groups.ACDC + ".");
        } else {
            System.out.println("You can go to every concert");
        }
    }
}
