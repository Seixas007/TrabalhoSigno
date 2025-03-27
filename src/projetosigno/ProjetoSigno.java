package projetosigno;

import java.util.Calendar;
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

    public static void main(String[] args) {
        //importações

        Scanner ler = new Scanner(System.in);
        Calendar hoje = Calendar.getInstance();

        // Declaração de variáveis
        int diaAtual = hoje.get(Calendar.DATE);
        int mesAtual = hoje.get(Calendar.MONTH) + 1;
        int anoAtual = hoje.get(Calendar.YEAR);
        String nome, signo, corSorte, trata, trata2;
        int sexo, diaNascimento, mesNascimento, anoNascimento, numeroSorte;

        //Saída de dados
        System.out.println("Digite seu nome:");
        nome = ler.nextLine();
        //Processamento
        if (nome.length() < 8) {

            //Saída de dados
            System.out.println("Seu nome deve ter mais de 8 caracteres");

            //Processamento
        } else {

            //Saída de dados
            System.out.println("Digite seu sexo(1 para feminino e 2 para masculino):");
            sexo = ler.nextInt();

            //Processamento
            if (sexo == 1) {
                trata = "Sra.";
            } else {
                trata = "Sr.";
            }
            //Saída de dados
            System.out.println("Digite o dia da sua data de nascimento:");
            diaNascimento = ler.nextInt();
            System.out.println("Digite o mês da sua data de nascimento(escreva de 1 a 12):");
            mesNascimento = ler.nextInt();
            //Processamento
            if (diaNascimento >= 1 && diaNascimento <= 31) {

                //Saída de dados
            }
        }
    }
}
//Ainda Não Finalizado!