// https://takeuforward.org/plus/dsa/problems/print-1-to-n-using-recursion

class Solution {
    public void printNumbers(int n) {
        if(n<1) return;
        printNumbers(n-1);
        System.out.println(n);
    }
}