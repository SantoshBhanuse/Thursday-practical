class Employee
{
  	private String name, address;
  	private int year, salary;
  	public Employee(String n, int y, int sal, String add)
	{
    		name = n;
    		year = y;
    		salary = sal;
    		address = add;
  	}
  	public String getName()
	{
    		return name;
  	}
  	public int getYear()
	{
    		return year;
  	}
  	public int getSalary()
	{
    		return salary;
  	}
  	public String getAddress()
	{
    		return address;
  	}
	public static void main(String[] args)
	{
    		Employee e1 = new Employee("Robert", 1994, 70000, "64C- WallsStreet");
    		Employee e2 = new Employee("Sam", 2000, 50000, "68d- WallsStreet");
    		Employee e3 = new Employee("John", 1999, 54000, "26B- WallsStreet");
    		System.out.println("Name\t\tYear of joining\t\tSalary\t\tAddress");
    		System.out.println(e1.getName()+"\t\t"+e1.getYear()+"\t\t\t"+e1.getSalary()+"\t\t"+e1.getAddress());  
    		System.out.println(e2.getName()+"\t\t"+e2.getYear()+"\t\t\t"+e2.getSalary()+"\t\t"+e2.getAddress()); 
    		System.out.println(e3.getName()+"\t\t"+e3.getYear()+"\t\t\t"+e3.getSalary()+"\t\t"+e3.getAddress());  
  	}
}