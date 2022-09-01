@FunctionalInterface
interface factorial{
	public void check (int a);
}
public class FactorialProgram {

	public static void main(String[] args) {
		factorial n=(int num)->{
		int ans=1;
		for(int i=1; i<=num; i++)
		{
			ans=ans*i;
		}
		System.out.println("Factorial:"+ans);
	};
	n.check(5);
	n.check(3);
	n.check(8);
}

}