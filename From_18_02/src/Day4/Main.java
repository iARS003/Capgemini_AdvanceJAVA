package Day4;
import java.util.*;

public class Main 
{
	public static void main (String [] args)
	{
		ArrayList <Object> l = new ArrayList<>();
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        for (int i=1;i<=t;i++)
	        {
	            String str = sc.next();
	            if (str.equals("Student")) 
	            {
	                l.add(new Student());
	            }
	            if (str.equals("Rockstar")) 
	            {
	                l.add(new Rockstar());
	            }
	            if (str.equals("Hacker")) 
	            {
	                l.add(new Hacker());
	            }
	        }
	        int a=0,b=0,c=0;
	        for (Object o: l)
	        {
	            if (o instanceof Student)
	                a++;
	            if (o instanceof Rockstar)
	                b++;
	            if (o instanceof Hacker)
	                c++;
	        }
	        System.out.println(a+" "+b+" "+c);    
	    }
}
class Rockstar{}
class Student{}
class Hacker{}

