package d0207;

import java.util.*;


public class PG0207_LargestNumber {
	public static void main(String[] args) {
		//[93,30,55]	[1,30,5]	[2,1]
		
		int[] arr = {3,30,34,5,9};
		System.out.println((solution(arr)));


	}

	public static String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        
        for(int i=0; i<str.length; i++) {
        	str[i] = String.valueOf((numbers[i]));
        }
        
        Arrays.sort(str, new Comparator<String>() {
        	@Override
        	public int compare(String o1, String o2) {
        		// TODO Auto-generated method stub
        		return (o2+o1).compareTo(o1+o2);
        	}
		});
        
        if(str[0].startsWith("0"))
        	answer += "0";
        else {
        	for(int i=0; i<str.length; i++)
        		answer += str[i];
        }
        
        return answer;
    }
}