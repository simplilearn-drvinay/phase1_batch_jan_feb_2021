package byte_stream_demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInByteDemo {

	public static void main(String[] args) {
		
		try(FileInputStream fis=new FileInputStream("bytedemo.txt");
				BufferedInputStream bis=new BufferedInputStream(fis);){ //Try with resources introduced from Java7. Advantage of this is you do not have to write finally block to release your resources.
			//the java's run time environment itself will take care of releasing the resources
//			System.out.println("Bytes before read "+bis.available());
//			System.out.println("read : "+(char)bis.read());
//			System.out.println("Bytes after read "+bis.available());
			StringBuilder sb=new StringBuilder();
			while(bis.available()!=0) {
				sb.append((char)bis.read());
			}
			System.out.println("Data read from file is ");
			System.out.println(sb.toString());
																						
			
		} catch (FileNotFoundException e) {
		System.out.println("");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
