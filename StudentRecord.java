
 package one;

 import java.util.ArrayList;
 import java.util.Scanner;

 public class StudentRecord {
    public static void main(String[] args){
         ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter student name or 'exit' to stop:");
            String a = sc.nextLine();
             if (a.equalsIgnoreCase("exit")) {
                 break;
             }
            students.add(a);
         }
         System.out.println(students);
         System.out.println(students.size() );
    }
 }