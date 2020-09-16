package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
	
		//fluxo de saída em um arquivo
		OutputStream fos = new FileOutputStream("arquivo2.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		 
		bw.write("Atualmente, nenhuma aplicação funciona isoladamente e não receba ou envie dados");
		bw.newLine();
		bw.newLine();
		bw.newLine();
		bw.write("sdgzdfbxfgbx");
		
		
		bw.close();
		
	}

}