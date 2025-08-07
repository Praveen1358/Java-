package n;
class Appliance{
    void turnOn(){
        System.out.println("power is on");
}
}
public class Fan extends Appliance{
    void turnOn(){{
        System.out.println("fan is on");
    }}

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.turnOn();

    }
    
}
