package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Alura";
		//String nome2= new String("Alura");
		
		String outra = nome.replace("A", "a");
		
		char c = nome.charAt(2);
		System.out.println(c);
		
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
		    System.out.println(nome.charAt(i));
		}
		
		String vazio = "";
		System.out.println(vazio.isEmpty());
		
		vazio =" ";
		String outroVazio = vazio.trim(); 

		System.out.println(outroVazio.isEmpty());
		
		vazio ="    Alura    ";
		outroVazio = vazio.trim(); 

		System.out.println(outroVazio);
		
		String outra2 = nome.toLowerCase();
		System.out.println(outra2);
		String outra3 = nome.toUpperCase();
		System.out.println(outra3);
				
		System.out.println(nome);
		System.out.println(outra);
		
		vazio ="    Alura    ";
		outroVazio = vazio.trim(); 

		System.out.println(vazio.contains("Alu"));
	}

}
