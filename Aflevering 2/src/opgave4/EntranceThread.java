package opgave4;

import java.util.Random;

public class EntranceThread extends Thread {
    //jeg er producer, tilfojer til koe
    //skal traekke billet med random intervaller
    //peterson
    public Common c;
    public int indgang;
    public String name;


    public EntranceThread(int indgang, Common common, String name) {
        this.indgang = indgang;
        this.c = common;
        this.name = name;
    }

    @Override
    public void run() {
        // Entering critical
        System.out.println("Jeg bruger indgang " + this.indgang);
        //leaving critical
    }


    public synchronized void getInLine() {
        Random r = new Random();
        while (c.currentSize >= c.size) {

        }
        String n = name + c.taeller;
        c.tagerRandomTid(20);
        c.enqueue(n);
    }
}
