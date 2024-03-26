package lesson4.switch_case;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        //Developer, QA, Designer, Analytic
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your profession???");
        String profession = scanner.nextLine();
        switch (profession.toLowerCase()) {
            case ("qa"):
            case ("aqa"):
                if (profession.equalsIgnoreCase("aqa")) {
                    profession = profession + " automation master!!!";
                }
                System.out.println("Hello " + profession);
                break;
            case ("developer"):
                System.out.println("Hello developer!!!");
                System.out.println("Do you work with backend???");
                String result = scanner.nextLine();
                switch (result){
                    case ("yes"):
                        System.out.println("Hello Back!!!");
                        break;
                    case ("no"):
                        System.out.println("Hello Front!!!");
                        break;
                }
                break;
            case ("designer"):
                System.out.println("Hello Designer");
                break;
            case ("analytic"):
                System.out.println("Hello Analytic");
                break;
            default:
                System.out.println("There is no such profession!!!");
                break;
        }
    }
}
