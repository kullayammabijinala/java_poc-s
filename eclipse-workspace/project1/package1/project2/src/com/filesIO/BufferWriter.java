package com.filesIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("C:\\java\\exceptionfiles\\file2.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		fw.write("Ankitha is god girl");
		bw.newLine();
		fw.write("java is simple language");
		bw.newLine();
		fw.write("java is robust");
		bw.newLine();
		fw.close();
		fw.close();
		fw.close();
		
		
		
	}

}
