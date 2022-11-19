//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class problem2 {
//    (Q.1)
    public static int[] solve(int A,int B,int [][] C){
        int [] sum_arr = new int[B];

        for(int j=0;j<B;j++){
            for(int i=0;i<A;i++){
                sum_arr[j] += C[i][j];
            }
        }

        return sum_arr;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      /* (Q.1) Given a 2D integer array C[][] of A rows and B columns. Return an integer array of size B that
       represents the sums of the columns of the 2D array C.
       */
        int A = scn.nextInt();
        int B = scn.nextInt();

        int [][] C = new int[A][B];

        System.out.println(Arrays.toString(solve(A, B, C)));


    }
}
