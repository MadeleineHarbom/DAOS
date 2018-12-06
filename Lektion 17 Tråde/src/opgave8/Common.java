package opgave8;

public class Common {
    private static int tealler;
    //Random r;

    public Common() {
        tealler = 0;
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

    public int getTealler() {
        return tealler;
    }


    public void opdterGlobal() {
        int temp = tealler;
        tagerRandomTid(1000);
        tealler = temp + 1;
    }
}
