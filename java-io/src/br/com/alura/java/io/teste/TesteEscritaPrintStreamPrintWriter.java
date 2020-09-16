package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;

public class TesteEscritaPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
	

//		OutputStream fos = new FileOutputStream("arquivo2.txt");
//		Writer osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		PrintStream ps = new PrintStream("arquivo2.txt"); //ou  PrintWriter ps = new PrintWriter("aequivo2.txt");
		ps.println("Atualmente, nenhuma aplicação funciona isoladamente e não receba ou envie dados");
		ps.println();
		ps.println();
		ps.println();
		ps.println("sdgzdfbxfgbx");
		
		ps.close();
		
	}

}