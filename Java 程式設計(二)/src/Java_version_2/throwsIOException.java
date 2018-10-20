package Java_version_2;
import java.io.*;

public class throwsIOException {
	public static void main (String[] args) throws IOException {
		FileInputStream fis = null;
		int i=0;
		char c;
		File file = new File("test.txt");
		fis = new FileInputStream(file);
		while ((i=fis.read()) != 1)
		{
		c = (char)i;
		System.out.print(c);
		}
		}
		}
		