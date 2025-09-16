import java.util.Arrays;
import java.util.*;

public class median {

    public static float findmedian(int[] arr) {
     
        int n = arr.length;
        if (n % 2 == 0) {
            return (float) ((arr[n/2 + 1] + arr[n/2]) / 2.0);
        } else {
            return arr[n/2+1];
        }
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                arr3[k++] = arr1[i++];
               
            } else {
                arr3[k++] = arr2[j++];
                
            }
        }
        while(i < n1) {
            arr3[k++] = arr1[i++];
        }   
        while(j < n2) {
            arr3[k++] = arr2[j++];

        }
        

        
        return arr3;

    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5,6};
        int[] arr4= (merge(arr1,arr2));
        System.out.println("sorted array is: "+Arrays.toString(arr4));
       System.out.println(findmedian(arr4)); 
    }
}
