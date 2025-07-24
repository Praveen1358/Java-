package Prime;
import java.util.*;
public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String Change=Xy(n);
        System.out.println(Change);
    
}
public static String Xy(String s){
    s=s.toLowerCase();
    if(s.length()<=1){
        if(s.charAt(0)=='x'){
            return "y";

        }else{
            return s;
        }

    }
    if(s.charAt(0)=='x'){
        return "y"+Xy(s.substring(1));
    }
    else{
       return s.charAt(0)+Xy(s.substring(1));
    }
}
}