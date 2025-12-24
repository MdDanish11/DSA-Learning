// Question Link: https://www.geeksforgeeks.org/problems/while-loop-printtable-java/1

class Solution {
    public void calculateMultiples(int n) {
        // code here
        
        int i = 10;
        while(i>=1) {
            System.out.print(n*i + " ");
            
            i--;
        }
    }
}