import java.util.*;
public class Fibbonacci {
	static int i1=0,i2=1,i3;
	static void fibbonacci (int count) {
		if(count>0) {
		i3=i1+i2;//i3=1
		i1=i2;  //i1=1
		i2=i3;//i2=1
System.out.print(" "+i3);
		 fibbonacci(count-1) ;
		}
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number up to which you want fibbonacci series: ");
		int n=sc.nextInt();
		System.out.print(i1+ " "+i2);
		fibbonacci(n-2);
	}
}
