import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.lang.String;
public class RemoveDuplicate {
	public static void main(String[]args)
	{
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
	    primes.add(3);
	    primes.add(5);
	    primes.add(7); 
	    primes.add(7);
	    primes.add(11);
	    primes.add(13);
	    primes.add(17);
	    primes.add(23);
	    primes.add(17);
	    primes.add(19);
	    primes.add(2);
	    primes.add(3);
	    System.out.println("List of prime numbers:"+primes);
	    List<Integer> primesWithoutDuplicates= new LinkedList<Integer>(primes);
	    primes.clear();
	    primes.addAll(primesWithoutDuplicates);
	    System.out.println("list of primes without duplicates:"+primes); 
	}
}