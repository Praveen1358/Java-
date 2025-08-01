package twentynine;

public class Temparature {
    private double celsius;
    public void  setCelsius(double celsius) {
        this.celsius = celsius;}
    public double getCelsius() {
        return this.celsius;}
    
     public void setFahrenheit(double fahrenheit) {
         this.celsius = (fahrenheit - 32) * 5 / 9;
     }
     public double getFahrenheit(){
         return (this.celsius * 9 / 5) + 32;
     }
     public static void main(String[] args) {
        Temparature t = new Temparature();
        t.setCelsius(67);
        System.out.println("67 degree celsius is equal to " + t.getFahrenheit() +
        " degree fahrenheit");
        t.setCelsius(0);
        System.out.println("0 degree Celsius is equal to " + t.getFahrenheit() + " degree Fahrenheit");

        t.setFahrenheit(212);
        System.out.println("212 degree Fahrenheit is equal to " + t.getCelsius() + " degree Celsius");
    
}}
