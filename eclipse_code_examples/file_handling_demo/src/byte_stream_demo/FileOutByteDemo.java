package byte_stream_demo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutByteDemo {

	public static void main(String[] args) {
		
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		try {
		//	fos=new FileOutputStream("bytedemo.txt"); //creates new file everytime and overwrites it
			fos=new FileOutputStream("bytedemo.txt",true); //sets the append to true to write the message at the end of the file
			bos=new BufferedOutputStream(fos);
			String message="\nI am one more message again. Please see me.";
			byte b[]=message.getBytes();
			bos.write(b);
			System.out.println("File created successfuly and message was also written.......");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				bos.flush();
				bos.close();
				fos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}

	}

}
