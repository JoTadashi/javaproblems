import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> lt = new ArrayList<Integer>();
        for (int i = 0; i < n; i ++) {
            int val = scanner.nextInt();
            lt.add(i, val);
        }
        int q = scanner.nextInt();
        while(q -- > 0) {
            String s = scanner.next();
            int x = scanner.nextInt();
            if (s.equals("Insert")) {
                int y = scanner.nextInt();
                System.out.println(x + " " + y);
                lt.add(x, y);
            } else {
                lt.remove(x);
            }
        }
        for (int i = 0; i < lt.size(); i ++) {
            if (i > 0) System.out.printf(" ");
            System.out.printf("%d", lt.get(i));
        }

    }
}