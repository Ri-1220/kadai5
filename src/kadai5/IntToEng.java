package kadai5;

import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(translateEng(input));

	}
	static String translateEng(int n) {
		String s;
		String one[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String ten[] = {"ten"};
		if(n%10==0) s = one[n];
		else s = ten[n];
		return s;
	}
}
