package Prime;
import java.util.*;
public class Factorial {
    public static int facto(int n){
        
        int fact;
        if(n>1){
        fact=facto(n-1)*n;}
        else{
        fact=1;}
        return fact;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         System.out.println(facto(n));
        for(int i=0;i<=10;i++){
            System.out.println("Factorial of "+i+" is "+facto(i));
        
       
    }sc.close();
    
}
}