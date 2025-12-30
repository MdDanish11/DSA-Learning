// https://takeuforward.org/plus/dsa/problems/check-for-prime-number

class Solution {
    public boolean isPrime(int n) {
        if(n<=1) return false;

        for(int i=2; i<=n/i; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
}