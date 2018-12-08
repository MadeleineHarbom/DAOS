package opgave3;

public class EnteranceThread extends Thread {
    //jeg er producer, tilfojer til koe
    //skal traekke billet med random intervaller
    //peterson
    public Common c;
    public int indgang;
    private ClerkThread clerk;



    public EnteranceThread(int indgang, Common common, ClerkThread clerk) {
        this.indgang = indgang;
        this.c = common;
        this.clerk = clerk;
    }

    @Override
    public void run() {
        // Entering critical
        int nr = c.getKoeNummer(); //synch'ed
        //leaving critical
        clerk.notify();
        System.out.println("Jeg bruger indgang " + this.indgang);
        System.out.println("Jeg fik nummer " +  nr);






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
