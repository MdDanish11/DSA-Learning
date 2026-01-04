// https://takeuforward.org/plus/dsa/problems/reverse-an-array

class Solution {
    public void reverse(int[] arr, int n) {
        int left = arr.length -n;
        int right = n-1;

        if(left>=right) return;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr, n-1);
        
    }
}

