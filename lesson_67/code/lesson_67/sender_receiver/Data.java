package lesson_67.sender_receiver;

public class Data {

    private String packet;

    private boolean transfer = true;

    public synchronized String receive(){
        while(transfer) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        String returnPaket = packet;
        transfer = true;

        notifyAll();

        return returnPaket;
    }

    public synchronized void send() {

    }
}
