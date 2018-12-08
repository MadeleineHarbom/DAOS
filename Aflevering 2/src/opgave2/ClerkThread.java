package opgave2;

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
        while (c.serving < 100) {
            while (c.serving > c.taeller) {
                c.tagerRandomTid(200);
            }
            //vores sagbehandler arbejder hurtigt
            //hun tager kunderne naar det efterspurgt et nummer, og venter ikke paa at de kigget paa sedelen.
            int temp = c.serving;
            c.betjene();
            System.out.println("Faerdig med at betjene " + temp);
            c.serving = temp +1;
        }



    }
}
