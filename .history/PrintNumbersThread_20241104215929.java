import java.util.Th
public class PrintNumbersThread implements Runnable {

    @Override
    public void run() {
        // Print numbers from 0 to 4
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                // Sleep for a short time to simulate some work
                Thread.sleep(500); // 500 milliseconds
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
                System.out.println("Thread was interrupted");
            }
        }
    }

    public static void main(String[] args) {
        // Create a new thread
        Thread thread = new Thread(new PrintNumbersThread());
        
        // Start the thread
        thread.start();
        
        // Optional: Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }
        
        System.out.println("Thread execution completed.");
    }
}

