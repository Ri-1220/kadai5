package kadai5;

import java.util.Scanner;

public class IntToEng {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println(translateEng(input));

	}
	public static String translateEng(int n) {
		String s=""; String str="";
		int m=n%100;
		String one[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String ten[] = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		if(n/1000==1) str = "One Thousand ";
		else if(n/100==1) str = "One Hundred ";
		else if(n/100==2) str = "Two Hundred ";
		else if(n/100==3) str = "Three Hundred ";
		else if(n/100==4) str = "Four Hundred ";
		else if(n/100==5) str = "Five Hundred ";
		else if(n/100==6) str = "Six Hundred ";
		else if(n/100==7) str = "Seven Hundred ";
		else if(n/100==8) str = "Eight Hundred ";
		else if(n/100==9) str = "Nine Hundred ";
		if(m/10==9) {
			if(m%10==0) s = "Ninety";
			else s="Ninety"+one[m%10];
		}
		else if(m/10==8) {
			if(m%10==0) s = "Eighty";
			else s="Eighty"+one[m%10];
		}
		else if(m/10==7) {
			if(m%10==0) s = "Seventy";
			else s="Seventy"+one[m%10];
		}
		else if(m/10==6) {
			if(m%10==0) s = "Sixty";
			else s="Sixty"+one[m%10];
		}
		else if(m/10==5) {
			if(m%10==0) s = "Fifty";
			else s="Fifty"+one[m%10];
		}
		else if(m/10==4) {
			if(m%10==0) s = "Fourty";
			else s="Fourty"+one[m%10];
		}
		else if(m/10==3) {
			if(m%10==0) s = "Thirty";
			else s="Thirty"+one[m%10];
		}
		else if(m/10==2) {
			if(m%10==0) s = "Twenty";
			else s="Twenty"+one[m%10];
		}
		else if(m/10==1)s = ten[m%10];
		else if(m/10==0) s = one[m];
		
		if(n%100==0) return str;
		return str+s;
	}
}
