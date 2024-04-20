import java.util.Arrays;

public class Exercise3 {

    public static void main(String[] args) {
        int[] originalArray = {13, 1, 4, 11, 25, 9, 2, 6};
        int[] reversArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            reversArray[i] = originalArray[originalArray.length - 1 - i];
        }

      System.out.println(" Массив исходный: " + Arrays.toString(originalArray));
        System.out.println(" Массив в обратном порядке: " + Arrays.toString(reversArray));

    }

}