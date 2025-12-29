// https://takeuforward.org/plus/dsa/problems/reverse-a-number

class Solution {
    public int reverseNumber(int n) {
        int reverseNum = 0;

        while(n>0) {
            int digit = n%10;
            reverseNum = reverseNum*10 + digit;
            n/=10;
        }
        return reverseNum;

    }
}