public class MultiThreadDemo {
    public static void main(String[] args) {
        // Поток через наследование
        SimpleThread thread1 = new SimpleThread();

        // Потоки через Runnable
        Thread thread2 = new Thread(new RunnableTask(), "Thread-B");
        Thread thread3 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Поток C: Работа " + i);
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-C");

        // Переименуем первый поток для наглядности
        thread1.setName("Thread-A");

        // Запускаем все потоки
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
