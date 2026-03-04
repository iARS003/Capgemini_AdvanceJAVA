package Day_1;

public class Employee 
{
	String name;
	int net_worth;
	
	public String toString() {
		return "Employee [name=" + name + ", net_worth=" + net_worth + "]";
	}
	Employee()
	{
		
	}
	Employee(String name, int net_worth)
	{
		this.name=name;
		this.net_worth=net_worth;
	}
}
