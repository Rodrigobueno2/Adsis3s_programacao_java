package Casa.programacao.ex01;

public class Caixa {
        Object conteudoCaixa;
        String cor;
        public boolean estaVazio() {
        	if(conteudoCaixa == null) {
        		return true;
        	}
        	return false;
        }
        
        public boolean estaCheio() {
        	return !estaVazio();
        }
}
