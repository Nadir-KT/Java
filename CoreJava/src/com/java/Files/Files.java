package com.java.Files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

public class Files {
	//The File class is an abstract representation of file and directory pathname. A pathname can be either absolute or relative.
	public static void main(String[] args) {
		/* Method Index
		 * http://edelstein.pebbles.cs.cmu.edu/jadeite/main.php?api=java6&state=class&package=java.io&class=File
		 * https://www.codecademy.com/resources/docs/java/files
		 * https://www.developer.com/java/java-file-class/
		 * https://www.scientecheasy.com/2021/06/file-in-java.html/
		 * delete(): Deletes a file. Can delete a directory if it is empty.
		 * getAbsolutePath(): Returns the full pathname of the file/directory.
		 * isDirectory(): Returns true if instance points to a directory.
		 * isFile(): Returns true if instance points to a file.
		 * mkdir(): Creates a directory.
		 */
		File f1 = new File("filename.txt"); // Specify the filename
		System.out.println(f1);
		try {
			//public File getCanonicalFile(): Returns the canonical form of this abstract pathname.
			File f2=f1.getCanonicalFile();
			System.out.println(f2);
			//public boolean createNewFile(): Creates an empty file. Returns true if successful.
			if(f1.createNewFile()) {
				System.out.println("File created");
			}
			else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//public boolean exists(): Returns true if the file/directory exists.
		if(f1.exists()) {
			System.out.println("File exists");
		}
		//public String[] list(): Returns a String[] array of the files in the directory.
		File f3=new File("C:");
		String arr[]=f3.list();
		for(String d:arr) {
			System.out.println(d);
		}
		//public File listFiles(): Returns an array of abstract pathnames denoting the files in the directory denoted by this abstract pathname.
		File arr1[]=f3.listFiles();
		for(File d:arr1) {
			//public name getName(): Returns the name of the file/directory.
			//public long length(): Returns the size of the file in bytes.
			//public boolean canRead(): Returns true if the file is readable.
			//public boolean canWrite(): Returns true if the file is writable.
			//public boolean isHidden(): Tests whether the file named by this abstract pathname is a hidden file.
			System.out.println(d.getName()+" "+d.length()+"Bytes: Read="+d.canRead()+",Write="+d.canWrite()+",Hidden="+d.isHidden());
		}
		
		//Java I/O Stream: output/error/input
		System.out.println("simple message");  
		System.err.println("error message: please enter an input to continue");  
		int i;
		try {
			i = System.in.read();//returns ASCII code of 1st character  
			System.out.println((char)i);//will print the character  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//FileOutputStream
		try {
			FileOutputStream f4=new FileOutputStream("H:/Software_Development/GitHub/Java/CoreJava/filename.txt");
			//public void write(int b)
			f4.write(122);//ASCII (65=A)->(90=Z),(97=a)->(122=z)
			//public void write(byte b[]): Writes text to a file.
			String s1="\nThe Engineer";
			byte sArr[]=s1.getBytes();//Encodes this String into a sequence of bytes using theplatform's default charset, storing the result into a new byte array.
			f4.write(sArr);
			//public void write(byte b[], int off, int len)
			//public void finalize()
			//public void close(): Closes the FileReader. Should be done after all reads are complete.
			f4.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finished");
		
		//FileInputStream
		try {
			FileInputStream f4=new FileInputStream("H:/Software_Development/GitHub/Java/CoreJava/filename.txt");
			//public int read(): Reads a character from the file, or reads characters into a buffer.
			System.out.println((char)f4.read());
			int i1=0;
			while((i1=f4.read())!=-1) // -1 = End of line
			{
				System.out.print((char)i1);
			}
			f4.close();
			//public int read(byte b[])
			//public int read(byte b[], int off, int len)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Buffer = Temporary Memory // Improve Performance by writing to RAM for later transfer to drive
		//BufferedOutputStream
		try {
			FileOutputStream f4=new FileOutputStream("H:/Software_Development/GitHub/Java/CoreJava/bufferData.txt");
			BufferedOutputStream b1= new BufferedOutputStream(f4);
			String s1="\nBuffer Data";
			byte bArr[]=s1.getBytes();
			b1.write(bArr);
			b1.flush();//This forces any buffered output bytes to be written out to the underlying output stream.
			b1.close();//Closes this output stream and releases any system resources associated with the stream. 
			f4.close();
			System.out.println("\nbuffer write sucess");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//BufferedInputStream
		try {
			FileInputStream f4=new FileInputStream("H:/Software_Development/GitHub/Java/CoreJava/bufferData.txt");
			BufferedInputStream b1= new BufferedInputStream(f4);
			int i1=0;
			while((i1=b1.read())!=-1) // -1 = End of line
			{
				System.out.print((char)i1);
			}
			b1.close();//Closes this output stream and releases any system resources associated with the stream. 
			f4.close();
			System.out.println("\nbuffer read sucess");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//SequenceInputStream //Read content from multiple files
		try {
			FileInputStream f4=new FileInputStream("H:/Software_Development/GitHub/Java/CoreJava/filename.txt");
			FileInputStream f5=new FileInputStream("H:/Software_Development/GitHub/Java/CoreJava/bufferData.txt");
			FileOutputStream f6=new FileOutputStream("H:/Software_Development/GitHub/Java/CoreJava/combine.txt");
			SequenceInputStream s1= new SequenceInputStream(f4,f5);
			int i1=0;
			while((i1=s1.read())!=-1) // -1 = End of line
			{
				System.out.print((char)i1);
				f6.write(i1);
			}
			s1.close();//Closes this output stream and releases any system resources associated with the stream. 
			f4.close();
			f5.close();
			f6.close();
			System.out.println("\nSequence read & write sucess");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ByteArrayOutputStream //Write same content to multiple files
		try {
			FileOutputStream f6=new FileOutputStream("H:/Software_Development/GitHub/Java/CoreJava/ByteArray1.txt");
			FileOutputStream f7=new FileOutputStream("H:/Software_Development/GitHub/Java/CoreJava/ByteArray2.txt");
			ByteArrayOutputStream b1= new ByteArrayOutputStream();
			b1.write(65);
			b1.writeTo(f6);
			b1.writeTo(f7);
			f6.close();
			f7.close();
			b1.close();
			System.out.println("\nByteArray write sucess");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ByteArrayInputStream
		try {
			byte bArr[]= {65,66,67,68,69};
			ByteArrayInputStream b1= new ByteArrayInputStream(bArr);
			int i1=0;
			while((i1=b1.read())!=-1) // -1 = End of line
			{
				System.out.print((char)i1);
			}
			b1.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
