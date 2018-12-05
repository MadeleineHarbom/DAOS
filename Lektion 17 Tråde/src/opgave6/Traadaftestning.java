package opgave6;

public class Traadaftestning {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Vi er igang");
        ThreadClass t1 = new ThreadClass("MUUH");
        ThreadClass t2 = new ThreadClass("ØF");
        ThreadClass t3 = new ThreadClass("Mææh");
        t1.setPriority(3);
        t2.setPriority(1);
        t3.setPriority(2);
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        System.out.println("Slut");

    }

}
