package char_stream_demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadCharDemo {

	public static void main(String[] args) {
	
		try(FileReader fr=new FileReader("chardemo.txt");
				BufferedReader br=new BufferedReader(fr);
				){
			System.out.println("Message from file is");
			String s=null;
			while((s=br.readLine())!=null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
