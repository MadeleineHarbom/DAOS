package opgave1;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Common c = new Common();
        EnteranceThread t1 = new EnteranceThread(0, c);
        EnteranceThread t2 = new EnteranceThread(1, c);


        ClerkThread clerk = new ClerkThread(c);
        clerk.start();

        int start = 0;
        int end = 100;
        

        //En koe for at komme til nummermaskinen
        for (int i = 0; i < 100; i++) {
            c.tagerRandomTid(300);
            double entrance = Math.random();
            if (entrance < 0.5) {
                t1.start();
//                try {
//                    t1.join();
//                }
//                catch (Exception e) {
//
//                }

            }
            else {
                t2.start();
//                try {
//                        t2.join();
//                }
//                catch (Exception e) {
//
//                }
            }

        }
    }




}
