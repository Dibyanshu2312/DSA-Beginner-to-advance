import java.util.*;

public class leetcode {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }


            }
            if (j == needle.length()) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack ;
        String needle ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the haystack string");
        haystack = sc.nextLine();
        System.out.println("Enter the needle string");
        needle = sc.nextLine();

        System.out.println("The first occurence is "+strStr(haystack, needle));
        sc.close();
    }
    
}
