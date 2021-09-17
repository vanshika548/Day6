import java.util.*;
public class PrimeNumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check whether is prime number or not");
		int num=sc.nextInt();
		int m=num/2,flag=0;
		if(num==0 || num==1) {
			System.out.println("Entered number is not prime number");
		}else {
			for(int i=2;i<=m;i++) {
				if(num%i==0) {
					System.out.println("Entered number is not prime number");
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println("Entered number is prime number");
			}
		}
	}
}
