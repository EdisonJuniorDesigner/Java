
package bancodobrasil2;

/*import java.util.Scanner;*/


public class Banco {


    public static void main(String[] args) {
        
        /*System.out.println("Nome: Edison");
            System.out.println("Idade: 20");
                System.out.println("Curso: Técnico em Informática");*/
        
        /*Scanner input = new Scanner (System.in);
        String nome = "";
            System.out.println("Digite seu nome:");
                nome = input.next();
                    System.out.println("Meu nome é " + nome);*/
         
        System.out.println(Character.isDigit('c'));
        System.out.println(Character.isDigit('5'));
        
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('5'));
        
        System.out.println(Character.isLetterOrDigit('c'));
        System.out.println(Character.isLetterOrDigit('5'));
        
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.isUpperCase('C'));
        
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isLowerCase('C'));
        
        System.out.println(Character.isWhitespace(' '));
        
        String a = "testejava.html";
        a = a.replaceAll("html","jsp");
        System.out.print(a);
        
    }
    
}
