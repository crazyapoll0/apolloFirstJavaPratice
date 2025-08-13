package chapter24;

import java.io.*;

public class Ex04_FileRead {

	public static void main(String[] args) {
		try (InputStream in = new FileInputStream("data.txt"))
		{
			int dat = in.read();
			System.out.println(dat);
			System.out.printf("%c \n", dat);
			}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
