package lesson13.exception.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalCabinet {
    public static void main(String[] args) {
        PersonalCabinet personalCabinet = new PersonalCabinet();
        personalCabinet.startWork();
    }

    /* Создать класс PersonalCabinet, в котором создать приватное поле login типа ArrayLIst.
     * Создать конструктор по умолчанию, который будет присваивать значение для login пустого массива размерностью 0.
     * Создать метод, который будет принимать в параметры следующие значения типа enums (REGISTRATION, AUTHENTICATION, LOGOUT, INCORRECT).
     *
     * Суть программы:
     * Пользователю предлагают ввести с клавиатуры действие до тех пор, пока он не введет слово STOP.
     * Если он вводит REGISTRATION, то у него просят ввести новый логин для этого пользователя, программа проверяет есть ли данный логин
     * в массиве login и если такого нет выводит сообщение типа "{newLogin} congratulation. You've been created new account".
     * А также добавляет этот введенный логин в массив login.
     * Если такой логин уже есть в массиве, то выбрасывается исключение типа DuplicateLoginException,которое нужно создать отдельно.
     * Также если пользователь вводит логин длиннее чем 20 символов то выбрасывается исключение типа LongFieldException,которое нужно создать отдельно.
     *
     * Если пользователь вводит AUTHENTICATION, то у пользователя просят ввести с клавиатуры его Логин,
     * программа проверяет есть ли данный логин в массиве login и если такой есть выводит сообщение типа: "Welcome back, {Логин}".
     * В противном случае выводит сообщение типа: "Invalid login".
     *
     * Если пользователь вводит LOGOUT то в консоль выводится сообщение типа: "See you soon".
     *
     * Если пользователь вводит другие данные, то в консоль выводится сообщение типа: "Incorrect action". */

    private ArrayList<String> login;

    public PersonalCabinet() {
        this.login = new ArrayList<>();
    }

    public enum Actions {
        REGISTRATION, AUTHENTICATION, LOGOUT, INCORRECT
    }

    public class DuplicateLoginException extends Exception {
        public DuplicateLoginException(String message) {
            super(message);
        }
    }

    public class LongFieldException extends Exception {
        public LongFieldException(String message) {
            super(message);
        }
    }

    private boolean isLoginExist(String login) {
        return this.login.contains(login);
    }

    private void addNewLoginToArrayList(String newLogin) {
        login.add(newLogin);
    }

    private void action(Actions actions) throws DuplicateLoginException, LongFieldException {
        Scanner scanner = new Scanner(System.in);
        switch (actions) {
            case REGISTRATION -> {
                System.out.println("Insert new login:");
                String newLogin = scanner.nextLine();
                if (isLoginExist(newLogin)) {
                    throw new DuplicateLoginException("This login is already used");
                }
                if (newLogin.length() > 20) {
                    throw new LongFieldException("This login is too long...");
                }
                addNewLoginToArrayList(newLogin);
                System.out.println("Congratulations. You've added new user!");
            }
            case AUTHENTICATION -> {
                System.out.println("Insert login to enter the system:");
                String login = scanner.nextLine();
                if (isLoginExist(login)) {
                    System.out.println("Welcome back, " + login);
                } else {
                    System.out.println("Invalid login");
                }
            }
            case LOGOUT -> System.out.println("See you soon");
            case INCORRECT -> System.out.println("Incorrect action");
        }
    }

    public void startWork() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert some action:");
        String actionString = scanner.nextLine();
        while (!actionString.equals("STOP")) {
            Actions actions;
            if (actionString.equals("REGISTRATION")){
                actions = Actions.REGISTRATION;
            }else if (actionString.equals("AUTHENTICATION")){
                actions = Actions.AUTHENTICATION;
            }else if (actionString.equals("LOGOUT")){
                actions = Actions.LOGOUT;
            }else {
                actions = Actions.INCORRECT;
            }
            try {
                action(actions);
            } catch (DuplicateLoginException | LongFieldException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Insert some action:");
            actionString = scanner.nextLine();
        }
    }
}
