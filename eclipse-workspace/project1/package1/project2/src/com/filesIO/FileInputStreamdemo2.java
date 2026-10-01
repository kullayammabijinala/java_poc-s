package com.filesIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileInputStreamdemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	System.out.println("main method started");
		
		File f=new File("C:\\java\\exceptionfiles\\fileIOS.txt");
		FileInputStream fis=new FileInputStream (f);//FileNotFoundException
		ObjectInputStream ois=new ObjectInputStream (fis);//IOException 
		Book b =(Book) ois.readObject();  //ClassNotFoundException
		System.out.println(b.bookId);
		System.out.println(b.title);
		System.out.println(b.author);
		System.out.println(b.price);
		System.out.println("****************************");
		
		System.out.println(b.bookId=98);
		System.out.println(b.title="awesome");
		System.out.println(b.author="NJK");
		System.out.println(b.price=4000);
		
		System.out.println("main method ended");

	}

}
