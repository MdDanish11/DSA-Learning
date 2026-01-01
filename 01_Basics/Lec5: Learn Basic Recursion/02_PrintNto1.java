// https://takeuforward.org/plus/dsa/problems/print-n-to-1-using-recursion

class Solution {
    public void printNumbers(int n) {
        if(n<1) return;
        System.out.println(n);

        printNumbers(n-1);
    }
}