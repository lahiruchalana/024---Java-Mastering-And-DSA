package threads;

public class Main {

    public static void main(String[] args) {
        ThreadFromRunnable threadFromRunnable = new ThreadFromRunnable();
        Thread newThread = new Thread(threadFromRunnable); // we have to use Thread object in here, when we are using Runnable Interface.
        // when we are using Thread Class we do not need to add this type of Thread object here

        newThread.start();
    }
}
