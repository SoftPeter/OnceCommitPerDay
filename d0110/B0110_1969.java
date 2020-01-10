package d0110;

import java.util.Scanner;

public class B0110_1969 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = 0;
		int hd =0;
		String dna[] = new String[n];
		for(int i=0; i<n; i++) {
			dna[i] = sc.next();
		}
		
		for(int i=0; i<m; i++) {
			int a=0;
			int c=0;
			int g=0;
			int t=0;
			for(int j=0; j<n; j++) {
				switch(dna[j].charAt(i)) {
				case 'A': a++; break;
				case 'C': c++; break;
				case 'G': g++; break;
				case 'T': t++; break;
				}
			}
			max = Math.max(a, Math.max(c, Math.max(g, t)));
			hd += (n-max);
			System.out.print(toChar(a,c,g,t,max));
		}
		System.out.print("\n" + hd);
	}
	
	private static char toChar(int a, int c, int g, int t, int max) {
		if(max == a)	return 'A';
		else if(max == c)	return 'C';
		else if(max == g)	return 'G';
		else	return 'T';
	}
}
