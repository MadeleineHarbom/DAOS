package opgave4;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Common c = new Common(10);
        EntranceThread e1 = new EntranceThread(0, c, "Douglas");
        EntranceThread e2 = new EntranceThread(1, c, "Patrick");

        ClerkThread c1 = new ClerkThread(c, 1);
        c1.start();
        ClerkThread c2 = new ClerkThread(c, 2);
        c2.start();

        //laeg threads i queue til nummermaskinen
        for (int i = 0; i < 100; i++) {
            double entrance = Math.random();
            if (entrance < 0.5) {
                CustomerThread customer = new CustomerThread(e1);
                customer.start();
            }
            else {
                CustomerThread customer = new CustomerThread(e2);
                customer.start();
            }
        }


    }



}
