package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
	

//		OutputStream fos = new FileOutputStream("arquivo2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		FileWriter fw = new FileWriter("arquivo2.txt");
		fw.write("Atualmente, nenhuma aplica��o funciona isoladamente e n�o receba ou envie dados");
		fw.write(System.lineSeparator());
		fw.write(System.lineSeparator());
		fw.write("sdgzdfbxfgbx");
		
		
		fw.close();
		
		
//        long ini = System.currentTimeMillis();
//
//        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
//
//        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
//        bw.newLine();
//        bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
//
//        bw.close();
//
//        long fim = System.currentTimeMillis();
//
//        System.out.println("Passaram " + (fim - ini) + " milissegundos");
		
		
		
	}

}