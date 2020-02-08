package d0207;

import java.util.*;


public class PG0207_TargetNumber {
	private static int answer=0;
	public static void main(String[] args) {
		int[] numbers = {1,1,1,1,1};
		int target = 3;
		System.out.println((solution(numbers, target)));

	}

	public static int solution(int[] numbers, int target) {
		int[] flag = new int[numbers.length];
		DFS(numbers, target, flag, 0);
        return answer;
    }

	private static void DFS(int[] numbers, int target, int[] flag, int depth) {
		if(depth == numbers.length) {
			int sum=0;
			int max = numbers.length;
			for(int i=0; i<max; i++) {
				if(flag[i]==1)
					sum += numbers[i];
				else
					sum -= numbers[i];
			}
			if(sum == target)
				answer++;
			return;
		}
		flag[depth]=1;
		DFS(numbers, target, flag, depth+1);
		
		flag[depth]=0;
		DFS(numbers, target, flag, depth+1);
	}


}