import java.util.*;
class Solution{
	
    static boolean valid(String s) {
        Stack<Character> S = new Stack<>();
        int len = s.length();
        for (int i = 0; i < len; i ++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                S.add(c);
            } else {
                if (S.isEmpty()) return false;
                char now = S.pop();
                if (c == '}' && now != '{') return false;
                if (c == ']' && now != '[') return false;
                if (c == ')' && now != '(') return false;
            }
        }
        return S.isEmpty();
    }
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println(valid(s));
		}
		
	}
}



