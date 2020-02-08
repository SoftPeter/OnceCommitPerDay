package d0207;

import java.util.*;


public class PG0207_SameNumber {
	public static void main(String[] args) {
		//[93,30,55]	[1,30,5]	[2,1]
		
		int[] arr = {1,1,3,3,0,1,1};
		System.out.println(Arrays.toString(solution(arr)));


	}

	public static int[] solution(int []arr) {
        
        ArrayList<Integer> al = new ArrayList<>();
        int tmp = -1;
        for(int i=0; i<arr.length; i++) {
        	if(tmp != arr[i]) {
        		al.add(arr[i]);
        		tmp = arr[i];
        	}
        }
        
        int[] answer = new int[al.size()];
        for(int i=0; i<al.size(); i++) {
        	answer[i] = al.get(i);
        	//System.out.println(answer[i]);
        }
        return answer;
	}
}