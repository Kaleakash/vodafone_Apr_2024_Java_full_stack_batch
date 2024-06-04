package com;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteWiseExamples {

	public static void main(String[] args) throws Exception{
	// source : keyboards 
	// target : file 
//	DataInputStream dis = new DataInputStream(System.in);		// byte wise 
//	//FileOutputStream fos = new FileOutputStream("abc.txt"); // override 
//	FileOutputStream fos = new FileOutputStream("abc.txt",true);  // append the data
//	int ch;
//	System.out.println("Plz enter the data to exit enter @");
//	while((ch=dis.read())!= '@') {
//		System.out.print(ch+"="+(char)ch);
//		fos.write(ch);
//	}
//	fos.close();
//	System.out.println("data stored in file");
		
	//source : file 
	// target : console or file 
	FileInputStream fis = new FileInputStream("C:\\Users\\akash\\Desktop\\docker-compose.yml");
	FileOutputStream fos = new FileOutputStream("demo.txt");
	int ch;
	while((ch=fis.read()) != -1) {		// -1 is equal to EOF
		fos.write(ch);
		System.out.print((char)ch);
	}
	System.out.println("file copied");
	fis.close();
	fos.close();
	}

}
