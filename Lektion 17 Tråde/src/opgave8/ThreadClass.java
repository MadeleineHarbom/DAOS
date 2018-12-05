package opgave8;

public class ThreadClass extends Thread {
    private String name;
    Common c;
    public boolean live;


    public ThreadClass(String navn, Common common) {
        this.name = navn;
        this.c = common;
    }

    public void run() {
        this.live = true;
        for (int j = 0; j < 100; j++) {
            c.opdterGlobal();
            c.tagerRandomTid(100);
            //opdaterer global 100 gange, på 2 tråde
            //derfor skal global være 200 når denne er færdig
        }
        live = false;
    }



}
