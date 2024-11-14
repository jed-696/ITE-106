import java.io.*;

public class GFG {

	public static void main(String[]args) throws Exception
	{
		File file = new File ("C:\\Users\\pankaj\\Dekstop\\test.txt");
BufferReader br
			= new BufferReader (new FileReader(file));

		String st;
		while ((st = br.readLine()) != null)
      
			System.out.println(st);
			
	}
}
