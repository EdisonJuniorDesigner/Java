
package estoque;

import java.util.Scanner;

public class CalculadoraDeEstoque {


    /*public static void main(String[] args) {
        
        
        Scanner input = new Scanner (System.in);
        System.out.println("Livro: Coração de Leão");
        double livro1 = 5;
        System.out.println("Preço do livro: "+livro1);
         int qtd = 0;
            System.out.println("Digite a quantidade:");
                qtd = input.nextInt();
                    System.out.println("Você selecionou "+qtd+" quantidades");
        
        double venda = livro1*qtd;
        
        System.out.println("O total da venda é "+ venda);     
    }*/
    
    /*public static void main(String[] args) {
        
        double livroJava8 = 59.90;
        double livroTDD = 59.90;
        
        double soma = livroJava8+livroTDD;
        
        System.out.println("O total em estoque é "+soma);
        
        if(soma<150){
            System.out.println("Seu estoque está muito baixo!");
        }else if (soma>=2000){
            System.out.println("Seu estoque está muito alto");
        }else{
            System.out.println("Seu estoque está bom");
        }
    }*/
    
    /*public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        double num=0;
        
        System.out.println("Digite um número:");
        num=input.nextDouble();
        if(num>0){
            System.out.println("O número "+num+" é positivo");
        }else{
            System.out.println("O número "+num+" é negativo");
        }
    }*/
    /*
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sexo=0;
         System.out.println("Digite o seu sexo com o número 1 para M(masculino) ou 2 para F(feminino).");
            sexo=input.nextInt();
            if(sexo==1){
                System.out.println("Seja bem-vindo, Senhor!");
            }else if(sexo==2){
                System.out.println("Seja bem-vindo, Senhora!");
            }
    }*/
  
    /*public static void main(String[] args) {  
        for(int i=0;i<=100;i++){
            if(i % 5 == 0)//  
                System.out.println(i);       
        }  
    }*/  
    /*public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double temp=0;
        System.out.println("Digite a temperatura em graus célsius:");
        temp=input.nextDouble();
        if(temp==18){
            System.out.println("O clima está frio!");
        }
        else if(temp>=19 && temp<=23){
            System.out.println("O clima está agradável");
        }else if(temp>=24&&temp<=35){
            System.out.println("O clima é quente");
        }else if(temp>35&&temp<=100){
            System.out.println("O clima é muito quente");
        }else if(temp>300){
            System.out.println("O clima está ultra mega quente, ou é seu espirito falando comigo ou você se tornou um ser do fogo!");
        }
    }*/
        /*public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double salario=0;
        System.out.println("Digite o seu salário mensal:");
        salario=input.nextDouble();
        if(salario<=645){
            System.out.println("Até 1 salário mínimo");
        }else if((salario>645)&&(salario<=1935)){
            System.out.println("Até 3 salários mínimos");
        }else if((salario>1935)&&(salario<=3225)){
            System.out.println("Até 5 salários mínimos");
        }else if(salario>3225){
            System.out.println("Acima de 5 salários mínimos");
        }
    }*/
    /*public static void main(String[] args) {
        double soma = 0;
        int contador = 0;
        
        while (contador<35){
            double valorDoLivro = 59.90;
            soma = soma+valorDoLivro;
            contador = contador + 1;
            System.out.println("O valor é de "+soma);
        }
        if(soma<150){
            System.out.println("Seu estoque está muito baixo!");
        }else if (soma>=2000){
            System.out.println("Seu estoque está muito alto");
        }else{
            System.out.println("Seu estoque está bom");
        }
    }*/
    /*public static void main(String[] args) {
        int numero=1;
        int resultado=0;
        while (numero < 15){ 
            resultado += numero++;
            System.out.println(resultado);
        }
    }*/
    /*public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, numero, soma; 
        i = 1; 
        soma = 0; 
       while (i<=10)
         {
         System.out.println("Digite um número: "); 
         numero = teclado.nextInt();
         soma += numero; 
          i++;
     } 
          System.out.println("A soma dos números digitados é: "+soma);
        }*/

    /*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double  i, numero;
        i = 1;
        double media = 0;
        for(i=0;i<=15;i++){
            System.out.println("Digite um número:");
            numero=input.nextDouble();
            media += numero/15;
        }
        System.out.println("A média dos números é "+media);
    }*/
    /*public static void main(String[] args) { 
    Scanner teclado = new Scanner(System.in); 
    int i, idade, idadeMaisNova; 
    String nome, nomeMaisNova; 
      System.out.println("Digite o nome:"); 
      nome = teclado.next() + teclado.nextLine(); 
    System.out.println("Digite a idade: "); 
    idade = teclado.nextInt(); 
    idadeMaisNova = idade; 
    nomeMaisNova = nome; 
    for (i=1; i<=9; i++){ 
    System.out.println("Digite o nome:"); 
    nome = teclado.next() + teclado.nextLine(); 
    System.out.println("Digite a idade: "); 
    idade = teclado.nextInt(); 
    if (idade < idadeMaisNova){ 
    nomeMaisNova = nome; 
    idadeMaisNova = idade; 
 }  
 } 
 System.out.println("Pessoa Mais Nova - Nome: "+ nomeMaisNova+
 " Idade: "+ idadeMaisNova);
 }*/
    /*public static void main(String[] args) { 
  Scanner teclado = new Scanner(System.in); 
  int i, qtdFuncionarios, tempoServico; 
  String nome; 
  System.out.print("Digite a quantidade de funcionários: "); 
   qtdFuncionarios = teclado.nextInt(); 
    for (i=1; i<= qtdFuncionarios; i++){ 
	 System.out.println("Digite o nome do funcionario: "); 
	  nome = teclado.next() + teclado.nextLine();
     System.out.println("Digite o tempo de serviço em meses: "); 
	  tempoServico = teclado.nextInt(); 
	   if (tempoServico >= 12){ 
	   System.out.println(nome+ " tem direito à férias"); 
	    }else{ 
		 System.out.println(nome+ " Não tem direito à férias"); 
		 }
}
} */
}
    
    
