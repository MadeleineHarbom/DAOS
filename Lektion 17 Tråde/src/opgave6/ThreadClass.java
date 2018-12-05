package opgave6;

public class ThreadClass extends Thread {

    String dyrelyd;

    public ThreadClass(String dyrelyd) {
        super();
        this.dyrelyd = dyrelyd;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(dyrelyd);
            try {
                Thread.sleep(2);
            } catch (Exception e) {
            }
        }
    }

}
