// https://takeuforward.org/plus/dsa/problems/gcd-of-two-numbers

class Solution {
    public int GCD(int n1, int n2) {
        // while(n2!=0) {
        //     int rem = n1 % n2;
        //     n1 = n2;
        //     n2 = rem;
        // }
        // return n1;

        if(n2 == 0) return n1;
        return GCD(n2, n1%n2);
    }
}