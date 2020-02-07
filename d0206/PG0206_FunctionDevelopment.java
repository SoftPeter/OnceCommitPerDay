package d0206;

import java.util.*;


public class PG0206_FunctionDevelopment {
	public static void main(String[] args) {
		//[93,30,55]	[1,30,5]	[2,1]
		int[] p = {93,30,55};
		int[] s = {1,30,5};
		System.out.println(Arrays.toString(solution(p,s)));


	}

	public static int[] solution(int[] progresses, int[] speeds) {
        
        int len = progresses.length;
        LinkedList<Integer> q = new LinkedList<>();
        
        for(int i=0; i<len; i++) {
        	if(((100-progresses[i])%speeds[i])==0) {
        		q.add((100-progresses[i])/speeds[i]);
        	} else {
        		q.add(((100-progresses[i])/speeds[i]) +1);
        	}
        }
       
        
        List<Integer> list = new ArrayList<>();
        
        int cnt = 1;
        int st = q.poll();
        while(!q.isEmpty()) {
        	int tmp = q.poll();
        	if(st >= tmp) {
        		cnt++;
        	} else {
        		list.add(cnt);
        		cnt = 1;
        		st = tmp;
        	}
        }
        list.add(cnt);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
}