import java.util.*;
public class LoopMultiply {

	public static void main(String[] args) { // begin the main method
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a numberof last row you want= ");
		int num = sc.nextInt(); // initialize variables
		System.out.println();
		System.out.printf("\tN\t10*N\t20*N\t30*N\t40*N\t50*N\n\n", num, num*10,
		num*20, num*30,num*40,num*50); // display header
		for (int i=1; i<=num;i++){ // loop five times, 1 to 5
		System.out.printf("\t%d\t%d\t%d\t%d\t%d\t%d\n",i, i*10,i*20,
				i*30,i*40, i*50); // display the table of values
		}
		}
}