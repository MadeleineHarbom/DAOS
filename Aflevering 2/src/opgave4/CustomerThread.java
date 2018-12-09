package opgave4;

public class CustomerThread extends Thread {
    EntranceThread entrance;
    boolean inline;

    public CustomerThread(EntranceThread e) {
        this.entrance = e;
        this.inline = false;
    }

    public void run(){
        while(!inline){
            entrance.getInLine();
            inline = true;
        }
    }


}
