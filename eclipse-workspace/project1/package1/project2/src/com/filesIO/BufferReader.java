package com.filesIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferReader {

	
	public static void main(String[] args) throws IOException {
		
		FileReader fr=new FileReader("C:\\java\\exceptionfiles\\file2.txt");//FileNotFoundException
		BufferedReader br=new BufferedReader(fr);//IOException
		
		String s= br.readLine();
		while(s!=null) {
			System.out.println(s);
			s= br.readLine();
			
		}	

	}

}
