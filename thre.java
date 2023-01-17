class thred extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId());
        } catch (Exception e) {
            System.out.println("Invalid");
        }
    }
}

public class thre {
    public static void main(String args[]) {
        int i = 5;
        for (int j = 0; j < i; j++) {
            thred ob = new thred();
            ob.start();
        }
    }
}
