package Prime;
import java.util.*;
public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]=new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter values"+(i+1)+":");
            num[i]=sc.nextInt();
        }System.out.println("/n Display the values");
        for(int i=0;i<5;i++){
            System.out.println("Value"+(i+1)+":"+num[i]);
    }
    
}}
