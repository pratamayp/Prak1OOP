package id.ac.uns.vokasi.d3ti.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class TulisFile {

	public static void main(String[] args) {
		String letak = "F:/KULIAH/Java/OOP/test.txt";
		Path path = Paths.get(letak);
		
		try {
			BufferedWriter bw = Files.newBufferedWriter(path, Charset.forName("ISO-8859-1"),
																			StandardOpenOption.CREATE,
																			StandardOpenOption.APPEND);
			String kontenTulisan = "Sesuatu";
			bw.write(kontenTulisan,0,kontenTulisan.length());
			bw.close();
			System.out.println("File berhasil ditulis");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File gagal ditulis");
			e.printStackTrace();
			System.exit(0);
		}
	}
	
}
