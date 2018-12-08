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
        tagerRandomTid(10);
        System.out.println("Faerdig med at betjene " + temp);
        serving = temp + 1;
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
