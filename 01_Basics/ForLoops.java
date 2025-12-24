// Question Link: https://www.naukri.com/code360/problems/nth-fibonacci-number_74156?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prev1 = 1;
        int prev2 = 1;
        int current = 0;

        if(n == 1 || n ==2) {
            System.out.println(1);
            return;
        }

        for(int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        System.out.println(current);
    }
}