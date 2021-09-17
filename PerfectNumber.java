import java.util.*;

public class PerfectNumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check whether is perfect number or not");
		int num=sc.nextInt();
		int sum=1;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println("Entered number is perfect number");
		}else {
			System.out.println("Entered number is not perfect number");
		}
	}
}
