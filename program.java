import java.util.*;
public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            for (int j = 0; j < n; j++) {
            if (i != j && nums[j] == complement) {
                System.out.println("indices: " + i + ", " + j);
                return;
            }
            }
            
        }
        System.out.println("No two sum solution found.");
        sc.close();
    }

}
