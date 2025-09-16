
import java.util.Scanner;

public class squareroot {
    
    public static void main(String [] args){
       
        Scanner sc = new Scanner(System.in);
    
        System.out.print(" Enter Any Number: ");
        int num = sc.nextInt();
      
        System.out.println(" Square Root of " + num + " is: " + sqrt(num));
         sc.close();
    }

    static int sqrt(int num){
        int start = 0;
        int end = num;
        while(start <= end){
            // Find Mid
            int mid = start + (end - start)/2;
            if(mid * mid == num)
                return mid;
            else if(mid * mid > num)
                end = mid - 1;
            else
                start = mid + 1;
        }
     
        return end;
    }
   
}
