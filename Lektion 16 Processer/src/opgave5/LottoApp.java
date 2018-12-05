package opgave5;

public class LottoApp {
    public static void main(String[] args) {
        Lotto lotto = new Lotto(50000);
        //System.out.println(lotto.toString());

        LottoReakke rigtigt = lotto.rigtig;

        long startTime1 = System.nanoTime();
        for (int i = 0; i <lotto.x; i++) {
            lotto.lotteraekker[i].antalrigtige(rigtigt);
        }
        long endTime2 = System.nanoTime();
        long elapsed1 = endTime2 - startTime1;


        long startTime2 = System.nanoTime();
        for (int i = 0; i < lotto.x; i++) {
            System.out.println(i+1 + ": " + lotto.lotteraekker[i].antalrigtige(rigtigt) + "\n");
        }
        long endtime2 = System.nanoTime();
        long elapsed = endtime2 - startTime2;
        System.out.println("Runtime uden print: " + elapsed1 + " nanoseconds");
        System.out.println("Runtime med print: " + elapsed + " nanoseconds");


        //Mangler:
        //Der udskriver hvor mange rækker der er med 0, 1...7 rigtige. Der udskrives det
        // samlede antal kontrollerede rækker (skal være sum af ovenstående tal).
        // Resultatet af tidsmålingen fra step 3 udskrives også.
    }
}
