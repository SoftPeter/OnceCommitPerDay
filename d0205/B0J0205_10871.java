package d0205;

import java.util.*;

public class B0J0205_10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int ar[] = new int[n];
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<n; i++) {
			ar[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(ar[i] < x) {
				list.add(ar[i]);
			}
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
	}
}