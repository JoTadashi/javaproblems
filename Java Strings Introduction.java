import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len = A.length() + B.length();
        String s = A.compareTo(B) > 0 ? "Yes" : "No";
        String C = A.toUpperCase().charAt(0) + A.substring(1);
        String D = B.toUpperCase().charAt(0) + B.substring(1);
        System.out.println(len);
        System.out.println(s);
        System.out.println(C + " " + D);
    }
}



