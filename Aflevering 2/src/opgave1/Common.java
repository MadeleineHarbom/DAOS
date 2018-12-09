package opgave1;


public class Common {
    volatile public int turn = 0;
    volatile private boolean[] flag;
    volatile public int taeller;
    volatile public int serving;

    public Common() {
        flag = new boolean[2];
        taeller = 0;
        flag[0] = false;
        flag[1] = false;
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

    public int getKoeNummer() {
        //tagerRandomTid(100);
        taeller = taeller + 1;
        return taeller;
    }

    public void betjene() {
        int temp = serving;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {

        }
        System.out.println("Faerdig med at betjene " + temp);
        serving = temp + 1;
    }

}
