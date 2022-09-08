//2.Write a Java program to calculate your age in Java 8.

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeCalculator {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		 int d=sc.nextInt();
		 //System.out.println(d);
		 int m=sc.nextInt();
		 //System.out.println(m);
		 int y=sc.nextInt();
		 //System.out.println(y);
		LocalDate dob=LocalDate.of(y, m, d);
		LocalDate Today=LocalDate.now();
		long years=ChronoUnit.YEARS.between(dob,Today);
		//long months=ChronoUnit.MONTHS.between(dob,Today);
		//long days=ChronoUnit.DAYS.between(dob,Today);
		System.out.println(years+" -years old");
		//System.out.println(months+" -months old");
		//System.out.println(days+" -days old");
	}
}
