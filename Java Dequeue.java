import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer, Integer> mp = new HashMap<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] x= new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt(), cnt = 0;
            x[i] = num;
            if (mp.containsKey(num)) {
                cnt = mp.get(num) + 1;
            } else cnt = 1;
            mp.put(num, cnt);
            if (i >= m - 1) {
                ans = Math.max(ans, mp.size());
                num = mp.get(x[i - m + 1]) - 1;
                if (num == 0) mp.remove(x[i - m + 1]);
                else mp.put(x[i - m + 1], num);
            }
        }
        System.out.println(ans);
    }
}