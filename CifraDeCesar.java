package criptografia;
import java.util.Scanner;

public class CifraDeCesar extends Criptografia{
    
    Scanner entrada = new Scanner(System.in);
    
    public void criptografar(){
        System.out.println("Digite a mensagem a ser criptografada:\n");
        mensagem = entrada.nextLine();
        for(int i = 0; i < mensagem.length(); i++){
            switch(mensagem.charAt(i)){
                case 'a':
                    mensagemCriptografada = mensagem.replace('a', 'd');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'b':
                    mensagemCriptografada = mensagem.replace('b', 'e');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'c':
                    mensagemCriptografada = mensagem.replace('c', 'f');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'd':
                    mensagemCriptografada = mensagem.replace('d', 'g');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'e':
                    mensagemCriptografada = mensagem.replace('e', 'h');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'f':
                    mensagemCriptografada = mensagem.replace('f', 'i');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'g':
                    mensagemCriptografada = mensagem.replace('g', 'j');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'h':
                    mensagemCriptografada = mensagem.replace('h', 'k');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'i':
                    mensagemCriptografada = mensagem.replace('i', 'l');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'j':
                    mensagemCriptografada = mensagem.replace('j', 'm');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'k':
                    mensagemCriptografada = mensagem.replace('k', 'n');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'l':
                    mensagemCriptografada = mensagem.replace('l', 'o');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'm':
                    mensagemCriptografada = mensagem.replace('m', 'p');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'n':
                    mensagemCriptografada = mensagem.replace('n', 'q');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'o':
                    mensagemCriptografada = mensagem.replace('o', 'r');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'p':
                    mensagemCriptografada = mensagem.replace('p', 's');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'q':
                    mensagemCriptografada = mensagem.replace('q', 't');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'r':
                    mensagemCriptografada = mensagem.replace('r', 'u');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 's':
                    mensagemCriptografada = mensagem.replace('s', 'v');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 't':
                    mensagemCriptografada = mensagem.replace('t', 'w');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'u':
                    mensagemCriptografada = mensagem.replace('u', 'x');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'v':
                    mensagemCriptografada = mensagem.replace('v', 'y');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'w':
                    mensagemCriptografada = mensagem.replace('w', 'z');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'x':
                    mensagemCriptografada = mensagem.replace('x', 'a');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'y':
                    mensagemCriptografada = mensagem.replace('y', 'b');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                case 'z':
                    mensagemCriptografada = mensagem.replace('z', 'c');
                    System.out.print(mensagemCriptografada.charAt(i));
                    break;
                    
                default:
                    System.out.print(" ");
                    break;
            }
        }
        
    } 
    
    
    
}
