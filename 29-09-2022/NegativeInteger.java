import java.util.Scanner; 
  
class NegativeInteger{    
    public static void main(String arg[]) 
    { 
    	Scanner sc=new Scanner(System.in);
		System.out.println("no of elemnts in array");
		int n =sc.nextInt();//no of elements
		int arr[]=new int[n];
		System.out.println("enter Elements of array");
		for(int i=0;i<n;i++)//to get value at each index
		{
			arr[i]=sc.nextInt();//elements of array
		}
		System.out.println("array elements are");
		for(int i=0;i<n;i++)//to get what value is at each index
		{
			System.out.println(arr[i]);//to print values of array at each index
		}
  
        Elements(arr, n); 
  
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
    static void Elements(int arr[], int n) //to rearrange 
    { 
          
        // Create an empty array to store result 
        int temp[] = new int[n]; 
  
        // Traversal array and store positive element in 
        // new array 
        int j = 0; // index of new array 
          
        for (int i = 0; i < n; i++) 
            if (arr[i] >= 0) 
                temp[j++] = arr[i]; 
  
        // If array contains all positive or all negative.    
        if (j == n || j == 0) 
            return; 
  
        // Store negative element in new  array 
        for (int i = 0; i < n; i++) 
            if (arr[i] < 0) 
                temp[j++] = arr[i]; 
  
        // Copy contents of new array to original
        for (int i = 0; i < n; i++) 
           arr[i] = temp[i]; 
    } 
} 