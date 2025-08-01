package twentynine;
abstract class Shap{
    abstract double getArea();
}
class Circle extends Shap{
    int radius;
   public void  setArea(int radius){
        this.radius=radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }}

class Rectangle extends Shap{
    int length;
    int width;
   public void  setArea(int length,int width){
        this.length=length;
        this.width=width;
    }
    public double getArea(){
        return length*width;
    }}
public class Shape {
    public static void main(String[] args) {
        Circle s= new Circle();
        Rectangle r= new Rectangle();
        s.setArea(5);
        r.setArea(5, 5);
        System.out.println("Rectangle Area: "+r.getArea());
        s.radius = 5;
        System.out.println("Circle area: " + s.getArea());

    
}}
