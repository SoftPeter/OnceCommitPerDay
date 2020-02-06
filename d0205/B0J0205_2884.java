package d0205;

import java.util.*;

public class B0J0205_2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//10 10 => 9 25
		//45분 일찍 알람 맞추기 
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m >= 45) {
			System.out.println(h + " " + (m-45));
		} else {
			if(h == 0) {
				System.out.println(23 + " " + ((m+60) - 45));
			} else
				System.out.println((h-1) + " " + ((m+60) - 45));
		}
	}
}