package projetosigno;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Luis Felipe e Filipe Noll PROJETO:Seu programa deve solicitar as
 * seguintes informações do usuário: nome, sexo, dia, mês e ano de nascimento.
 * Com base nesses dados, o programa calculará a idade do usuário, identificará
 * o signo correspondente e apresentará informações personalizadas, como o
 * número da sorte e a cor da sorte.
 */
public class ProjetoSigno {
    private static CalcularIdade calcular;
    private static Signos signos;
    private static InfoPersonalizada info;
    private static int sexo = 0;
    private static String nome, dataNascimento, tratar;
    
    public static void main(String[] args) {
        //importações
        Scanner ler = new Scanner(System.in);       
        
        //Saída de dados
        System.out.print("Digite seu nome: ");
        nome = ler.nextLine();
        //Processamento
        if (nome.length() < 8) {

            //Saída de dados
            System.out.println("Seu nome deve ter mais de 8 caracteres");
            // Para a execução e sai.
            System.exit(0);
        }
        
        //Saída de dados
        System.out.print("Digite seu sexo::\n"
                + "[ 1 ] para feminino\n"
                + "[ 2 ] para masculino\n"
                + ">>> ");
        // Uso da exceção para garantir que o valor de entrada seja um inteiro.
        try {
            sexo = ler.nextInt();
        }catch(InputMismatchException e){
            System.out.println("ERRO: "+e);
            System.out.println("Digite um número (1 ou 2)");
            System.exit(0);
        } 
        catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }

        //Processamento
        switch (sexo) {
            case 1:
                tratar = "Sra.";
                break;
            case 2:
                tratar = "Sr.";
                break;
            default:
                System.out.println("Opção inválida\nEncerrando o programa");
                System.exit(0);
        }
            
            //Saída de dados
            ler.nextLine();
            
            // A variável dataNascimento, espera receber uma String no formado
            // onde a separação entre dia, mês e ano, seja por um '/' ou seja
            // dia/mes/ano ex: 13/12/1980.
            System.out.print("Digite a sua data de nascimento:"
                    + "(Ex:: 15/02/2010)\n>>> ");
            dataNascimento = ler.next();

            System.out.println("\nOlá "+tratar+" "+nome);
            
            calcular = new CalcularIdade(dataNascimento);
            System.out.println(tratar+" tem "
                    +calcular.extrairIdade()+" anos de idade.");
            
            signos = new Signos(calcular);
            System.out.println("Signo: "+signos.procurarSigno());
            
            info = new InfoPersonalizada(calcular, nome);
            System.out.println("Seu número da sorte: "+info.numeroDaSorte());
            System.out.println("Sua cor da sorte: "+info.corDaSorte());      
    }
}
