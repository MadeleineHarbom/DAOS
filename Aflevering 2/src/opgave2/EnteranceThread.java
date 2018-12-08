package opgave2;

import java.util.concurrent.Semaphore;

public class EnteranceThread extends Thread {
    //jeg er producer, tilfojer til koe
    //skal traekke billet med random intervaller
    //peterson
    public Common c;
    public int indgang;

    public EnteranceThread(int indgang, Common common) {
        this.indgang = indgang;
        this.c = common;
    }

    @Override
    public void run() {
        try {
            c.sem.acquire();
        }
        catch (Exception e) {
            System.out.println("Hello, my name is Bob, and I am an aquire-exception");
            System.out.println("Hello, Bob");
        }
        // Entering critical
        int nr = c.getKoeNummer();
        System.out.println("Jeg bruger indgang " + this.indgang);
        System.out.println("Jeg fik nummer " +  nr);
        //leaving critical
        c.sem.release(); //nullpointer


    }

    public void getService() {
        int r1 = (int) Math.abs(Math.random()*1000);
        int r2 = (int) Math.abs(Math.random()*1000);
        for (int i = 0; i < 100; i += r1) {
            for (int j = 0; j < 200; j += r2) {
                r2 = (int) Math.abs(Math.random()*1000);
            }
            r1 = (int) Math.abs(Math.random()*1000);
        }

    }

}
