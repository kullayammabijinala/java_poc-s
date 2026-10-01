package com.filesIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Filetask1 {

	public static void main(String[] args) throws IOException {
	FileReader fr1=new FileReader("C:\\java\\exceptionfiles\\file3.txt");
	BufferedReader br1=new  BufferedReader (fr1);
	
	
	 FileWriter fw=new FileWriter("C:\\java\\exceptionfiles\\file5.txt",true);
		PrintWriter pw=new PrintWriter(fw);
		
		
	 String s1=br1.readLine();
	 while(s1!=null) {
		 System.out.println(s1);
		 pw.println( s1);
		 s1=br1.readLine(); 
	 }
	 
	 br1.close();
    
	 
	 FileReader fr2=new FileReader("C:\\java\\exceptionfiles\\file4.txt");
		BufferedReader br2 =new  BufferedReader (fr2);
		 String s2=br2.readLine();
		 while(s2!=null) {
			 System.out.println(s2);
			 pw.println(s2);
			 s2=br2.readLine(); 
		 }
		 
		br2.close();
		
			pw.close();

	}

}
