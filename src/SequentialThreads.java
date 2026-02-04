public class SequentialThreads {
    public static void main(String[] args) {
        Thread firstThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Первый поток: Сообщение " + i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread secondThread = new Thread(() -> {
            System.out.println("Второй поток начинает работу после первого");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Второй поток: Действие " + i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        firstThread.start();
        try {
            firstThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        secondThread.start();
    }
}
