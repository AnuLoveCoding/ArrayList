public class problem4 {
//    (Q.1)
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        int ans = 1;
        if(A.length!=A[0].length){
            return ans = 0;
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(i==j && A[i][j]!=1){
                    return ans = 0;
                }

                if(i!=j && A[i][j]!=0){
                    return ans=0;
                }
            }
        }

        return ans;
    }
}

    public static void main(String[] args) {
//        (Q.1) You are given a N X N square integer matrix A.
//        You have to tell whether A is an identity matrix or not.

    }
}
