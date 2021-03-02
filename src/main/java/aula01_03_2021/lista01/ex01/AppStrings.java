package aula01_03_2021.lista01.ex01;

public class AppStrings {
   public static void main(String[] args) {
	  String original = "     olha que legal    ";
	  String resultante = original.trim().toUpperCase();
	  
	  System.out.println("Frase resultante: "+resultante);
	  System.out.println("Tamanho da frase resultante: "+resultante.length());
	  System.out.println("Tamanho da frase original: "+original.length());
	  
   }
}
