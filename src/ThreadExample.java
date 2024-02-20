public class ThreadExample {

    private static int[] arr = {1, 20, 50, 15, 30};

    public static void main(String[] args) {
        // Creating two threads
        Thread averageThread = new Thread(() -> {
            synchronized (ThreadExample.class) {
                findAverage();
            }
        });

        Thread squareThread = new Thread(() -> {
            synchronized (ThreadExample.class) {
                printSquare();
            }
        });

        // Starting the threads
        averageThread.start();
        squareThread.start();
    }

    private static void findAverage() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double average = sum / 10.0;
        System.out.println("Average of the first 10 numbers: " + average);
    }

    private static void printSquare() {
        System.out.print("Square of numbers in the array: ");
        for (int num : arr) {
            System.out.print(num * num + " ");
        }
        System.out.println();
    }
}
