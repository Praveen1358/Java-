package n;
class vehicle{
    void start(){
        System.out.println("Vehicle started");
    }
    
}

public class Inheritance extends vehicle {
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        obj.start();
    }
    
}
