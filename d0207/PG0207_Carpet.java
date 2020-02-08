package d0207;

import java.util.*;

public class PG0207_Carpet {
	private static int answer = 0;

	public static void main(String[] args) {
		// [119, 97674223, 1195524421]
		int brown = 10;
		int red = 2;
		System.out.println(Arrays.toString(solution(brown, red)));

	}

	public static int[] solution(int brown, int red) {
        int[] answer = {};
        answer = new int[2];
        int w = brown + red;
        
        for(int i=1; i<=w/2; i++) {
        	if(w%i == 0) {
        		int n = i;
        		int m = w/n;
        		if(n<m)
        			continue;
        		int tmp = (n-2)*(m-2);
        		int tmp2 = w-tmp;
        		if(tmp == red && tmp2 == brown) {
        			answer[0] = n;
        			answer[1] = m;
        		}
        	}
        }
        return answer;
    }
}