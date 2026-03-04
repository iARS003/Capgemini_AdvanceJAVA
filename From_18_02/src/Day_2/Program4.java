package Day_2;

import java.util.*;

public class Program4 
{
	public static void main(String[] args) 
	{
		
	
		List <Student3> s = List.of(
				new Student3 ("Ram",20),
				new Student3 ("Hari",17),
				new Student3 ("Sita",25)
				);
		// 1
		List <Student3> name = s.stream()
				.peek(n->System.out.print(n.name+", "))
				.toList();
		
		// 2
		long count = s.stream()
				.count();
		System.out.println(count);
		
		// 3
		List <Student3> new_age = s.stream()
				.filter(n->(n.age>18&&n.age<40))
				.map(n->new Student3(n.name,n.age*2))
				.toList();
		System.out.println(new_age);
		
		// 4
		List <Student3> s1 = s.stream()
				.filter(n->n.age<18)
				.toList();
		System.out.println(s1);
		// 5
		

		// 6
		boolean hasAdult = s.stream()
				.allMatch(n->n.age>18);
		System.out.println(hasAdult);
		
	}
}
class Student3
{
	String name;
	int age;
	public String toString()
	{
		return this.name+" -> "+this.age;
	}
	Student3(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
}
