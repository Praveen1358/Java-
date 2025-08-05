package five;
public class Average {
    public static void main(String[] args){
    int arr[]={11,
92 ,2 ,74, 55, 0, 10, -60 ,24 ,91 ,-67, 11};
    long sum=0;long avg;
    for(int i=0;i<arr.length;i++){
        sum+=i;
        // System.err.println(sum);
    }
    avg=sum/2;
System.out.println(avg);
    }
    
}
