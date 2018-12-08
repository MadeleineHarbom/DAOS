package opgave4;


import java.util.Random;

public class Common {
    volatile public int turn = 0;
    private boolean[] flag;
    public static int taeller;
    public static int serving;
    private Random r;

    public Common() {
        flag = new boolean[99]; // da den dovne ekspedient gaar hjem efter 100 kunde
        taeller = 0;
        r = new Random();

    }

    public void setFlag(boolean flag, int id) {
        this.flag[id] = flag;
    }

    public boolean getFlag(int id) {
        return flag[id];
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    public int getTurn() {
        return turn;
    }

    public synchronized int getKoeNummer() {
        int temp = taeller;
        tagerRandomTid(200);
        taeller = temp +1;
        System.out.println("Jeg fik nummer " +  taeller);
        return taeller;
    }

    public void betjene() {
        tagerRandomTid(100);
        serving++;

    }

    public void tagerRandomTid(int max) {
        int r1 = (int) Math.abs(Math.random()*1000);
        int r2 = (int) Math.abs(Math.random()*1000);
        for (int i = 0; i < max; i += r1) {
            for (int j = 0; j < max*2; j += r2) {
                r2 = (int) Math.abs(Math.random()*1000);
            }
            r1 = (int) Math.abs(Math.random()*1000);
        }
    }


}
