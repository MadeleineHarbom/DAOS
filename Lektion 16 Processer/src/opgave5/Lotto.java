package opgave5;

public class Lotto {
    int x;
    public LottoReakke[] lotteraekker;
    public LottoReakke rigtig;

    public Lotto(int antal) {
        x = antal;
        lotteraekker = new LottoReakke[x];
        for (int i =0; i<x; i++) {
            lotteraekker[i] = new LottoReakke();
        }
        rigtig = new LottoReakke();
    }


    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < x; i++) {
            LottoReakke lr = lotteraekker[i];
            s += (i+1) + ": ";
            s += "(" + lr.antalrigtige(this.rigtig) + ") ";
            for (boolean b : lr.raek) {
                s += b + " ";
            }
            s+= "\n";
        }
        return s;
    }

}
