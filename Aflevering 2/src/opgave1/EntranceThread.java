package opgave1;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class EntranceThread extends Thread {

    public Common c;
    public int indgang;
    private Queue<CustomerThread> queue;

    public EntranceThread(int indgang, Common common) {
        this.indgang = indgang;
        this.c = common;
        this.queue = new LinkedList<>();
    }

    @Override
    public void run() {
        int concurrentID = (this.indgang + 1) %2;
        while(true){
            c.setFlag(true, this.indgang);
            c.setTurn(concurrentID);
            while (c.getFlag(concurrentID) && c.getTurn() == concurrentID) {
                try{
                    Thread.sleep(100);
                }
                catch (InterruptedException e){
                    System.out.println("Interrupted");
                }
            }
            // Entering critical
            try{
                CustomerThread customer = queue.remove();
                int nr = c.getKoeNummer();
                customer.assignQueueNumber(nr);
                synchronized(customer) {
                    customer.notify();
                }
            }
            catch (NoSuchElementException e){

            }
            //leaving critical
            c.setFlag(false, this.indgang);
        }

    }

    public void getInLine(CustomerThread customerThread) {
        this.queue.add(customerThread);
    }
}
