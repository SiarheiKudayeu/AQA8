package lesson12.exception.ex4;

public class Example4Task {
    /*
     * Создать класс с четырьмя методами checkString().
     * Метод 1 принимает в параметры строку и выбрасывает исключение, если количество символов в
     * этой строке нечетное.
     * Метод 2 принимает в параметры строку и выбрасывает исключение, если в этой строке есть
     * буквосочентани "exception".
     * Метод 3 принимает в параметры строку и выбрасывает исключение, если эта строка состоит из количества слов меньше 3.
     * Метод 4 внутри себя вызывает предыдущие три метода.
     *
     * Все исключения создать отдельными собственными классами.
     * */

    public class NechetLengthException extends Exception {
        public NechetLengthException(String message) {
            super(message);
        }
    }

    public class ContainsWordException extends Exception {
        public ContainsWordException(String message) {
            super(message);
        }
    }

    public class LessThatThreeWordsException extends Exception {
        public LessThatThreeWordsException(String message) {
            super(message);
        }
    }

    private void checkString1(String s) throws NechetLengthException {
        if (s.length() % 2 != 0) {
            throw new NechetLengthException("The count of words is nechet!!!");
        }
    }

    private void checkString2(String s) throws ContainsWordException {
        if (s.contains("exception")) {
            throw new ContainsWordException("String contains word \"exception\"!!!");
        }
    }

    private void checkString3(String s) throws LessThatThreeWordsException {
        if (s.split("\\s").length < 3) {
            throw new LessThatThreeWordsException("The count of words is less than 3 :(");
        }
    }

    public void checkString4(String s) throws ContainsWordException, LessThatThreeWordsException, NechetLengthException {
        checkString1(s);
        checkString2(s);
        checkString3(s);
    }
}
