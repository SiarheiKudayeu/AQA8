package lesson8.get_and_set;

public class NotePad {
    public static void main(String[] args) {
        NotePad v = new NotePad();
        System.out.println(v.name);
    }
    private String name;

    private int countOfPages;

    public String getName() {
        return name;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCountOfPages(int countOfPages){
        this.countOfPages = countOfPages;
    }
}
