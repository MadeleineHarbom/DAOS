package opgave1;

public class EnteranceThread extends Thread {
    //jeg er producer, tilfojer til koe
    //skal traekke billet med random intervaller
    //peterson
    public Common c;
    public int indgang;
    private int concurrentID;



    public EnteranceThread(int indgang, Common common) {
        this.indgang = indgang;
        this.c = common;
    }

    @Override
    public void run() {
        concurrentID = (this.indgang + 1) %2;
        c.setFlag(true, this.indgang);
        c.setTurn(concurrentID);
        while (c.getFlag(concurrentID) && c.getTurn() == concurrentID) {
            c.tagerRandomTid(50);
        }
        // Entering critical
        int nr = c.getKoeNummer();
        System.out.println("Jeg bruger indgang " + this.indgang);
        System.out.println("Jeg fik nummer " +  nr);
        //leaving critical
        c.setFlag(false, this.indgang);



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
