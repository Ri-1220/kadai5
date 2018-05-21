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
		if(n/10==6) {
			if(n%10==0) s = "sixty";
			else s="sixty"+one[n%10];
		}
		else if(n/10==5) {
			if(n%10==0) s = "fifty";
			else s="fifty"+one[n%10];
		}
		else if(n/10==4) {
			if(n%10==0) s = "fourty";
			else s="fourty"+one[n%10];
		}
		else if(n/10==3) {
			if(n%10==0) s = "thirty";
			else s="thirty"+one[n%10];
		}
		else if(n/10==2) {
			if(n%10==0) s = "twenty";
			else s="twenty"+one[n%10];
		}
		else if(n/10==1)s = ten[n%10];
		else  s = one[n];
		return s;
	}
}
