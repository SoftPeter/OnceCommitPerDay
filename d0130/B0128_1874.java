package d0130;

import java.io.*;
import java.util.*;

public class B0128_1874 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int str[] = new int[num];
		Stack<Integer> stack = new Stack<>();
		ArrayList<String> al = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			str[i] = Integer.parseInt(br.readLine());
		}
		
		int cnt = 1;
		
		for(int i=0; i<num; i++) {
			while(cnt <= str[i]) {
				stack.push(cnt);
				al.add("+");
				cnt++;
			}
			
			if(stack.peek() == str[i]) {
				stack.pop();
				al.add("-");
			} else {
				System.out.println("NO");
				return;
			}
		}
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
	}
}