import java.io.File;
import java.util.Scanner;
public class ReadFromFileUsingScanner 
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("C:\\Users\\pankaj\\Desktop\\test.txt");
        Scanner sc = new Scanner(file);
 
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
