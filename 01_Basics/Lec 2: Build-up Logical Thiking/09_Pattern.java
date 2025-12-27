// https://www.naukri.com/code360/problems/star-diamond_6573686?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_patternproblems

public class Solution {
    public static void nStarDiamond(int n) {
        // Write your code here

        // upper part
        for(int i=1; i<=n; i++) {
            for(int j =1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        // lower part
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i-1; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=2*n - 2*i+1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}