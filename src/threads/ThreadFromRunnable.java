package threads;

import streams.PersonPopulate;

import java.util.concurrent.atomic.AtomicBoolean;

public class ThreadFromRunnable implements Runnable{

//    private final AtomicBoolean running = new AtomicBoolean();
//
//    public void stop(){
//        running.set(false);
//    }

    @Override
    public void run() {
//        running.set(true);

        for (int i = 0; i < 5; i++) {
            PersonPopulate.getPersonPopulate()
                    .stream()
                    .forEach(person -> System.out.println(person.toString()));

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
