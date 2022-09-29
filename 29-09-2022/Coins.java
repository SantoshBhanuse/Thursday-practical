import java.util.Scanner;

public class Coins {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("no of elemnts in array");
		int n =sc.nextInt();//no of elements
		System.out.println("what sum you want to get ");
		int sum=sc.nextInt();//sum what you want 
		int coins[]=new int[n];
		System.out.println("enter Elements of array");
		for(int i=0;i<n;i++)//to get value at each index
		{
			coins[i]=sc.nextInt();//elements of array
		}
		System.out.println("array elements are");
		for(int i=0;i<n;i++)//to get what value is at each index
		{
			System.out.println(coins[i]);//to print values of array at each index
		}
		System.out.println("The possible ways in which sum " + sum
        		+ " can be made is " + ways(coins, sum));//final output
	}

	static int ways(int[] coins, int sum) {
	      // Declaring a array for sorting
			int l=coins.length;
	    	int[][] arr = new int[l + 1][sum + 1];
	    	
	      // Initializing first column 
	    	for(int i = 0; i < l + 1; i++)
	    		arr[i][0] = 1;
	    	
	    	//loop to pick coins
	    	for(int i = 1; i < l + 1; i++)
	    		for(int j = 0; j < sum + 1; j++)
	    			if(coins[i - 1] > j)  // to not pick the highest coin:
	    				arr[i][j] = arr[i - 1][j];
	    			else  // Pick the highest coin:
	    				arr[i][j] = arr[i][j - coins[i - 1]] + arr[i - 1][j];
	    	
	    	return arr[l][sum];
	    }
	}	
