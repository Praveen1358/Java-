package n;

class Student{
    int rollno;
    public Student(int rollno) {
        this.rollno = rollno;
}
}
public class Result  extends Student {
    int marks;
    public Result(int rollno, int marks) {
        super(rollno);
        this.marks = marks;
    }
    public void display() {
        System.out.println("Roll No: "+rollno+" Marks: "+marks);
    }
    public static void main(String[] args) {
        Result r = new Result(12, 90);
        r.display();
    }
}
