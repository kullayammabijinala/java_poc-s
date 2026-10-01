package com.filesIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	 String username="Ankitha";
	transient String password="ankitha123";
	 
 }

public class Fileoutputstreamdemo1 {

		public static void main(String[] args)  throws IOException{
			System.out.println("main method started");
			Employee e=new Employee();
			
			File f=new File("C:\\java\\exceptionfiles\\fileOS.txt");
			FileOutputStream fos=new FileOutputStream (f);//.FileNotFoundException
			ObjectOutputStream oos=new ObjectOutputStream (fos);//IOException
			oos.writeObject(e);
			
			System.out.println("main method ended");
			

		}

	}



