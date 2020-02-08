package d0207;

import java.util.*;


public class PG0207_124World {
	private static int answer=0;
	public static void main(String[] args) {
		int n=5;
		System.out.println((solution(n)));

	}

	public static String solution(int n) {
	      String answer = "";
	      int r;
	      while(n>0) {
	    	  r = n%3;
	    	  n = n/3;
	    	  if(r==0) {
	    		  n-=1;
	    		  r=4;
	    	  }
	    	  answer = r+ answer;
	      }
	      return answer;
	  }


}