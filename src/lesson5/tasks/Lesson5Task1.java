package lesson5.tasks;

public class Lesson5Task1 {
    public static void main(String[] args) {
        String program = "Git";
        String OS = "Winsdsdv";
        switch (program){
            case ("Idea"):{
                switch (OS){
                    case ("Mac"):
                        System.out.println("Mac Link Idea");
                        break;
                    case ("Win"):
                        System.out.println("Win Link Idea");
                        break;
                    case ("Lin"):
                        System.out.println("Lin Link Idea");
                        break;
                    default:
                        System.out.println("Os not found!!!");
                        break;
                }
                break;
            }
            case ("Git"):{
                switch (OS){
                    case ("Mac"):
                        System.out.println("Mac Link Git");
                        break;
                    case ("Win"):
                        System.out.println("Win Link Git");
                        break;
                    case ("Lin"):
                        System.out.println("Lin Link Git");
                        break;
                    default:
                        System.out.println("Os not found!!!");
                        break;
                }
                break;
            }
            case ("Java"):{
                switch (OS){
                    case ("Mac"):
                        System.out.println("Mac Link Java");
                        break;
                    case ("Win"):
                        System.out.println("Win Link Java");
                        break;
                    case ("Lin"):
                        System.out.println("Lin Link Java");
                        break;
                    default:
                        System.out.println("Os not found!!!");
                        break;
                }
                break;
            }
            default:
                System.out.println("Program not found!!!");
                break;
        }
    }
}
