

import java.util.Scanner;

public class pattern4 {
    // Pattern 4
    public static void main(String [] args){
        /*
        Pattern 4
            1
            1 2
            1 2 3
            1 2 3 4
         */
        // Creating Scanner Object For taking inputs from the USER
        Scanner sc = new Scanner(System.in);
        // Take Number of ROWS and COLUMNS from the USER
        System.out.print(" Enter Number of ROWS for the Pattern: ");
        int noOfRows = sc.nextInt();

        // Procedure to Print the Required Pattern
//         for(int row = 1; row <= noOfRows; row++){
//             for(int column = noOfRows; column >= row; column--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
// sc.close();
//     }

for(int i=0; i<noOfRows ; i++){
    for(int j=noOfRows-i-1; j>=1; j--){
        System.out.print(" ");
    }
    for(int j=0;j<=i;j++){
        System.out.println("* ");
    }
    System.out.println();
}    
for (int i = 0; i < noOfRows; i++) {
    // Print spaces
    for (int j = 0; j < noOfRows - i - 1; j++) {
        System.out.print(" ");
    }
    // Print stars
    for (int j = 0; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
} 
}
}
    