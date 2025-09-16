import java.util.*;
public class input {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("this is my number:" + a);
        sc.nextLine(); // consume the leftover newline
        String str = sc.nextLine();
        System.out.println("this is my string:" + str);
        float b = sc.nextFloat();
        System.out.println("this is my float:" + b);    
        sc.close();
    }
}
