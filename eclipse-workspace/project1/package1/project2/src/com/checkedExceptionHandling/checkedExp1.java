package com.checkedExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class checkedExp1 {

	public static void main(String[] args) throws IOException, InterruptedException{
		 System.out.println("main method started");
		
		
	try {
			File f=new File("C:\\java\\exceptionfiles\\file2.txt");
			
	 boolean status=f.createNewFile();
	 if(status) {
			 System.out.println(" file succefully created");
			 }
			 else {
				 System.out.println(" try again");
				 }
	} catch (IOException e) {
			System.out.println("exception handling");
		}
		 
	try {
		FileReader fr=new FileReader("C:\\java\\exceptionfiles\\file1.txt");
		int i= fr.read();
		while(i>=-1) {
			System.out.print((char)i);
//			Thread.sleep(5000);
			i=fr.read();
		}
		
			 }catch(FileNotFoundException fe) {
				 System.out.println("handling exception");
}
	
	
	FileWriter fw=new FileWriter(" C:\\java\\exceptionfiles\\file1.txt");
	
	fw.write("ankitha");
	System.out.println("ahndling all");
		
	fw.close();
		 System.out.println("main method ended");

	}

}
