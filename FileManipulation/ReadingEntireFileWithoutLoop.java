import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadingEntireFileWithoutLoop
{
	public static void main(String[]args)
		throws FileNotFoundException
	{
		File file = new File ("C:\\Users\\pankaj\\Dekstop\\test.txt");
		Scanner sc = new Scanner(file);

		sc.useDelimiter("\\z");
		
		System.out.println(sc.nextLine());
	}
}
	
