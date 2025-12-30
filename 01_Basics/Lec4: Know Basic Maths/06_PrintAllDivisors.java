// https://takeuforward.org/plus/dsa/problems/divisors-of-a-number

class Solution {
    public int[] divisors(int n) {
        List<Integer> results = new ArrayList<>();

        for(int i=1; i*i<=n; i++) {
            if(n%i == 0) results.add(i);   // first divisors
            if((n/i) != i)      // avoid duplicate for perfect square
            results.add(n/i);     // paired divisor
        }

        // sort the divisors (because √n gives unordered result)
        Collections.sort(results);

        // convert List<Integer> to int[]
        int[] ans = new int[results.size()];

        for(int i=0; i<results.size(); i++) {
            ans[i] = results.get(i);
        }

        return ans;


    }
}