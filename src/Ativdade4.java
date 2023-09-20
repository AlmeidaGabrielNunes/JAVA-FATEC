import java.util.Scanner; 

import java.util.Random; 

public class Ativdade4{ 

    public static void main(String[] args) { 

        Scanner ler = new Scanner(System.in); 

        String senha = "python123"; 

        boolean check = false; 

        String pass; 

        while (check == false){ 

            System.out.println("Digite a senha: "); 

            pass = ler.nextLine(); 

            if(pass.equals(senha)){ 

                check = true; 

            } 

            else{ 

                System.out.println("Senha incorreta. Digite novamente. "); 

            } 

             

        } 

        System.out.println("Sucesso"); 

     

         

        

       } 

            } 