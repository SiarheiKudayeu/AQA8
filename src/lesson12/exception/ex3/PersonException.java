package lesson12.exception.ex3;

import java.util.Scanner;

public class PersonException {
    public static void main(String[] args) {
        PersonException person = new PersonException();
        try {
            person.name = person.askName();
        }catch (SiarheiNameException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Check!!!!");

    }

    public String name;


    public String askName() throws SiarheiNameException{
        System.out.println("Input name for person:");
        String name = new Scanner(System.in).nextLine();
        if(name.equals("Siarhei")){
            throw new SiarheiNameException();
        }else {
            return name;
        }
    }
}
