import java.util.*;
public class evenodd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        if(num>0){
            if(num%2==0){
                System.out.println("The number is even");
            }
            else if(num == 0){
                System.out.println("The number is zero");
            }
            else{
                System.out.println("The number is odd");
            }
        }
        else{
            System.out.println("the number is zero");
        }
        sc.close();
        
    }
}
