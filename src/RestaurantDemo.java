class Restaurant {
    private boolean orderPlaced = false;
    private boolean orderCooked = false;

    public synchronized void foodOrder(String orderName) {
        while (orderPlaced) {
            try {
                wait(); // Wait for the previous order to be received
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Waiter: Order received - " + orderName);
        orderPlaced = true;
        notifyAll(); // Notify the cook to start cooking
    }

    public synchronized void cookedOrder(String orderName) {
        while (!orderPlaced || orderCooked) {
            try {
                wait(); // Wait for the order to be placed and not yet cooked
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Cook: Order received - " + orderName);
        System.out.println("Cook: The cooking is under process.");
        orderCooked = true;
        notifyAll(); // Notify the customer that the order is ready
    }

    public synchronized void receivedOrder(String orderName) {
        while (!orderCooked) {
            try {
                wait(); // Wait for the order to be cooked
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Customer: Received order - " + orderName);
        orderPlaced = false;
        orderCooked = false;
        notifyAll(); // Notify the waiter to take the next order
    }
}

class CustomerThread extends Thread {
    private Restaurant restaurant;

    public CustomerThread(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        restaurant.receivedOrder("Order");
    }
}

class CookThread extends Thread {
    private Restaurant restaurant;

    public CookThread(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        restaurant.cookedOrder("Order");
    }
}

class WaiterThread extends Thread {
    private Restaurant restaurant;

    public WaiterThread(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        restaurant.foodOrder("Order");
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        CustomerThread customerThread = new CustomerThread(restaurant);
        CookThread cookThread = new CookThread(restaurant);
        WaiterThread waiterThread = new WaiterThread(restaurant);

        customerThread.start();
        cookThread.start();
        waiterThread.start();
    }
}
