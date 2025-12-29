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


// https://www.geeksforgeeks.org/problems/count-digits5716/1

// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int count = 0;
        int originalNum = n;
        
        while(n>0) {
            int digit = n%10;
            if(digit!=0 && originalNum%digit==0) count++;
            n/=10;
        }
        return count;
    }
}