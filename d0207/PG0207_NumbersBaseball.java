package d0207;

import java.util.*;


public class PG0207_NumbersBaseball {
	public static void main(String[] args) {
		//[[123, 1, 1], [356, 1, 0], [327, 2, 0], [489, 0, 1]]	2
		int[][] baseball = {{123, 1, 1},{356, 1, 0},{327, 2, 0},{489, 0, 1}};
		System.out.println((solution(baseball)));

	}

	public static int solution(int[][] baseball) {
		int answer = 0;
		Stack<String> st = new Stack<>();
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				for(int k=1; k<=9; k++) {
					if(i!=j && j!=k && j!= i) {
						st.push(String.valueOf(100*i+10*j+k));
					}
				}
			}
		}
		String num;
		while(!st.isEmpty()) {
			num=st.pop();
			if(check(num, baseball)) {
				answer++;
			}
		}
		
		return answer;
	}

	private static boolean check(String num, int[][] baseball) {
		// TODO Auto-generated method stub
		String base = "";
		int strike=0, ball=0;
		for(int i=0; i<baseball.length; i++) {
			base = String.valueOf(baseball[i][0]);
			for(int j=0; j<3; j++) {
				if(num.charAt(j) == base.charAt(j))
					strike++;
				if(base.contains(String.valueOf(num.charAt(j))))
					ball++;
			}
			ball = ball-strike;
			if(strike != baseball[i][1] || ball != baseball[i][2])
				return false;
			strike=0;
			ball=0;
		}
		return true;
	}

}