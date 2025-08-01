package twentynine;

public class Product {
    private String name;
    private int id;
    private double price;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;}
        public static void main(String[] args) {
            Product product = new Product();
            product.setName("Apple");
            product.setId(1);
            product.setPrice(10.99);
            System.out.println("Product Name: " + product.getName());
            System.out.println("Product ID: " + product.getId());
            System.out.println("Product Price: " + product.getPrice());
        }
    
}
