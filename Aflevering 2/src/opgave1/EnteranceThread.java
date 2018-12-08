package opgave1;

public class EnteranceThread extends Thread {

    public Common c;
    public int indgang;

    public EnteranceThread(int indgang, Common common) {
        this.indgang = indgang;
        this.c = common;
    }

    @Override
    public void run() {
        int concurrentID = (this.indgang + 1) %2;
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


}
