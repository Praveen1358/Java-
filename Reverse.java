package one;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args){
        ArrayList<String> a=new ArrayList<>();
        a.add("Apple");
        a.add("Banana");
        a.add("Mango");

        a.add("Berry");
Collections.sort(a);
System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);
        Collections.swap(a,1,3);
           System.out.println(a);
           Collections.shuffle(a);
              System.out.println(a);
              a.contains("kjfhi");
              System.out.println( a.contains("kjfhi"));
              a.indexOf("Apple");
                 System.out.println( a.indexOf("Apple"));

    }
    
}
