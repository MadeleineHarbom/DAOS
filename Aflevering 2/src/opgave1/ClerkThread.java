package opgave1;

public class ClerkThread extends Thread{
    //jeg er consumer, tager fra koe
    //skal afklare customerThreads med random interval
    //busy waiting
    private Common c;
    
    public ClerkThread(Common c) {
        this.c = c;
        c.serving = 1;

    }

    public void run() {
        while (true) {
            while (c.serving > c.taeller) {
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e){

                }
            }
            c.betjene();


        }
    }
}
