class MessageThread extends Thread {
    private String message;
    private int times;

    public MessageThread(String message, int times) {
        this.message = message;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(message + " - " + (i + 1));
            try {
                Thread.sleep(500);  // Pause for 0.5 seconds for clarity
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        MessageThread thread1 = new MessageThread("Thread 1 message", 5);
        MessageThread thread2 = new MessageThread("Thread 2 message", 5);

        thread1.start();
        thread2.start();
    }
}
