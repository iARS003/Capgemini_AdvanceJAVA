package Day_1;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) 
	{
		Employee []emp = new Employee[5];
		emp[0] = new Employee("Dbc",1);
		emp[1] = new Employee("Bbc",9);
		emp[2] = new Employee("Abc",3);
		emp[3] = new Employee("Bec",3);
		emp[4] = new Employee("Azc",3); 
		
		System.out.println(Arrays.toString(emp));
		for (int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				if (emp[i].net_worth > emp[j].net_worth)
				{
					int temp1 = emp[i].net_worth;
					emp[i].net_worth = emp[j].net_worth;
					emp[j].net_worth = temp1;
					String temp2 = emp[i].name;
					emp[i].name = emp[j].name;
					emp[j].name=temp2;
				}
				else if (emp[i].net_worth == emp[j].net_worth)
				{
					if (emp[i].name.toCharArray()[0]<emp[j].name.toCharArray()[0])
					{
						String temp = emp[i].name;
						emp[i].name = emp[j].name;
						emp[j].name = temp;
//						int temp1 = emp[i].net_worth;
//						emp[i].net_worth = emp[j].net_worth;
//						emp[j].net_worth = temp1;
					}
					else if (emp[i].name.toCharArray()[0]==emp[j].name.toCharArray()[0])
					{
						if (emp[i].name.toCharArray()[1]<emp[j].name.toCharArray()[1])
						{
							String temp = emp[i].name;
							emp[i].name = emp[j].name;
							emp[j].name = temp;
//							int temp1 = emp[i].net_worth;
//							emp[i].net_worth = emp[j].net_worth;
//							emp[j].net_worth = temp1;
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(emp));
	}
}
