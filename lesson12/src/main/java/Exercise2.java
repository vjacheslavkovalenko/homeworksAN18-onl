//Задание 2
//В этом задании мы создадим метод, который принимает массив строк и возвращает Map<String, Boolean>, где ключами являются строки, а значениями — true, если строка встречается 2 или более раз.


//Описание программы
//Метод wordMultiple:
//-Создает два Map: один для подсчета вхождений строк, другой — для результата.
//-Подсчитывает количество вхождений каждой строки в массиве.
//-Заполняет результирующий Map, устанавливая значение true, если строка встречается 2 или более раз.
//Метод main:
//-Тестирует метод wordMultiple с различными массивами строк и выводит результаты.


import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public static void main(String[] args) {
        String[] words1 = {"a", "b", "a", "c", "b"};
        String[] words2 = {"c", "b", "a"};
        String[] words3 = {"c", "c", "c", "c"};

        System.out.println(wordMultiple(words1)); // {"a": true, "b": true, "c": false}
        System.out.println(wordMultiple(words2)); // {"a": false, "b": false, "c": false}
        System.out.println(wordMultiple(words3)); // {"c": true}
    }

    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        Map<String, Boolean> result = new HashMap<>();

        // Подсчет количества вхождений каждой строки
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Заполнение результата
        for (String word : wordCount.keySet()) {
            result.put(word, wordCount.get(word) >= 2);
        }

        return result;
    }
}