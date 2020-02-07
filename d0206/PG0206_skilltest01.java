package d0206;


import java.util.*;

public class PG0206_skilltest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
	    long[] arr = new long[n];
	    for (int i = 0; i < n; i++) {
	    	long answer = x * (i+1L);
	    	arr[i] = answer;
	    }
	    
	    //return arr;
	}
}