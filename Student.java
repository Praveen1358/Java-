package twentynine;

public class Student {
     private String name;
    int rollno;
    int marks;
   
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setRollno(int rollno){
        this.rollno = rollno;
    }
    public int getRollno(){
        return rollno;
    }
    public void setMarks(int marks){
        if(marks<100)
        this.marks = marks;
    }
    public int getMarks(){
        return marks;
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Rahul");
        s.setRollno(1);
        s.setMarks(90);
        System.out.println("Name: "+s.getName());
        System.out.println("Roll No: "+s.getRollno());
        System.out.println("marks: "+s.getMarks());
    }
}
