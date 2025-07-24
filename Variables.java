package Prime;

public class Variables {
    String name;
    static String school = "Greenwood High";

    void displayDetails(){
        int marks = 95;
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
        System.out.println("School : " + school);
    }
    public static void main(String[] args) {
        Variables s1 = new Variables();
        s1.name = "Sweety";
        s1.displayDetails();
    }
}
