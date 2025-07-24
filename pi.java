package Prime;
import java.util.*;

public class pi {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        String pi=Emo(num);
        System.out.println(pi);
    }

    public static String Emo(String num){
        // if (num==null){
        //     return "v";
        // }
        if(num.length()<2){
            return num;
        }
        else if(num.charAt(0)=='p'&& num.charAt(1)=='i'){
        return "3.14"+Emo(num.substring(2));
        }
        else{
            return num.charAt(0)+Emo(num.substring(1));
    }
    
}
}