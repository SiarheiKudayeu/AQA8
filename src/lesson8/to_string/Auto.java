package lesson8.to_string;

public class Auto {
    /*4)Создать класс Auto. В данном классе создать поле String name, int price, boolean isNew
создать геттеры и сеттеры для данных полей, а также конструктор класса,
принимающий в параметры все поля данного класса.
*/
    public static void main(String[] args) {
        Auto auto = new Auto("Opel", 20000, false);
        String autoInfo = auto.toString();
        System.out.println(autoInfo);
    }
    private String name;
    private int price;

    public Auto(String name, boolean isNew) {
        this.name = name;
        this.isNew = isNew;
    }

    private boolean isNew;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }



    public Auto(String name, int price, boolean isNew) {
        this.name = name;
        this.price = price;
        this.isNew = isNew;
    }
    @Override
    public String toString(){
        if(isNew){
            return "Auto with name " + name + " costs " + price + ". Car is NEW!!!";
        }else {
            return "Auto with name " + name + " costs " + price + ". Car is NOT NEW!!!";
        }
    }
    /*    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                '}';
    }*/

}

