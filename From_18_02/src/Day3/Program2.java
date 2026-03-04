package Day3;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Program2 
{
	public static void main(String[] args) throws IOException 
	{
		// It won't create physical file, it just pointing to that path 
		File file = new File("Test.java");
		System.out.println("File Object created");
		
		if (file.createNewFile())
		{
			System.out.println("File Created");
		}
		else
		{
			System.out.println("File Already Exists");
		}
		FileWriter writer = new FileWriter("test.java");
		writer.write("Hello There");
		writer.close();
		System.out.println("Completed");
	}
}
