package opgave9;

public class Common {

    volatile public int turn = 0;
    public boolean[] flag = new boolean[2];

    public int tealler = 0;
    //Random r;

    public Common() {
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




    public void opdterGlobal() {
        int temp = tealler;
        tagerRandomTid(100);
        tealler = temp + 1;
    }
}
