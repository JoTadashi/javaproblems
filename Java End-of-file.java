import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = 0;
        while(true) {
            String s = scanner.nextLine();
            System.out.printf("%d %s\n", ++cnt, s);
            if (!scanner.hasNext()) break;
        }
    }
}
