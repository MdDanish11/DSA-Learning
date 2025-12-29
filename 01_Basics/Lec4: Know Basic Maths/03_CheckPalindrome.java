// https://takeuforward.org/plus/dsa/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int n) {
        int originalNum = n;
        int reverseNum = 0;

        while(n>0) {
            int digit = n%10;
            reverseNum = reverseNum*10 + digit;
            n/=10;
        }
        return reverseNum == originalNum;

    }
}