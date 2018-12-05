package opgave8;

public class App {
    public static void main(String[] args) {
        Common c = new Common();
        c.opdterGlobal();
        boolean live = false;
        ThreadClass t1 = new ThreadClass("Traad 1", c);
        ThreadClass t2 = new ThreadClass("Traad 2", c);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Jeg er din counter " +c.getTealler());

    }
}
