package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {
//Array []
public static void main(String[] args) {

    int[]idades = new int[5]; //inicializa o array com os valores padroes

//    idades[0]
//
//    int idade1 = 29;
//    int idade2 = 39;
//    int idade3 = 19;
//    int idade4 = 69;
//    int idade5 = 59;
//
//    int idade1 = idades[0];
//
//    System.out.println(idade1);

    for(int i = 0; i < idades.length; i++) {
        idades[i] = i * i;
    }

    for(int i = 0; i < idades.length; i++) {
        System.out.println(idades[i]);
    }
    
}
}