import java.util.Scanner;
public class Atividade5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ler = new Scanner(System.in); 
        double n1, n2, n3, mediaaluno, median;
        int qt;
        
        System.out.println("Digita quantas Disciplinas o aluno possui: ");
        qt = ler.nextInt();
        String[] disciplina = new String[qt];
        double[] mediavetor = new double[qt];
        String[] aprovado = new String[qt];
        System.out.println("Digita qual a média para passar: ");
        median = ler.nextInt();
        
        for( int c = 0; c<qt; c++) {
        	ler.nextLine();  //limpar o "buffer do teclado
        	System.out.println("Digite o nome da Disciplina: ");
        	disciplina[c] = ler.nextLine();
        	System.out.println("Digte a nota da p1: ");
        	n1 = ler.nextInt();
        	System.out.println("Digte a nota da p2: ");
        	n2 = ler.nextInt();
        	System.out.println("Digte a nota da p3: ");
        	n3 = ler.nextInt();
        	mediaaluno = (n1+n2+n3)/3;
        	mediavetor[c] = mediaaluno;
        	if(mediaaluno >= median) {
        		aprovado[c] = "Aprovado";
        	}else {
        		aprovado[c] = "Reprovado";
        	}
        		
        }
        for(int i = 0; i<qt; i++) {
        	System.out.print(disciplina[i]+ " ");
        	System.out.print(mediavetor[i]+ " ");
        	System.out.print(aprovado[i]+ " ");
        }
        
	}

}
