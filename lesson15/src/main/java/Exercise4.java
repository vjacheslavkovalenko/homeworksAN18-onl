/*
 * Домашнее задание.
 ** Задание 15.4
 *** Есть два потока - один выводит в бесконечном цикле 3 раза цифру "1" (3 вызова System.out.println),
 *** а второй аналогично - цифру "2". Предусмотреть небольшую задержку.
 *** Задача - сделать синхронизацию потоков (пока один не закончит вывод трех чисел, второй будет ждать - не будет
 *** перемешивания).
 *** Проверить что в консоли вы получите поочередное выполнение потоков.
 */


public class Exercise4 {
    public static void main(String[] args) {
        Object lock = new Object();

        PrintOne thread1 = new PrintOne(lock);
        PrintTwo thread2 = new PrintTwo(lock);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Оба потока завершены.");
    }
}