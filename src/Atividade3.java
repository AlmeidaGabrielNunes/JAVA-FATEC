import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		 String[] nomes = new String[5]; 
		 String outronome; 
		 for(int c=0; c<=4; c++){ 
		 System.out.println("Digite um nome "); 
		 nomes[c] = ler.nextLine(); 
		 } 
		 System.out.println ("Digite outro nome para verificar "); 
		 outronome = ler.nextLine(); 
		 
		 for(int c = 0; c<=4; c++){ 
		 if(outronome.equals(nomes[c])){ 
		 System.out.println("Nome igual encontrado ");

	}

}
}
}