import java.util.Random;

class Square implements Runnable {
    int x;

    Square(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        System.out.println("New thread " + x + " Square of " + x + " is : " + (x * x));
    }
}

class Cube implements Runnable {
    int x;

    Cube(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        System.out.println("New thread " + x + " cube of " + x + " is : " + (x * x * x));
    };
}

class MainThread extends Thread {
    public void run() {
        int num = 0;
        var random = new Random();

        try {
            for (int i = 0; i < 3; i++) {
                num = random.nextInt(20);
                System.out.println("Main thread and generated number is " + num);
                var thread1 = new Thread(new Square(num));
                thread1.start();
                var thread2 = new Thread(new Cube(num));
                thread2.start();
                Thread.sleep(1000);
                System.out.println("--------------------");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class Main {
    public static void main(String[] args) {
        var thread = new MainThread();
        thread.start();
    }
}