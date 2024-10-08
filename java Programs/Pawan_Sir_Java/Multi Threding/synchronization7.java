public class synchronization7 {
    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        Thread thread1 = new Thread(new Task(resource1, resource2));
        Thread thread2 = new Thread(new Task(resource2, resource1));

        thread1.start();
        thread2.start();
    }
}

class Resource {
    // No need to define static locks; each Resource object serves as its own lock.
}

class Task implements Runnable {
    private final Resource resource1;
    private final Resource resource2;

    public Task(Resource resource1, Resource resource2) {
        this.resource1 = resource1;
        this.resource2 = resource2;
    }

    @Override
    public void run() {
        synchronized (resource1) {
            System.out.println(Thread.currentThread().getName() + " locked " + resource1);

            // Simulate some work with resource1
            try { Thread.sleep(100); } catch (InterruptedException e) {}

            synchronized (resource2) {
                System.out.println(Thread.currentThread().getName() + " locked " + resource2);
            }
        }
    }
}

}
