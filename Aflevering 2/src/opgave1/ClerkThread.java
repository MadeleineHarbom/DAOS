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
        while (c.serving < 101) {
            while (c.serving > c.taeller) {
                c.tagerRandomTid(10);
            }
            //vores sagbehandler arbejder hurtigt
            //hun tager kunderne naar det efterspurgt et nummer, og venter ikke paa at de kigget paa sedelen.

            c.betjene();


        }



    }
}
