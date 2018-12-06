package opgave9;

public class ThreadClass extends Thread {
    private String name;
    private Common c;
    private int id;
    //private int current;


    public ThreadClass( String navn, Common common, int id) {
        super(); //steffen?
        this.name = navn;
        this.c = common;
        this.id = id;
    }

    public void run() {
        int current = (this.id + 1) %2;
        for (int j = 0; j < 100; j++) {
            //entrer critical phase
            c.setFlag(true, id);
            c.setTurn(current);
            while (c.getFlag(current) && c.getTurn() == current) {
                //bus waiting
            }
            //critical phase
            c.opdterGlobal();
            c.tagerRandomTid(100);
            //exit critical phase
            c.setFlag(false, this.id);

        }
    }



}
