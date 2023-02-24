import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        String[] ans = s.split("[\'* !,?._@]+", 0);
        System.out.println(s.isEmpty() ? 0 : ans.length);
        for (String x : ans) {
            System.out.println(x);
        }
        scan.close();
    }
}

