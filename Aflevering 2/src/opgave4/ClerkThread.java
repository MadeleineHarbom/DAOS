package opgave4;


import java.util.Random;

public class ClerkThread extends Thread {
    //jeg er consumer, tager fra koe
    //skal afklare customerThreads med random interval
    //busy waiting
    private Common c;
    public int clerkId;


    public ClerkThread(Common c, int clerkId) {
        this.c = c;
        c.serving = 1;
        this.clerkId = clerkId;
    }


    public void run() {
        Random r = new Random();
        while (c.taeller < 101) {
            String n = c.dequeue();
            if (n != null) {
                System.out.println("Clerk #" + clerkId + " is serving customer " + n);
            }
        }


    }
}
