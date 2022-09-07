import java.util.ArrayList;
import java.lang.String;

public class ARR{
	public static void main(String[]args)
	{
		ArrayList<String> Arr=new ArrayList<String>();
		Arr.add("Santosh");
		Arr.add("Sanket");
		Arr.add("Khalid");
		Arr.add("Younus");
		Arr.add("Shubham");
		System.out.println("elements of Arr:"+Arr);
		ArrayList<String> Arr1=new ArrayList<String>();
		Arr1.add("Satyam");//add
		Arr1.add("Ravi");
		Arr1.add("Netraji");
		System.out.println("elements of Arr1:"+Arr1);
		Arr1.addAll(Arr);
		System.out.println("elements of both Arr and Arr1:"+Arr1);
		Arr1.remove("Younus");//remove
		Arr1.remove("Ravi");
		System.out.println("elements after removing:"+Arr1);
		System.out.println("the element at 3rd index is:"+Arr1.get(3));//retrieve
	}
}