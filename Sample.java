package one;

import java.util.ArrayList;

public class Sample {
    public static void main(String[] args){
    ArrayList<String> a=new ArrayList<>();
    a.add("Ram");
    a.add("Raju");
    a.add("Vijay");
    a.add("Vinay");
    a.add("Siva");
    System.out.println(a);
    String temp=a.get(1);
    a.set(1,a.get(4));
    a.set(4,temp);
    System.out.println(a);
    a.remove("Siva");
    System.out.println(a);
    String te=a.get(1);
    a.set(1,a.get(3));
    a.set(3,te);
    System.out.println(a);
    // ArrayList.swap(List,1,4);


    
}}
