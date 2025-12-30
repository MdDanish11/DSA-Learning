// https://takeuforward.org/plus/dsa/problems/check-if-the-number-if-armstrong

class Solution {
    public boolean isArmstrong(int n) {
        int original = n;
        int count = 0;
        int sum = 0;
        
        int temp = n;
        while(temp>0) {
            temp/=10;
            count++;
        }

        temp = n;
        while(temp>0) {
            int digit = temp%10;
            sum+= Math.pow(digit,count);
            temp/= 10;
        }

        return sum == original;
    }
}