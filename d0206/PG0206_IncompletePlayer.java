package d0206;

import java.util.*;


public class PG0206_IncompletePlayer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] participant = {"leo","kiki","eden"};
		String[] completion = {"eden","kiki"};
		
		System.out.println(solution(participant, completion));

	}

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i;
        for(i=0; i<completion.length; i++) {
        	if(!participant[i].equals(completion[i])) {
        		return participant[i];
        	}
        }
        return participant[i];
        //return answer;
    }
}
