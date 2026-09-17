import java.util.Scanner;
 
 
 public class Convert {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("Total second?");
	final int S_PER_M = 60;
	final int M_PER_H = 60;
	int S = in.nextInt();
	int minute = (int) (S / S_PER_M);
	int hour = minute / M_PER_H;
	int remH = S % M_PER_H;
	int Rhour = minute % M_PER_H;
	System.out.printf("%d Hours, %d Minutes, %d Seconds", hour, Rhour, remH);
	
}
}
	
