

//Описание программы
//Создается класс DemoThread, который является демоном и выполняет бесконечный цикл.
//Основной поток работает 5 секунд, после чего завершается, и вместе с ним завершается демон-поток.


class DemoThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Демон-поток работает.");
            try {
                Thread.sleep(1000); // Задержка для демонстрации
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Task3 {
    public static void main(String[] args) {
        DemoThread demoThread = new DemoThread();
        demoThread.setDaemon(true); // Установка потока как демона
        demoThread.start();

        // Основной поток работает 5 секунд
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Основной поток завершен.");
    }
}