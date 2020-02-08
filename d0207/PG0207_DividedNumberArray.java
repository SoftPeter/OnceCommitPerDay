package d0207;

import java.util.*;


public class PG0207_DividedNumberArray {
	public static void main(String[] args) {
		
		int[] arr = {2,36,1,3};
		int divisor = 1;
		System.out.println(Arrays.toString(solution(arr, divisor)));

	}

	public static int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%divisor == 0) {
				list.add(arr[i]);
			}
		}
		
		answer = new int[list.size()];
		if(list.size()==0) {
			answer = new int[1];
			answer[0]=-1;
		} else {
			for(int i=0; i<list.size(); i++) {
				answer[i] = list.get(i);
			}
			Arrays.sort(answer);
		}
		return answer;
	}
}