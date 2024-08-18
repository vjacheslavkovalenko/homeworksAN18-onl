
//Для решения задачи, где необходимо взять n подряд идущих чисел из стрима, определить количество четных и нечетных чисел, а также посчитать их сумму, мы можем воспользоваться Java Stream API. Результат будет представлен в виде Map<Type, Integer>, где Type будет представлять тип числа (четное или нечетное).

//Описание программы
//Импорт необходимых классов:
//HashMap и Map для хранения результатов.
//IntStream для работы с потоками чисел.
//Основной метод main:
//Определяется количество подряд идущих чисел n.
//Используется IntStream.rangeClosed(1, n) для получения n подряд идущих чисел, начиная с 1.
//Применяется метод reduce для подсчета четных и нечетных чисел, а также их сумм:
//В качестве аккумулятора используется HashMap, в который добавляются значения для четных и нечетных чисел.
//Внутри лямбда-выражения проверяется, является ли число четным или нечетным, и соответствующие значения обновляются.
//Второй параметр в reduce используется для объединения результатов, если поток разбивается на части (что не требуется в данном случае, но полезно для параллельной обработки).
//Вывод результата:
//Результаты выводятся на консоль, показывая количество и сумму четных и нечетных чисел.


import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class EvenOddCounter {
    public static void main(String[] args) {
        int n = 20; // Количество подряд идущих чисел

        // Получаем n подряд идущих чисел, начиная с 1
        Map<String, Integer> result = IntStream.rangeClosed(1, n)
                .boxed() // Преобразуем IntStream в Stream<Integer>
                .reduce(new HashMap<String, Integer>(), (map, number) -> {
                    // Определяем, четное или нечетное
                    if (number % 2 == 0) {
                        map.put("evenCount", map.getOrDefault("evenCount", 0) + 1);
                        map.put("evenSum", map.getOrDefault("evenSum", 0) + number);
                    } else {
                        map.put("oddCount", map.getOrDefault("oddCount", 0) + 1);
                        map.put("oddSum", map.getOrDefault("oddSum", 0) + number);
                    }
                    return map;
                }, (map1, map2) -> {
                    // Сливаем два результата
                    map1.put("evenCount", map1.getOrDefault("evenCount", 0) + map2.getOrDefault("evenCount", 0));
                    map1.put("evenSum", map1.getOrDefault("evenSum", 0) + map2.getOrDefault("evenSum", 0));
                    map1.put("oddCount", map1.getOrDefault("oddCount", 0) + map2.getOrDefault("oddCount", 0));
                    map1.put("oddSum", map1.getOrDefault("oddSum", 0) + map2.getOrDefault("oddSum", 0));
                    return map1;
                });

        // Вывод результата
        System.out.println("Результат:");
        System.out.println("Количество четных чисел: " + result.get("evenCount"));
        System.out.println("Сумма четных чисел: " + result.get("evenSum"));
        System.out.println("Количество нечетных чисел: " + result.get("oddCount"));
        System.out.println("Сумма нечетных чисел: " + result.get("oddSum"));
    }
}