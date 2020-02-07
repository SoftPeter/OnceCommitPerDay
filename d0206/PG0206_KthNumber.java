package d0206;

import java.util.*;


public class PG0206_KthNumber {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
		int [] array = {1,5,2,6,3,7,4};
		int [][] c = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
		
		System.out.println(solution(array, c));


	}

	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int tmp[] = {};
        
        for(int i=0; i<commands.length; i++) {
			tmp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(tmp);
			answer[i]=tmp[commands[i][2]-1];
			
		}
		return answer;
	}
}