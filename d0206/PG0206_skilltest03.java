package d0206;

import java.util.*;

public class PG0206_skilltest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(solution(s));
		
		  
		 

	}

	private static String solution(String s) {
		// TODO Auto-generated method stub
		/*String answer = "";
		int cnt = 0;
		String[] array = s.split("");

		for (String ss : array) {
			cnt = ss.contains(" ") ? 0 : cnt + 1;
			answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
		}
		return answer;
		*/
		String str[] = s.split("");
		  
		//for (int i = 0; i < str.length; i++)
			//System.out.println(str[i]);

		int cnt = 0;
		String ans = "";
		for (String st : str) {
			if (st.contains(" ")) {
				cnt = 0;
			} else {
				cnt = cnt + 1;
			}
			System.out.println(cnt);
			if (cnt % 2 == 0) {
				ans += st.toLowerCase();
			} else {
				ans += st.toUpperCase();
			} 
		}

		return ans;
	}
}
