import java.lang.String;
class Table{
synchronized void printTable(int n){
	System.out.println("Table of 11");
for(int i=1;i<=10;i++){
System.out.println(n*i);
try{
Thread.sleep(100);
}catch(Exception e){System.out.println(e);}
}
System.out.println("-------------------------------------------------------------------------------");
}
public void  primeNumbers() {
       int i =0;
       int num =0;
       String  primeNumbers = "";

       for (i = 1; i <= 100; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(primeNumbers);
       System.out.println("-------------------------------------------------------------------------------");
   }

public void sequence(int y) {
	System.out.print("Sequence=");
	for(int i=1;i<=10;i++)
	{
		y=y*i;
		System.out.print(y+"  ");
		try{
			Thread.sleep(100);
			}catch(Exception e){System.out.println(e);}
		}
	}
}
public class Multithreading{
public static void main(String args[]){
final Table obj = new Table();
Thread t1=new Thread();
obj.printTable(11);
t1.start();
Thread t2=new Thread();
obj.primeNumbers();
t2.start();
Thread t3=new Thread();
obj.sequence(3);
t3.start();
}
}
