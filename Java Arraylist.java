import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> x = new ArrayList<>(n); 
        for (int i = 0; i < n; i ++) {
            int m = scanner.nextInt();
            x.add(new ArrayList());
            for (int j = 0; j < m; j ++) {
                int val = scanner.nextInt();
                x.get(i).add(val);
            }
        }
        int q = scanner.nextInt();
        while(q -- > 0) {
            int r = scanner.nextInt() - 1;
            int c = scanner.nextInt();
            if (x.get(r).size() < c) System.out.println("ERROR!");
            else System.out.println(x.get(r).get(c - 1));
        }
    }
}