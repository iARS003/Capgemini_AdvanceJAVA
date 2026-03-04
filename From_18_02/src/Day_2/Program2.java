package Day_2;
import java.util.Comparator;
import java.util.List;

public class Program2 
{
	public static void main(String[] args) 
	{
		List <Student> s = List.of(
				new Student ("A",98,22),
				new Student ("B",33,18),
				new Student ("K",88,21),
				new Student ("Z",22,19)				
				);
		/*
		List<Student> passed = s.stream()
				.filter(n->n.marks>=60)
				.filter(n->n.name.startsWith("A"))
//				.peek(n->System.out.println("Passed: "+n.name))
//				.map(n->new Student(n.name,n.marks*2,n.age))
//				.peek(n->n.setMarks(n.marks*2)) // Its return type is void so it is  mutate
				.peek(System.out::println)
				.toList();
//		System.out.println(passed+" This list size is "+passed.size());
//		for (Student s1 : passed)
//			System.out.print(s1.name+", ");
		*/
		List<Student> passed = s.stream()
				.sorted(Comparator
						.comparingInt((Student n)->n.marks)
						.thenComparing(n->n.name)
						)
				.peek(System.out::println)
				.toList();
				
	}
}
class Student
{
	String name;
	int marks;
	int age;
	public String toString()
	{
		return this.name+"->"+this.marks+"->"+this.age;
	}
	Student (String name, int marks, int age)
	{
		this.name=name;
		this.marks=marks;
		this.age=age;
	}
	void setMarks(int marks)
	{
		this.marks=marks;
	}
}