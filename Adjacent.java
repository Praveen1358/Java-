package Prime;
import java.util.Scanner;
public class Adjacent {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String Adjacent=Ad(str);
        System.out.println(Adjacent);


    }public static String Ad(String str) {
       if(str.length()<=1){
        return str;
       }if(str.charAt(0)==str.charAt(1)){
        return Ad(str.substring(1));
       }
       return str.charAt(0)+Ad(str.substring(1));

        
    
}
}