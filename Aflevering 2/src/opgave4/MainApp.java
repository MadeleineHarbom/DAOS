package opgave4;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random r = new Random();
        EnteranceThread t1;
        EnteranceThread t2;
        ClerkThread c1;
        ClerkThread c2;
        //2 billet automater
        //1 ekspedient
        //brug af buzy waiting
        Common c = new Common(10);
        int end = 100;
        ClerkThread clerk = new ClerkThread(c);
        clerk.start();

        for (int i = 0; i < 100; i++) {
            double entrance = Math.random();
            c.tagerRandomTid(300);
            if (entrance < 0.5) {
                t1 = new EnteranceThread(0, c, clerk);
                t1.start();

            }
            else {
                t2 = new EnteranceThread(1, c, clerk);
                t2.start();

            }
        }

        while (end < 100) { {

        }

        }
    }




}
