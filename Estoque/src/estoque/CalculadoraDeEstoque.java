
package estoque;

import java.util.Scanner;

public class CalculadoraDeEstoque {


    public static void main(String[] args) {
        
        
        Scanner input = new Scanner (System.in);
        System.out.println("Livro: Coração de Leão");
        double livro1 = 59.90;
        System.out.println("Preço do livro: "+livro1);
         int qtd = 0;
            System.out.println("Digite a quantidade:");
                qtd = input.nextInt();
                    System.out.println("Você selecionou "+qtd+" quantidades");
        
        double venda = livro1+qtd;
        
        System.out.println("O total da venda é "+ venda);     
    }
    
}
