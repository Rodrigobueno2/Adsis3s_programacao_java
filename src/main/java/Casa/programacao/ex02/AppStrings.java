package Casa.programacao.ex02;

import java.util.Scanner;

public class AppStrings {
	
    public static void main(String[] args) {
    	
		//Scanner ler = new Scanner(System.in);
		
		String frase = "  olha que legal  ";
		String resultante = frase.trim().toUpperCase();
		
		System.out.println("String Original: "+frase);
		System.out.println("String resultante: "+resultante);
		System.out.println("Tamanho da string original: "+frase.length());
		System.out.println("Tamanho da string em resultante: "+resultante.length());
	}
}
