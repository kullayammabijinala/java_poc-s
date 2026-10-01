package com.filesIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterdemo {
			public static void main(String[] args) throws IOException {
				FileWriter fw=new FileWriter("C:\\java\\exceptionfiles\\file2.txt",true);
				PrintWriter pw=new PrintWriter(fw);//FileNotFoundException
				 pw.println("java is multithreaded");
				 pw.println("java is robust");
				pw.close();
	}

}
