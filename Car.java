package twentynine;
 interface Vehicle {
    void start();
    void stop(); 
}
public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
public static void main(String[] args) {
    Vehicle v = new Bike();
    v.start();
    v.stop();
    
}}
class Bike implements Vehicle {

public void start() {
    System.out.println("Bike started");
}
public void stop() {
    System.out.println("Bike stopped");
}

    
}
