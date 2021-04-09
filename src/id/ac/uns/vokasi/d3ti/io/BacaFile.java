package id.ac.uns.vokasi.d3ti.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BacaFile {
	
	public static void main(String[] args) {
		String line = "", fileContent = "";
		String letak = "F:/KULIAH/Java/OOP/test.txt";
		try {
			BufferedReader fileInput = new BufferedReader(new FileReader(letak));
			line = fileInput.readLine();
			fileContent = line+"\n";
			while(line != null) {
				line = fileInput.readLine();
				if(line != null) fileContent += line+"\n";
			}
			fileInput.close();
			System.out.println(fileContent);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File tidak ditemukan");
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Terjadi kesalahan saat membaca file");
			System.exit(0);
		}
		
		Path path = Paths.get(letak);
		System.out.print("nama file : ");
		System.out.println(path.getFileName());
		
		System.out.print("letak file : ");
		System.out.println(path.getParent());
		
		System.out.print("jumlah subfolder : ");
		System.out.println(path.getNameCount());
		
		System.out.print("tipe file absolute : ");
		System.out.println(path.isAbsolute());
		
		System.out.print("subpath : ");
		System.out.println(path.subpath(1,2));
		
		System.out.print("read able :  : ");
		System.out.println(Files.isReadable(path));
		
		System.out.print("write able : ");
		System.out.println(Files.isWritable(path));
		
		System.out.print("execute able : ");
		System.out.println(Files.isExecutable(path));
		
	}
	
}
