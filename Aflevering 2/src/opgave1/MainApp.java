package opgave1;

public class MainApp {
    public static void main(String[] args) {
        Common c = new Common();

        EntranceThread entrance1 = new EntranceThread(0, c);
        EntranceThread entrance2 = new EntranceThread(1, c);

        entrance1.start();
        entrance2.start();

        ClerkThread clerk = new ClerkThread(c);
        clerk.start();

        for (int i = 0; i < 100; i++) {
            double entrance = Math.random();
            if (entrance < 0.5) {
                CustomerThread customer = new CustomerThread(entrance1, i);
                customer.start();
            }
            else {
                CustomerThread customer = new CustomerThread(entrance2, i);
                customer.start();
            }
        }
    }
}
