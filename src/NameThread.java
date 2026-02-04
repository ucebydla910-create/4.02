class NamedThread extends Thread {
    public NamedThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Поток " + getName() + " начинает работу");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Поток " + getName() + ": выполнение " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Поток " + getName() + " завершил работу");
    }
}
