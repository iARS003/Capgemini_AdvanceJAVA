package Day_2;
import java.util.*;

public class Program1 
{
	public static void main(String[] args) 
	{
		List <Integer> list = Arrays.asList(1,2,3,4,5,6);
//		List <Integer> even = new ArrayList<>();
//		
//		for (Integer n:list)
//		{
//			if(n%2==0)
//				even.add(n);
//		}
		
		List <Integer> even = list.stream() // source
				.filter(n -> n%2==0) // inter
				.map(n->n*2) // inter
				.toList(); // collect or terminal
		
		// Collection -> Stream -> Filter -> Transform -> Collect -> Result
		// Charac
	}
}
