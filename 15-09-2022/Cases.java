import java.util.Scanner;

public class Cases 
{
   public static void main (String[] args)
    {
	   Scanner a = new Scanner(System.in);
	   System.out.print("Enter number of specified characters= ");
	   int n = a.nextInt();//input specific number of characters
	   Scanner b =new Scanner(System.in);
	   System.out.print("Enter characters : ");
       String str = b.nextLine();//input exact characters
       if(n==str.length())
        {
        	String Uppercase = str.toUpperCase();
        	System.out.println();
        	System.out.println("input characters are : " + str);
        	System.out.println("characters in Uppercase are: " + Uppercase);
        }
        else
        {
        	System.out.println("Invalid input");
        }
    }
}