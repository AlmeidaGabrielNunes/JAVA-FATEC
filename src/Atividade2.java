import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner ler = new Scanner(System.in); 
		 int soma; 
		 int i; 
		 int c; 
		 soma = 0; 
		 i = 0; 
		 c = 0; 
		 System.out.println("Digite um numero: "); 
		 int n = ler.nextInt(); 
		 
		 while(c<n){ 
			 if (i%2 !=0){ 
				 soma = soma + i; 
				 c++; 
			 } 
		 i++; 
		} 
		 System.out.println("O valor e: " + soma); 
		} 
		} 
	


