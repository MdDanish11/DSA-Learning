// https://takeuforward.org/plus/dsa/problems/check-if-string-is-palindrome-or-not-

class Solution {   
    public boolean palindromeCheck(String s) {
        //your code goes here
        return helper(s,0);
    }

    public boolean helper(String s, int i) {
        int n = s.length();

        if(i >= n/2) return true;
        if(s.charAt(i) != s.charAt(n-i-1)) return false;
        return helper(s, i+1);
    }
}