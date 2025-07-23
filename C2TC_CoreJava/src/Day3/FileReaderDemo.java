package Day3;
import java.net.URL;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class FileReaderDemo {
	public static void main(String[]args) throws IOException {
		
		
		URL resource = FileReaderDemo.class.getResource("BufferReader.txt");
		
		if(resource == null) {
			System.err.println("File not Found");
		}
		//convert Url int file object
		File f = new File(resource.getFile());
		//object creation of the file reader 
		FileReader fr = new FileReader("f");
		
		//object creation of the buffer reader
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		System.out.println(line);
		
		While(( line = br.readLine())! = null)
		
	}
}
