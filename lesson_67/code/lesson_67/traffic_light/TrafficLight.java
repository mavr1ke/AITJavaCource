package lesson_67.traffic_light;

public class TrafficLight implements Runnable {

    private TrafficLightColour colour;
    private boolean stop = false;
    private boolean changed = false;

    public TrafficLight(TrafficLightColour colour) {
        this.colour = colour;
    }

    public TrafficLight() {
        colour = TrafficLightColour.RED;
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                switch (colour) {
                    case GREEN:
                        Thread.sleep(5000);
                        break;
                    case YELLOW:
                        Thread.sleep(1500);
                        break;
                    case RED:
                        Thread.sleep(6000);
                        break;
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            changeColour();
        }
    }

    public synchronized void changeColour() {
        switch (colour) {
            case RED:
                colour = TrafficLightColour.GREEN;
                break;
            case YELLOW:
                colour = TrafficLightColour.RED;
                break;
            case GREEN:
                colour = TrafficLightColour.YELLOW;
        }
        changed = true;
        notify();
    }

    synchronized void waitForChange() {
        try {
            while (!changed) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

    synchronized TrafficLightColour getColour() {
        return colour;
    }

    synchronized void cancel() {
        stop = true;
    }
}
