package opgave10;

import java.util.concurrent.Semaphore;

public class ThreadClass extends Thread {
    private String name;
    Common c;
    public boolean live;
    public static Semaphore semaphore = new Semaphore(1, true);
    //semaforen kan ligge her, men kan ogsaa bare ligge i Thread


    public ThreadClass(String navn, Common common) {
        this.name = navn;
        this.c = common;
    }

    public void run() {
        for (int j = 0; j < 100; j++) {
            c.opdterGlobal();
            c.tagerRandomTid(100);
            System.out.println("Jeg er " + this.name);
        }
        semaphore.release();
    }



}
