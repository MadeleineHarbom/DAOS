package opgave2;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Random r = new Random();
        EnteranceThread t1;
        EnteranceThread t2;
        //2 billet automater
        //1 ekspedient
        //brug af buzy waiting
        Common c = new Common();
        ClerkThread clerk = new ClerkThread(c);
        clerk.start();

        for (int i = 0; i < 100; i++) {
            double entrance = Math.random();
            if (entrance < 0.5) {
                t1 = new EnteranceThread(0, c);
                t1.start();
            }
            else {
                t2 = new EnteranceThread(1, c);
                t2.start();
            }
        }
        long slut = System.currentTimeMillis();
        try {
            clerk.join();
        }
        catch (Exception e) {

        }
        System.out.println("Det vare bare nogle super lange " + (slut - start) + " milisekunder!");
        System.out.println("Nu tager jeg hjem!");
    }




}
