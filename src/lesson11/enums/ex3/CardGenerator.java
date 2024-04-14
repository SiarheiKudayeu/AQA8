package lesson11.enums.ex3;

import java.util.Arrays;
import java.util.Random;

public class CardGenerator {

    //Написать программу генератор случайной карты, которая будет иметь
    // статический метод  printRandomCard() вывода в консоль случайно сгенерированной карты.
    //Создать два отдельных  Enum CardsTypes, CardValues.
    //CardsTypes может быть четырех видов ♦, ♠, ♣, ♥.
    // CardValues : SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;
    //Создать класс Card, который в параметры конструктора будет принимать аргументы типа CardsTypes, CardValues

    private enum CardsTypes{
        HEART("♥"), CLUB("♣"), SPADE("♠"), DIAMOND("♦");
        public String type;

        CardsTypes(String type) {
            this.type = type;
        }
    }
    private static CardsTypes getRandomType(){
        CardsTypes[] cardsTypes = CardsTypes.values();
        return cardsTypes[new Random().nextInt(cardsTypes.length)];
    }
    private enum CardValues{
        SIX("SIX"), SEVEN("SEVEN"), EIGHT("EIGHT"), NINE("NINE"), TEN("TEN"), JACK("JACK"), QUEEN("QUEEN"), KING("KING"), ACE("ACE");
        public String value;

        CardValues(String value) {
            this.value = value;
        }
    }
    private static CardValues getRandomCardValue(){
        CardValues[] cardValues = CardValues.values();
        return cardValues[new Random().nextInt(cardValues.length)];
    }
    private static class Card{
        public CardsTypes cardsTypes;
        public CardValues cardValues;

        private Card(CardsTypes cardsTypes, CardValues cardValues) {
            this.cardsTypes = cardsTypes;
            this.cardValues = cardValues;
        }

        @Override
        public String toString() {
            return cardsTypes.type + cardValues.value;
        }
    }

    public static void printRandomCard(){
        CardGenerator.Card card = new CardGenerator.Card(CardGenerator.getRandomType(), CardGenerator.getRandomCardValue());
        System.out.println(card);
    }
}
