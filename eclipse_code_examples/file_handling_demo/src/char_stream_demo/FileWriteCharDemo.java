package char_stream_demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteCharDemo {

	public static void main(String[] args) {
		
		
		try(FileWriter fw=new FileWriter("chardemo.txt");
				BufferedWriter bw=new BufferedWriter(fw);
				){
			bw.write("hello from char stream again");
			bw.newLine();
			bw.write("hello again from char stream. no need of conversion here");
			System.out.println("Message written in file successfully");
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
