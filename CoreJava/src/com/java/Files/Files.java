package com.java.Files;

import java.io.File;
import java.io.IOException;

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
		 * length(): Returns the size of the file in bytes.
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
	}

}
