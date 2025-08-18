public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike started with self-start.");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped.");
    }
}
