package opgave10;


import java.util.concurrent.Semaphore;

public class App {
    public static void main(String[] args) {


        Common c = new Common();
        ThreadClass t1 = new ThreadClass("Traad 1", c);
        ThreadClass t2 = new ThreadClass("Traad 2", c);
        try {
            ThreadClass.semaphore.acquire();
            t1.start();
        }
        catch (Exception e) {

        }

        try {
            ThreadClass.semaphore.acquire();
            t2.start();
        }
        catch (Exception e) {

        }
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Jeg er din counter " +c.getTealler());

    }
}
