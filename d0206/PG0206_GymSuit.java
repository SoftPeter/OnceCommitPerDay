package d0206;

import java.util.*;


public class PG0206_GymSuit {
	public static void main(String[] args) {
		//5	[2, 4]	[1, 3, 5]	5
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		
		System.out.println(solution(n, lost, reserve));


	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int l = 0;
		int r = 0;

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if(lost[i] == reserve[j]) {
					lost[i]=reserve[j]=-1;
					l++;
					break;
				}
			}
		}

		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
					reserve[j] = -1;
					r++;
					break;
				}
			}
		}
		
        answer = n-lost.length+l+r;
        return answer;
    }
}