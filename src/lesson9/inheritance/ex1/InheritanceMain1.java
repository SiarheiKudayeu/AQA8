package lesson9.inheritance.ex1;

public class InheritanceMain1 {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        Telegram telegram = new Telegram();
        messenger.sendMessage();
        telegram.sendStickers();
    }
}
