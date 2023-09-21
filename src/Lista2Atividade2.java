import java.util.Random;
import java.util.Scanner;

public class Lista2Atividade2 {
public static void main(String[] args) {
Random rand = new Random(); 
int numeroAleatorio = rand.nextInt(100) + 1; 
int tentativas = 0; 

    Scanner scanner = new Scanner(System.in); 

    System.out.println("Bem-vindo ao jogo de adivinhacao!");
    System.out.println("Tente adivinhar o número entre 1 e 100.");

    while (true) { 
        System.out.print("Digite seu palpite: ");
        int palpite = scanner.nextInt();
        tentativas++;

        if (palpite < numeroAleatorio) {
            System.out.println("Tente um numero mais alto."); 
        } else if (palpite > numeroAleatorio) {
            System.out.println("Tente um numero mais baixo.");
        } else {
            System.out.println("Parabéns! Você acertou o numero em " + tentativas + " tentativas.");
            break;
        }
    }

}
}