import java.util.Scanner;
public class SpyNumber
{
    public static void main(String[] args)
	{       
		Scanner sc = new Scanner(System.in);
        	System.out.print("Enter Number: ");
        	int num = sc.nextInt();
        
        	int digit, sum = 0;
        	int Num = num;
        	int prod = 1;
        
        	while (num > 0) 
		{
            	digit = num % 10;
            
            	sum += digit;
            	prod *= digit;
            	num /= 10;
		}
		if (sum == prod)
			System.out.println(Num + " is Spy Number");
		else
            	System.out.println(Num + " is not Spy Number");
	}
}