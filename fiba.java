package Prime;
import java.util.*;
public class fiba {
    public static int fibonacci(int n){
        if (n == 0) {
            return 0;
    }
    else if (n == 1||n==2) {
        return 1;
        }
    else  {
       return  fibonacci(n - 1) + fibonacci(n - 2);}
        
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of  Fibonacci sequence");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        System.out.println(fibonacci(i));

}
    }