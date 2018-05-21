package kadai5;

import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(translateEng(input));

	}
	public static String translateEng(int n) {
		String s;
		String one[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		String ten[] = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String Twoten = "twenty！！！！！！！";
		if(n/10==1)s = ten[n%10];
		else if(n%10!=0) s = one[n];
		else s = Twoten;
		return s;
	}
}
