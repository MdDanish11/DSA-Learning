// https://takeuforward.org/plus/dsa/problems/count-all-digits-of-a-number

class Solution {
    public int countDigit(int n) {
        int count = 0;

        while(n>0) {
            int digit = n%10;
            count++;
            n/=10;
        }
        return count;

    }
}