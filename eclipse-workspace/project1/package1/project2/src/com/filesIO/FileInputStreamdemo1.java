package com.filesIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileInputStreamdemo1 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		System.out.println("main method started");
		
		File f=new File("C:\\java\\exceptionfiles\\fileOS.txt");
		FileInputStream fis=new FileInputStream (f);//FileNotFoundException
		ObjectInputStream ois=new ObjectInputStream (fis);//IOException 
		Employee e =(Employee) ois.readObject();  //ClassNotFoundException
		System.out.println(e.username);
		System.out.println(e.password);
		
		System.out.println("main method ended");
		
	}

}
//java.io.InvalidClassException- we get this exception if you give transient keyword to the first fileoutputStream class then execute second class without execute the first class then we got this exception .
