/*
 * Домашнее задание.
 ** Задание 15.3
 *** Создать поток демон и проверить его работу.
 */


public class Exercise3 {
    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Основной поток завершен.");
    }
}