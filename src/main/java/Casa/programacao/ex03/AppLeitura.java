package Casa.programacao.ex03;

import java.util.Scanner;

public class AppLeitura {
	
    public static void main(String[] args) {
    	
		Scanner ler = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Digite seu nome: ");
		
		nome = ler.nextLine();
		
		System.out.println("Ol�, "+nome+", tudo bem? ");
	}
}
