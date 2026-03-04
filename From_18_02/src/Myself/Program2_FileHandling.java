package Myself;
import java.io.*;
public class Program2_FileHandling 
{
	public static void main(String[] args) 
	{
		try(BufferedReader reader = new BufferedReader(new FileReader("test.txt")))
		{
			String line;
			while((line = reader.readLine())!= null)
			{
				System.out.println(line);
			}
		}
		catch (IOException e)
		{
			System.out.println(e);
		}
	}
}
