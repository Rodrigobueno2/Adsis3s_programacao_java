package Casa.programacao.ex01;

public class App {
     public static void main(String[] args) {
		Caixa caixaRosa = new Caixa();
		Caixa caixaVerde = new Caixa();
		caixaRosa.conteudoCaixa = new Elefante();
		caixaRosa.cor = "Rosa";
		caixaVerde.cor = "Verde";
		
		caixaVerde.conteudoCaixa = caixaRosa;
		
	   if(caixaRosa.estaCheio()) {
		   System.out.println("A caixa rosa está cheia!");
	   }else {
		   System.out.println("A caixa rosa está vazia");
	   }
	   System.out.println(caixaVerde.conteudoCaixa);
	   System.out.println(caixaRosa.conteudoCaixa);
	   System.out.println(caixaVerde.cor);
	   System.out.println(caixaRosa.cor);
	}
}
