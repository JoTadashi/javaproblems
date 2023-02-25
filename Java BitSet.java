import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        BitSet[] bitSet = new BitSet[2];
        bitSet[0] = new BitSet(n);
        bitSet[1] = new BitSet(n);
        for (int i = 0; i < m; i ++) {
            String s = scanner.next();
            int L = scanner.nextInt(), R = scanner.nextInt();
            if (s.equals("AND")) bitSet[L - 1].and(bitSet[R - 1]);
            if (s.equals("OR")) bitSet[L - 1].or(bitSet[R - 1]);
            if (s.equals("XOR")) bitSet[L - 1].xor(bitSet[R - 1]);
            if (s.equals("FLIP")) bitSet[L - 1].flip(R);
            if (s.equals("SET")) bitSet[L - 1].set(R);
            System.out.println(bitSet[0].cardinality() + " " + bitSet[1].cardinality());
        }
    }
}