package Myself;

import java.io.FileWriter;
import java.io.IOException;

public class Program1_FileHandling 
{
	public static void main(String[] args) 
	{
		try (FileWriter writer = new FileWriter("test.txt"))
		{
			writer.write("I like pizza");
			System.out.println("Mission Accomplish");
		}
		catch (IOException e)
		{
			System.out.print("Could not write in this file");
		}
	}
}
