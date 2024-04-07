package lesson8.get_and_set;

public class NotePadMain {
    public static void main(String[] args) {
        NotePad notePad = new NotePad();
   /*     notePad.countOfPages = 50;
        notePad.name = "ApplePaper";*/
        System.out.println(notePad.getCountOfPages());
        System.out.println(notePad.getName());
        notePad.setName("Apple Paper");
        notePad.setCountOfPages(50);
        System.out.println(notePad.getCountOfPages());
        System.out.println(notePad.getName());
    }
}
