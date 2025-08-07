package n;
class Product{
    String name;
    int price;
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class Electronics extends Product {
    int warranty;
    public Electronics(String name, int price, int warranty) {
        super(name, price);
        this.warranty=warranty;
}public static void main(String[] args) {
    Electronics e = new Electronics("Laptop", 1000, 2);
    System.out.println((e.name+" "+e.price+" "+e.warranty));
    
}}
