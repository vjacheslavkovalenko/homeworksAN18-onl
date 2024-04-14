public class Exercise3 {

    public static void main(String[] args) {
        int[] originalArray = {3, 1, 4, 1, 5, 9, 2, 6}; // Создаем массив из произвольных чисел
        int[] reversedArray = new int[originalArray.length]; // Создаем новый массив для хранения элементов в обратном порядке

// Копируем элементы из originalArray в reversedArray в обратном порядке
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i];
        }

// Выводим исходный и новый массивы
        System.out.println("Исходный массив: " + Arrays.toString(originalArray));
        System.out.println("Новый массив в обратном порядке: " + Arrays.toString(reversedArray));

}
//
// В данной программе мы создаем массив `originalArray` из произвольных чисел, затем создаем новый массив `reversedArray`
// для хранения элементов в обратном порядке. Мы копируем элементы из `originalArray` в `reversedArray` в обратном
// порядке, и затем выводим оба массива.

}
