package criptografia;

import java.util.Scanner;
public class TestaCriptografia {
    
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("(1) para criptografar a sua mensagem com a Cifra de César");
        System.out.println("(2) para criptografar a sua mensagem com código Morse");
        System.out.println("(3) para criptografar a sua mensagem com a mistura aleatória");
        System.out.println("(4) Sair");

        int metodo = entrada.nextInt();

        while(metodo != 4){
            
            if(metodo == 1){
                Criptografia cripto = new CifraDeCesar();
                cripto.criptografar();
            }
            else if(metodo == 2){
                Criptografia morse = new CodigoMorse();
                morse.criptografar();
            }
            
            //metodo == 3;
            else {
                System.out.println("## OPÇÃO INVÁLIDA ##");
            }
               
            System.out.println("\n(1) para criptografar a sua mensagem com a Cifra de César");
            System.out.println("(2) para criptografar a sua mensagem com código Morse");
            System.out.println("(3) para criptografar a sua mensagem com a mistura aleatória");
            System.out.println("(4) Sair");
            metodo = entrada.nextInt();
        }
            System.out.println("Obrigado por criptografar conosco! Até a próxima.");

        entrada.close();
    }
}
