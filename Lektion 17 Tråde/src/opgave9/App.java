package opgave9;

public class App {
    public static void main(String[] args) {
        //JEG VIRKER IKKE!
        //PETERSONS ALGORITME!
        Common c = new Common();

        ThreadClass t1 = new ThreadClass("Traad 1", c, 0);
        ThreadClass t2 = new ThreadClass("Traad 2", c, 1);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Jeg er din counter " +c.tealler);

    }
}
