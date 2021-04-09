package id.ac.uns.vokasi.d3ti.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BacaKeyboard {
	
	public static void main(String[] args) {
		String line = "";
		System.out.println("Masukkan data atau kalimat yang anda inginkan : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		
		try {
			line = in.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Isi : "+line);
	}
		
}
