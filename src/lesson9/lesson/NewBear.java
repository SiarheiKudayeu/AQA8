package lesson9.lesson;

public class NewBear {
      /*
Создать класс Bear. В нем поля имя, возраст и пол. Поля приватные.
Создать конструктор для задания имени и пола. Для Возраста задать
геттеры и сеттеры.
Создать метод voice, который выводит в консоль сообщение "RRRRRRRR!!!!"

Создать метод makeBabyBear, который в свои параметры требует объект
класса Bear, строку и boolean.
Если пол у медведей совпадает, то тогда возвращается новый медведь с пустым именем.
(поле пол можете оставить любым). Если пол разный, то возвращается новы медведь
с именем и полом, которые он получает из аргументов переданных в параметры метода.

Переопределить метод toString() который в случае если у медведя поле имени равно
null, возвращает строку типа: "Я не мог быть рожден", в противном случае он
возвращает информацию о медведе.
*/
      private String name;
    private boolean ifMale;
    private int age;

    public NewBear(String name, boolean ifMale) {
        this.name = name;
        this.ifMale = ifMale;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void voice (){
        System.out.println("RRRRR!");
    }
    public NewBear makeBabeBear(NewBear partner, String newString, boolean newBoolean){
        if(this.ifMale == partner.ifMale){
            return new NewBear(null, false);
        }
        else{
            return new NewBear(newString, newBoolean);
        }
    }

    @Override
    public String toString() {
        if (name==null){
            return "Я не мог быть рождён";
        }
        else {
            return "Имя медведя " + name + ". Возраст медведя " + age;
        }
    }

    public static void main(String[] args) {
        NewBear misha = new NewBear("Misha", true);
        NewBear arina = new NewBear("Arina", false);
        NewBear oleg = new NewBear("Oleg", true);
        NewBear child1 = misha.makeBabeBear(arina, "Alex", true);
        NewBear child2 = oleg.makeBabeBear(misha, "Evgen", false);
        System.out.println(child1);
        System.out.println(child2);
    }
}

