public class PriorityDemo {
    public static void main(String[] args) {
        Thread lowPriorityThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Низкоприоритетный поток: итерация " + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        lowPriorityThread.setName("Low-Priority");
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);

        Thread highPriorityThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Высокоприоритетный поток: итерация " + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        highPriorityThread.setName("High-Priority");
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        lowPriorityThread.start();
        highPriorityThread.start();
    }
}
