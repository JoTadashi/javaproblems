//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();   in.nextLine();
        Map<String, Integer> mp = new HashMap<>();
        while(n -- > 0) {
            String key = in.nextLine();
            int val = in.nextInt(); in.nextLine();
            mp.put(key, val);
        }
        while(in.hasNext()) {
            String s = in.nextLine();
            if (mp.containsKey(s)) {
                System.out.println(s + "=" + mp.get(s));
            } else System.out.println("Not found");
        }
	}
}



