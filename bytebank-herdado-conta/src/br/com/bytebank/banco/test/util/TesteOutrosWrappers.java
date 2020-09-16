package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef2 = 29;
		System.out.println(idadeRef2.intValue());
		//ou
		Integer idadeRef = Integer.valueOf(29); //internamente o java fará essa linha
		System.out.println(idadeRef.intValue());

		
		Double dRef = 3.2;
		System.out.println(dRef.doubleValue());
		//ou
		Double dRef2 = Double.valueOf(3.2);//internamente o java fará essa linha
		System.out.println(dRef2.doubleValue());
		
		
		Boolean bRef = false;
        System.out.println(bRef.booleanValue());
        //ou
		Boolean bRef2 = Boolean.FALSE;
        System.out.println(bRef.booleanValue());
        //ou
    	Boolean dRef3 = Boolean.valueOf(false);//internamente o java fará essa linha
		System.out.println(dRef3.booleanValue());
        
		
	    Number refNumero = Integer.valueOf(29); //usando a classe mais genérica 

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(32.6);
        lista.add(25.6f);
        
//        int idade = 29;
//        Integer idadeRef = Integer.valueOf(29); //autoboxing
//        System.out.println(idadeRef.intValue());
//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//
//        System.out.println(Integer.SIZE);
//        System.out.println(Integer.BYTES);
//
//        int valor = idadeRef.intValue(); //unboxing
//        String s = args[0];//"10"
//        //Integer numero = Integer.valueOf(s);
//        int numero = Integer.parseInt(s);
//        System.out.println(numero);
//
//        List<Integer> numeros = new ArrayList<Integer>();
//        numeros.add(29); //Autoboxing

	}
}
