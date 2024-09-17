/*
 * Домашнее задание.
 ** Задание 14
 *** Есть стрим из чисел.
 *** Необходимо взять n-количество подряд идущих чисел и определить сколько в них четных, а сколько нечетных.
 *** Так же посчитать сумму четных и нечетных чисел.
 *** Результат представить в виде map<Type, Integer>.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Main{
    public static void main(String[] args) {
        int n = 20;

        Map<String, Integer> result = IntStream.rangeClosed(1, n)
                .boxed()
                .reduce(new HashMap<String, Integer>(), (map, number) -> {

                    if (number % 2 == 0) {
                        map.put("evenCount", map.getOrDefault("evenCount", 0) + 1);
                        map.put("evenSum", map.getOrDefault("evenSum", 0) + number);
                    } else {
                        map.put("oddCount", map.getOrDefault("oddCount", 0) + 1);
                        map.put("oddSum", map.getOrDefault("oddSum", 0) + number);
                    }
                    return map;
                }, (map1, map2) -> {
                    map1.put("evenCount", map1.getOrDefault("evenCount", 0) + map2.getOrDefault("evenCount", 0));
                    map1.put("evenSum", map1.getOrDefault("evenSum", 0) + map2.getOrDefault("evenSum", 0));
                    map1.put("oddCount", map1.getOrDefault("oddCount", 0) + map2.getOrDefault("oddCount", 0));
                    map1.put("oddSum", map1.getOrDefault("oddSum", 0) + map2.getOrDefault("oddSum", 0));
                    return map1;
                });

        System.out.println("Результат:");
        System.out.println("Количество четных чисел: " + result.get("evenCount"));
        System.out.println("Сумма четных чисел: " + result.get("evenSum"));
        System.out.println("Количество нечетных чисел: " + result.get("oddCount"));
        System.out.println("Сумма нечетных чисел: " + result.get("oddSum"));
    }
}