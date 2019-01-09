package aula2019;
import javax.swing.JOptionPane;

public class Aula2019 {
    /*public static void main(String[] args) {
        String nome = null;
        int resposta;
        nome = JOptionPane.showInputDialog("Qual é o seu nome?","Digite seu nome aqui.");
        resposta = JOptionPane.showConfirmDialog(null, "O seu nome é "+nome+"?");
        if (resposta == JOptionPane.YES_OPTION){
        // verifica se o usuário clicou no botão YES
            JOptionPane.showMessageDialog(null, "Seu nome é "+nome);
        }else{
            JOptionPane.showMessageDialog(null, "Seu nome não é "+nome);
        }
    }*/
    /*public static void main(String[] args) {
        Object[] opcoes = { "Sim", "Não" };
        Object resposta;
        do{
            resposta = JOptionPane.showInputDialog(null,
                                "Deseja finalizar o programa?",
                                "Finalização",
                                JOptionPane.PLAIN_MESSAGE,
                                null,
                                opcoes,
                                "Não");
        } while (resposta == null || resposta.equals("Não"));
    }*/
    /*public static void main(String[] args) {
        String nome = null;
        while (nome == null || nome.equals("")) {
            nome = JOptionPane.showInputDialog("Qual o seu nome?");
            if (nome == null || nome.equals("")){
                JOptionPane.showMessageDialog(null,
                                "Você não respondeu a pergunta.");
            }
        }
        JOptionPane.showMessageDialog(null, "Seu nome é "+nome);
    }*/
    /*public static void main(String[] args) {
        //define um numero qualquer entre 0 e 10
        int rndNr = (int)Math.ceil(Math.random()*10);
        // lista de opções para o combo box da caixa de diálogo
        Object[] opcoes = {"0","1","2","3","4","5","6","7","8","9","10"};
        // string onde será retornado o resultado
        String resposta;;
        while(true){
            //loop para evitar que o jogo feche depois da primeira resposta
            resposta = (String) JOptionPane.showInputDialog(null,
                    "Em que número estou pensando?", "Jogo de Advinhar",
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, null);
            if (resposta == null){
                /*
                 *se clicar no botão Cancel, mostrar uma mensagem de Game Over
                 * e sair do loop para finalizar o programa
                 */
                /*JOptionPane.showMessageDialog(null,
                        "Game Over!\nVocê desistiu do jogo!");
                break;
            }
            if (Integer.valueOf(resposta)>rndNr){
                /*
                 *Interpreta string como inteiro e compara com o número sorteado
                 *para ver se é maior
                */
               /* JOptionPane.showMessageDialog(null,
                        "Errado!\nO número que eu pensei é menor.");
            }else if (Integer.valueOf(resposta)<rndNr){
                /*
                 *Interpreta string como inteiro e compara com o número sorteado
                 *para ver se é maior
                */
               /* JOptionPane.showMessageDialog(null,
                        "Errado!\nO número que eu pensei é maior.");
            }else{
                /*
                 *se não for nem maior nem menor, então é igual.
                 *Finaliza o jogo saindo do loop
                */
                /*JOptionPane.showMessageDialog(null,
                        "Parabéns\nVocê adivinhou!\n"
                                + "Eu realmente pensei no número "+rndNr);
                break;
            }
        }
    }*/
    /*public static void main(String[] args) {
        String senha;
        double n1;
        double n2;
        String digiteSenha;
        senha = JOptionPane.showInputDialog("Crie uma senha.","Digite sua senha aqui.");
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número."));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite um número."));
        digiteSenha = JOptionPane.showInputDialog(null,"Digite sua senha:");
        if(senha.equals(digiteSenha)){
            System.out.println(n1/n2);
        }else{
            System.out.println("Senha incorreta");
        }
        System.exit(0);
   }*/
    /*public static void main(String[] args) {
		
		int codigoTaxaAumento;
		float valorProduto;
		
	
		valorProduto = Float.parseFloat(JOptionPane.showInputDialog(null,"R$","Valor do produto",JOptionPane.QUESTION_MESSAGE));
		codigoTaxaAumento = Integer.parseInt(JOptionPane.showInputDialog(null,"Código","Código de taxa do aumento",JOptionPane.QUESTION_MESSAGE));
		
		switch (codigoTaxaAumento) {
		case 1: valorProduto = valorProduto + (valorProduto * 10 / 100);
				JOptionPane.showMessageDialog(null,"R$ " + valorProduto,"Valor do produto com taxa de aumento",JOptionPane.PLAIN_MESSAGE);
			break;
			
		case 3: valorProduto = valorProduto + (valorProduto * 25 / 100);
		JOptionPane.showMessageDialog(null,"R$ " + valorProduto,"Valor do produto com taxa de aumento",JOptionPane.PLAIN_MESSAGE);
			break;
			
		case 4: valorProduto = valorProduto + (valorProduto * 30 / 100);
		JOptionPane.showMessageDialog(null,"R$ " + valorProduto,"Valor do produto com taxa de aumento",JOptionPane.PLAIN_MESSAGE);			
			break;
			
		case 8: valorProduto = valorProduto + (valorProduto * 50 / 100);
		JOptionPane.showMessageDialog(null,"R$ " + valorProduto,"Valor do produto com taxa de aumento",JOptionPane.PLAIN_MESSAGE);	
			break;
			
		default: JOptionPane.showMessageDialog(null,"Código" + codigoTaxaAumento,"Código de taxa de aumento desconhcido",JOptionPane.PLAIN_MESSAGE);
			break;
		}
		System.exit(0);
    }*/
    /*public static void main(String[] args) {

		int quantidadeFuncionarios = 0;
		float salarioFuncionario = 0;
		float totalSalarios = 0;
		float mediaSalarial = 0;
		//variável contadora para laço
		int contadora = 0;
		
		quantidadeFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de funcionários","Número de funcionários",JOptionPane.QUESTION_MESSAGE));
		
		while (contadora < quantidadeFuncionarios){
			contadora++;
			salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o salário do funcionário","Salário",JOptionPane.QUESTION_MESSAGE));
			totalSalarios = totalSalarios + salarioFuncionario;
		}
		
		mediaSalarial = totalSalarios / quantidadeFuncionarios;
		System.out.println("Média Salarial = " + mediaSalarial);

		System.exit(0);
	}*/
    /*public static void main(String[] args) {
        String senha;
        double n1;
        double n2;
        String digiteSenha;
        senha = JOptionPane.showInputDialog("Crie uma senha.","Digite sua senha aqui.");
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o primeiro número."));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o segundo número."));
        digiteSenha = JOptionPane.showInputDialog(null,"Digite sua senha:");
        if(senha.equals(digiteSenha)){
            JOptionPane.showMessageDialog(null,"O resultado da equação foi " + n1/n2);
        }else{
            JOptionPane.showMessageDialog(null,"Senha Incorreta!");
        }
        System.exit(0);
    }*/
    /*public static void main(String[] args) {
        int codigoExpressao;
        double n1;
        double n2;
	double valor;
		
	
                n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o primeiro número."));
                n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o segundo número."));
		codigoExpressao = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha o código da expressão.\n1) '+'  2) '-'  3) '*'  4) '/'","Código",JOptionPane.QUESTION_MESSAGE));
		
		switch (codigoExpressao) {
		case 1: valor = n1 + n2;
			JOptionPane.showMessageDialog(null,"Valor da soma foi de " + valor);
			break;
			
		case 2: valor = n1 - n2;
		JOptionPane.showMessageDialog(null,"Valor da subtração foi de " + valor);
			break;
			
		case 3: valor = n1 * n2;
		JOptionPane.showMessageDialog(null,"Valor da multiplicação foi de " + valor);			
			break;
			
		case 4: valor = n1 / n2;
		JOptionPane.showMessageDialog(null,"Valor da divisão foi de " + valor);	
			break;
			
		default: JOptionPane.showMessageDialog(null,"O código da expressão é desconhecido = " + codigoExpressao,"Código",JOptionPane.PLAIN_MESSAGE);
			break;
		}
		System.exit(0); 
    }*/
    /*public static void main(String[] args) {
        int codigoPedido;
		
		codigoPedido = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha o código do Pedido.\n1) X-Bacon  2) X-Salada  3) X-Picanha  4) X-Tudo","Menu Lanchonete",JOptionPane.QUESTION_MESSAGE));
		
		switch (codigoPedido) {
		case 1:
			JOptionPane.showMessageDialog(null,"X-Bacon\nPreço R$ 20,00");
			break;
			
		case 2:
		JOptionPane.showMessageDialog(null,"X-Salada\nPreço R$ 15,00");
			break;
			
		case 3:
		JOptionPane.showMessageDialog(null,"X-Picanha\nPreço R$ 22,00");			
			break;
			
		case 4:
		JOptionPane.showMessageDialog(null,"X-Tudo\nPreço R$ 30,00");	
			break;
			
		default: JOptionPane.showMessageDialog(null,"O código do Pedido é desconhecido = " + codigoPedido,"Código Pedido",JOptionPane.ERROR_MESSAGE);
			break;
		}
		System.exit(0); 
    }*/
    public static void main(String[] args) {
                String aluno;
                String turma;
                int quantidadeMateria = 0;
		//double salarioFuncionario = 0;
		int notas = 0;
                int nota1, nota2, nota3;
		int media = 0;
		//variável contadora para laço
		int contadora = 0;
		
		aluno = JOptionPane.showInputDialog(null,"Digite o nome do Aluno","Digite o nome do aluno aqui",JOptionPane.QUESTION_MESSAGE);
		turma = JOptionPane.showInputDialog(null,"Digite a turma","Digite o nome do aluno aqui",JOptionPane.QUESTION_MESSAGE);
                quantidadeMateria = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de Matérias","Matérias",JOptionPane.QUESTION_MESSAGE));
                
		for(notas=0;notas<3;notas++){
			contadora++;
			notas = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite as notas","Notas",JOptionPane.QUESTION_MESSAGE));
                }
		
		media = (notas+notas)/quantidadeMateria;
		System.out.println("Média Salarial = " + media);

		System.exit(0);
    }
}
    

