// https://takeuforward.org/plus/dsa/problems/sum-of-first-n-numbers?tab=editorial

class Solution {
    public int NnumbersSum(int N) {
        //your code goes here
        if(N==0) return 0;

        return N + NnumbersSum(N-1); 
    }
}