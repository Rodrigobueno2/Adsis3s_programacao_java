package Casa.programacao.ex04;

public class AppArrays {
    public static void main(String[] args) {
    	
	   for(int i=0; i<args.length;i++) {
		   System.out.println(i+1+" = "+args[i]+" tamanho atual "+args[i].length());
	   }
	   System.out.println("Tamanho: "+args.length);
	   
	}
}
