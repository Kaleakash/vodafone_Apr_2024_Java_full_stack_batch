package com;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class ByteWiseExamples {

	public static void main(String[] args) throws Exception{
	// source : keyboards 
	// target : file 
	DataInputStream dis = new DataInputStream(System.in);	
	//FileOutputStream fos = new FileOutputStream("abc.txt"); // override 
	FileOutputStream fos = new FileOutputStream("abc.txt",true);  // append the data
	int ch;
	System.out.println("Plz enter the data to exit enter @");
	while((ch=dis.read())!= '@') {
		System.out.print(ch+"="+(char)ch);
		fos.write(ch);
	}
	fos.close();
	System.out.println("data stored in file");
	}

}
