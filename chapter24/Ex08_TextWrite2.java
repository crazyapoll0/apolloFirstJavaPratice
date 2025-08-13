package chapter24;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex08_TextWrite2 {

	public static void main(String[] args) {
		 {
		    	//한글 내용
		        try (InputStream in = new FileInputStream("text.txt"))
		        {
		            while(true) {
		            	int dat = in.read();
		            	if(dat == -1) break;
		            	System.out.print((char)dat);
		            }
		        }
		        catch(IOException e)
		        {
		            e.printStackTrace();
		        }
		    }
	}
}
