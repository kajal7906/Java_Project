
class PrintNumbersThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        PrintNumbersThread numberThread = new PrintNumbersThread();
        numberThread.start(); // Start the thread
        try {
            numberThread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done printing numbers.");
    }
}

