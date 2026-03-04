package Day_1.com;

public class Main 
{
	public static void main(String[] args) 
	{
//		Demo demo=new DemoImpl();
//		demo.sample();
		/* 
		   If the method is not an argument method and not a return 
		   type method in the Functional Interface 
		*/
		/*
		Demo demo=()->{
			System.out.println("Method Implied by using Lambda Expression");
		};
		Demo demo1=()->
			System.out.println("Without block Method Implied by using Lambda Expression");
		
		demo.sample();
		demo1.sample();
		*/
		
		/* If the method is single argument method and Single statement is provide
		   for the method */
		/*
		Demo demo=(num)->{
			System.out.println(num +" : "+"For Argument Method");
		};
		Demo demo1 = num-> System.out.println("New Style");
		demo.sample(100);
		demo1.sample(100);
		*/
		/*
		Demo demo = (a,b)->{
			System.out.println(a+b);
		};
		demo.sample(10,20);
		Demo demo1 = (a,b)->
			System.out.println(a+b);
		demo1.sample(10,20);
		*/
		
		Demo demo = (a,b)->
		{
			return a+b;
		};
		System.out.println(demo.sample(10,10));
	}
}
