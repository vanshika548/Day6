import java.util.*;
public class CouponNumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max=100000000;
		int random=(int) (Math.random()*max);	
		String s=" ";
		
		while (random>0)
		{
			s=s+(chars[random % chars.length]);
			random /= chars.length;
		}

		//String couponCode=sb.toString();
		System.out.println("Coupon Code: "+s);	
		
	}
}
