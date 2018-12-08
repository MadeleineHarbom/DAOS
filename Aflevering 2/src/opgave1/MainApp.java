package opgave1;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {

        EnteranceThread t1;
        EnteranceThread t2;

        Common c = new Common();
        ClerkThread clerk = new ClerkThread(c);
        clerk.start();

        for (int i = 0; i < 100; i++) {
            c.tagerRandomTid(300);
            double entrance = Math.random();
            if (entrance < 0.5) {
                t1 = new EnteranceThread(0, c);
                t1.start();
                try {
                    t1.join();
                }
                catch (Exception e) {

                }

            }
            else {
                t2 = new EnteranceThread(1, c);
                t2.start();
                try {
                    t2.join();
                }
                catch (Exception e) {

                }
            }

        }
    }




}
