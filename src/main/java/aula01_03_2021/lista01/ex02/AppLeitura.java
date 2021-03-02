package aula01_03_2021.lista01.ex02;

import java.util.Scanner;


public class AppLeitura {
   public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 System.out.println("Digite seu nome: ");
	 String nome = ler.nextLine();
	 System.out.println("Digite sua idade: ");
	 String idade = ler.nextLine();
	 
	 System.out.println("Nome: "+nome+". idade: "+idade);
  }
}
