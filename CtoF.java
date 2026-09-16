import java.util.Scanner;

 import java.util.Scanner;
 
 
 
 public class CtoF {
 public static void main(String[] args) {
 
	Scanner in = new Scanner(System.in);
	System.out.print("How many Celsius? ");
	double C = in.nextDouble();
	final double F = C* (1.8) + 32;
	//System.out.println(C + " C = " + F + " F" );
	System.out.printf("%.1f C = %.1f F", C, F);
						
}
}
	
	
