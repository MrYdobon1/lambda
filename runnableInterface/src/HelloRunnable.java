public class HelloRunnable {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Hello, Good Morning");
        }).start();


    }
}