/*
 * Домашнее задание.
 ** Задание
 *** Создать класс CreditCard c полями номер счета, текущая сумма на счету.
 *** Добавьте метод, который позволяет начислять сумму на кредитную карточку.
 *** Добавьте метод, который позволяет снимать с карточки некоторую сумму.
 *** Добавьте метод, который выводит текущую информацию о карточке.
 *** Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
 **** Тестовый сценарий для проверки:
 **** Положите деньги на первые две карточки и снимите с третьей.
 **** Выведите на экран текущее состояние всех трех карточек
 *
 *
 *
 *
 * Написать программу со следующим функционалом:
На вход передать строку (будем считать, что это номер документа).
Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
а y — это буква.
- Вывести на экран в одну строку два первых блока по 4 цифры.
- Вывести на экран номер документа, но блоки из трех букв заменить
на *** (каждая буква заменятся на *).
- Вывести на экран только одни буквы из номера документа в
формате yyy/yyy/y/y в нижнем регистре.
- Вывести на экран буквы из номера документа в формате
"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
класса StringBuilder).
- Проверить содержит ли номер документа последовательность abc и
вывети сообщение содержит или нет(причем, abc и ABC считается
одинаковой последовательностью).
- Проверить начинается ли номер документа с последовательности
555.
- Проверить заканчивается ли номер документа на
последовательность 1a2b.
Все эти методы реализовать в отдельном классе в статических методах,
которые на вход (входным параметром) будут принимать вводимую на
вход программы строку.
 */



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Viacheslav)))");
    }
}
/////////////////////////////////
public class DocumentNumberProcessor {

    public static void processDocumentNumber(String documentNumber) {
        // Вывести на экран в одну строку два первых блока по 4 цифры
        System.out.println("First two blocks: " + getFirstTwoBlocks(documentNumber));

        // Вывести на экран номер документа, но блоки из трех букв заменить на ***
        System.out.println("Modified document number: " + replaceLetterBlocks(documentNumber));

        // Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре
        System.out.println("Letters in lowercase: " + getLettersInLowercase(documentNumber));

        // Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
        System.out.println("Letters in uppercase: " + getLettersInUppercase(documentNumber));

        // Проверить содержит ли номер документа последовательность abc и вывети сообщение содержит или нет
        if (containsABC(documentNumber)) {
            System.out.println("Document number contains 'abc' or 'ABC'.");
        } else {
            System.out.println("Document number does not contain 'abc' or 'ABC'.");
        }

        // Проверить начинается ли номер документа с последовательности 555
        if (startsWithFiveFiveFive(documentNumber)) {
            System.out.println("Document number starts with '555'.");
        } else {
            System.out.println("Document number does not start with '555'.");
        }

        // Проверить заканчивается ли номер документа на последовательность 1a2b
        if (endsWithOneATwoBee(documentNumber)) {
            System.out.println("Document number ends with '1a2b'.");
        } else {
            System.out.println("Document number does not end with '1a2b'.");
        }
    }

    private static String getFirstTwoBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        return blocks[0] + "-" + blocks[1];
    }

    private static String replaceLetterBlocks(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        StringBuilder modifiedNumber = new StringBuilder();
        for (int i = 0; i < blocks.length; i++) {
            if (blocks[i].matches("[a-zA-Z]+")) {
                modifiedNumber.append("***");
            } else {
                modifiedNumber.append(blocks[i]);
            }
            if (i < blocks.length - 1) {
                modifiedNumber.append("-");
            }
        }
        return modifiedNumber.toString();
    }

    private static String getLettersInLowercase(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        StringBuilder letters = new StringBuilder();
        for (int i = 1; i < blocks.length; i += 2) {
            letters.append(blocks[i].toLowerCase());
            if (i < blocks.length - 1) {
                letters.append("/");
            }
        }
        return letters.toString();
    }

    private static String getLettersInUppercase(String documentNumber) {
        String[] blocks = documentNumber.split("-");
        StringBuilder letters = new StringBuilder("Letters:");
        for (int i = 1; i < blocks.length; i += 2) {
            letters.append(blocks[i].toUpperCase());
            if (i < blocks.length - 1) {
                letters.append("/");
            }
        }
        return letters.toString();
    }

    private static boolean containsABC(String documentNumber) {
        return documentNumber.toLowerCase().contains("abc");
    }

    private static boolean startsWithFiveFiveFive(String documentNumber) {
        return documentNumber.startsWith("555");
    }

    private static boolean endsWithOneATwoBee(String documentNumber) {
        return documentNumber.endsWith("1a2b");
    }

    public static void main(String[] args) {
        String documentNumber = "1234-abc-5678-def-9a1b";
        processDocumentNumber(documentNumber);
    }
}
