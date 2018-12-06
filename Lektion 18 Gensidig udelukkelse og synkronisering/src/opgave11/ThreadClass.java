package opgave11;

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
            System.out.println("Jeg er " + this.name);
        }
        live = false;
    }

    //Jeg er en testmetode
    private synchronized void thingy() {
        for (int j = 0; j < 100; j++) {
            c.opdterGlobal();
            c.tagerRandomTid(100);
            System.out.println("Jeg er " + this.name);
        }
    }



}
