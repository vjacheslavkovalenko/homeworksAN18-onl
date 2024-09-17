/*
 * Домашнее задание.
 ** Задание 12.2
 *** На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная строка является ключом,
 *** и ее значение равно true, если эта строка встречается в массиве 2 или более раз.
 *** Пример:
 **** wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
 **** wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
 **** wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */


import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
    public static void main(String[] args) {
        String[] words1 = {"a", "b", "a", "c", "b"};
        String[] words2 = {"c", "b", "a"};
        String[] words3 = {"c", "c", "c", "c"};

        System.out.println(wordMultiple(words1));
        System.out.println(wordMultiple(words2));
        System.out.println(wordMultiple(words3));
    }

    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        Map<String, Boolean> result = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (String word : wordCount.keySet()) {
            result.put(word, wordCount.get(word) >= 2);
        }

        return result;
    }
}