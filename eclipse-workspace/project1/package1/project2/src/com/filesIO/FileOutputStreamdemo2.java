package com.filesIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable{
	transient int  bookId;
	 String title; 
	 String author;
	double price;
	
}
public class FileOutputStreamdemo2 {

	public static void main(String[] args) throws IOException {
		System.out.println("main mehod started");
		Book b=new Book();
		
		File f=new File("C:\\java\\exceptionfiles\\fileIOS.txt");
		FileOutputStream fos=new FileOutputStream (f);//.FileNotFoundException
		ObjectOutputStream oos=new ObjectOutputStream (fos);//IOException
		oos.writeObject(b);
		
		System.out.println("main method ended");
		

	}

}
