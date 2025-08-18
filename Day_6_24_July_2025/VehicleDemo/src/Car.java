public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car started with key ignition.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }
}
