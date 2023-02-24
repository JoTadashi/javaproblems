import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i ++) {
            x[i] = scanner.nextInt();
            int sum = 0;
            for (int j = i; j >= 0; j --) {
                sum += x[j];
                if (sum < 0) ans ++;
            }
        }
        System.out.println(ans);
    }
}