import java.util.Scanner;

public class PetersonNumber {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to Check -");
		int n =sc.nextInt();
		int sof=0;
		int temp=n;
		while(temp!=0)
		{
			sof=sof+fact(temp%10);
			temp=temp/10;
		}
		if(sof==n)
		{
			System.out.println("peterson number");
		}else
		{
			System.out.println("not peterson number");
		}
	}
	static int fact(int a) {
		int f=1;
		for(int i=1;i<=a;i++)
		{
			f=i*f;
		}
		return f;
	}
}
