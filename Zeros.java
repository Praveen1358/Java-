package Prime;
import java.util.Scanner;

// public class Zeros {

//     public static void main(String[] args) {
//         int number = 234000;
//         int Zeros = countZeros(number);
//         System.out.println("Number of  zeros: " + Zeros);
//     }

//     public static int countZeros(int num) {
//         int count = 0;
//         while (num % 10 == 0 && num != 0) {
//             count++;
//             num /= 10;
//         }
//         return count;
//     }
// }
public class Zeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
         int Zeros = countZeros(number);
        System.out.println("Number of  zeros: " + Zeros);
    }

    public static int countZeros(int num) {
      
        if (num == 0) {
            return 1;
        }
        
        if (num < 10) {
            return 0;
        }
       
        if (num % 10 == 0) {
            return 1 + countZeros(num / 10);
        }
       
        return countZeros(num / 10);
    }
}
