package d0205;

import java.util.*;

public class B0J0205_9498 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력
		int n = sc.nextInt();
		if(n >= 90)
			System.out.println("A");
		else if(n >= 80)
			System.out.println("B");
		else if(n >= 70)
			System.out.println("C");
		else if(n >= 60)
			System.out.println("D");
		else
			System.out.println("F");
	}
}