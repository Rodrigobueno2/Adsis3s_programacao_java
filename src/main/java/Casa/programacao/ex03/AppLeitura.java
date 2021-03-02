package Casa.programacao.ex03;

import java.util.Scanner;

public class AppLeitura {
	
    public static void main(String[] args) {
    	
		Scanner ler = new Scanner(System.in);
		
		String nome;
		
		int idade;
		
		System.out.println("Digite seu nome: ");
		
		nome = ler.nextLine();
		
		System.out.println("Digite sua idade: ");
		
		idade = ler.nextInt();
		
		//System.out.println("Olá, "+nome+", tudo bem? ");
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
	}
}
