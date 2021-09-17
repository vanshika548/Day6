import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class SimulateStopwatch {
	public static void main(String[]args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entered the start time: ");
		String startTime=sc.next();
		System.out.println("Entered the end time: ");
		String endTime=sc.next();
		SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss");
		Date date1=format.parse(startTime);
		Date date2=format.parse(endTime);
		long differnce=date2.getTime()-date1.getTime();;
		System.out.println("Difference between the start time and end time is: "+differnce);
	}
}
