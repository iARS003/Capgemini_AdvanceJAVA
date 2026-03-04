package Day_2;

import java.util.*;

public class Program3 
{
	public static void main(String[] args) 
	{
		List <Student1> students = List.of(
				new Student1 ("A",98,22),
				new Student1 ("B",33,18),
				new Student1 ("K",88,21),
				new Student1 ("Z",22,19)				
				);
		long count =
				students.stream()
				.filter(n->n.getAge()>18)
				.count();
		System.out.println(count);
		// filter + peek + map + sorted + toList
        List<Student1> passed = students.stream()
                .filter(s -> s.marks > 50)
                .peek(s -> System.out.println("Passed: " + s.name))
                .map(s -> new Student1(s.name, s.marks * 2, s.age))
                .sorted(Comparator.comparingInt(s -> s.marks))
                .toList();

        System.out.println("\nPassed Students After Modification:");
        System.out.println(passed);

        // anyMatch()
        boolean hasTopper = students.stream()
                .anyMatch(s -> s.marks > 75);

        System.out.println("\nAny student with marks > 75? " + hasTopper);

        // findFirst()
        Optional<Student1> firstPassed = students.stream()
                .filter(s -> s.marks > 50)
                .findFirst();

        firstPassed.ifPresent(s -> 
                System.out.println("\nFirst Passed Student: " + s));
    }
	
}
class Student1
{
	String name;
	int marks;
	int age;
	public String toString()
	{
		return this.name+"->"+this.marks+"->"+this.age;
	}
	Student1 (String name, int marks, int age)
	{
		this.name=name;
		this.marks=marks;
		this.age=age;
	}
	void setMarks(int marks)
	{
		this.marks=marks;
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setAge(int age)
	{
		this.age=age;
	}
	int getAge()
	{
		return this.age;
	}
	int getMarks()
	{
		return this.marks;
	}
	String getName()
	{
		return this.name;
	}
}