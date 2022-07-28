package org.troel.composite.folders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.troel.composite.folders.model.File;
import org.troel.composite.folders.model.FileSystemItem;
import org.troel.composite.folders.model.Folder;

public class Client {

	public static void main(String[] args) {
		
		FileSystemItem fileOne = new File("FileOne.txt");
		FileSystemItem fileTwo = new File("FileTwo.txt");
		FileSystemItem fileThree = new File("FileThree.txt");
		FileSystemItem fileFour = new File("FileFour.txt");
		
		FileSystemItem sfOne = new Folder("sfOne", Arrays.asList(fileOne));
		FileSystemItem sfTwo = new Folder("sfTwo", Arrays.asList(fileTwo, sfOne));
		FileSystemItem folder = new Folder("folder", Arrays.asList(sfTwo, fileThree, fileFour));
		
		folder.print("");
		
		System.out.println("----------------------");
		
		String dir = System.getProperty("user.dir");
		FileSystemItem fromDisk = createCompositeFromFile(new java.io.File(dir + java.io.File.separator + "src"));
		fromDisk.print(">");
	}
	
	public static FileSystemItem createCompositeFromFile(java.io.File file) {
		if(!file.isDirectory()) {
			return new File(file.getName());
		}
		List<FileSystemItem> children = new ArrayList<>();
		java.io.File[] files = file.listFiles();
		for(java.io.File javaFile : files) {
			children.add(createCompositeFromFile(javaFile));
		}
		return new Folder(file.getName(), children);
	}
}
