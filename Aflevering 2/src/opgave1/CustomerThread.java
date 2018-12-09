package opgave1;

public class CustomerThread extends Thread{

    private EntranceThread entrance;
    private int id;
    private int queueNumber;

    public CustomerThread(EntranceThread entrance, int id){
        this.entrance = entrance;
        this.id = id;
    }

    public void assignQueueNumber(int queueNumber) {
        this.queueNumber = queueNumber;

    }

    public synchronized void run() {
        entrance.getInLine(this);
        try{
            this.wait();
        }
        catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Jeg brugte indgang " + this.entrance.indgang + " og jeg fik nummer " +  this.queueNumber);
    }

}
