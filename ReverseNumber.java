import java.util.*;
public class ReverseNumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to reverse:");
		int beforeReverse=sc.nextInt();
		int afterReverse=0;
		int temp=beforeReverse;
		while(beforeReverse!=0) {
			int rem=beforeReverse%10;
			afterReverse=afterReverse*10+rem;
			beforeReverse=beforeReverse/10;
		}
		System.out.println("Number before reversing "+temp+ " Number after reversing "+afterReverse);
	}
}
