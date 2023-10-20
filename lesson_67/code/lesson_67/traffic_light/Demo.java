package lesson_67.traffic_light;

public class Demo {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(TrafficLightColour.GREEN);
        Thread thread = new Thread(trafficLight);
        thread.start();

        for (int i = 0; i < 9; i++) {
            System.out.println(trafficLight.getColour());
            trafficLight.waitForChange();
        }

        trafficLight.cancel();
    }
}
