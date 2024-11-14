import java.io*;

public class GFGMain {

	public static void main(String[]args) throws Exception
	{
	
		FileReader fr = new FileReader (
			("C:\\Users\\pankaj\\Dekstop\\test.txt");
			
		int i;
		while ((i = fr.read()) != -1)
      
			System.out.print((char)i);
	}
}
