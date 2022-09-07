import java.lang.String;
public class SL 
{
	public static void main(String[]args)
	{
		int n[] = new int[]{765,93,25,29,73,29,354,78,664};
		int smallest = n[0];
		int largest = n[0];
		for (int i = 1; i < n.length; i++)
		{
			if (n[i] > largest)
		    	largest = n[i];
			else if (n[i] < smallest)
		    	smallest = n[i];
		}
		System.out.println("Largest Number is : " + largest);
		System.out.println("Smallest Number is : " + smallest);	
	}
}
