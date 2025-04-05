package projetosigno;
import java.util.ArrayList;

public class InfoPersonalizada {
    private final ArrayList<Integer> digitos;
    private final int dia, mes , ano;
    private int soma;
    private final String nome;
   
    
    public InfoPersonalizada(CalcularIdade data, String nome){
        this.digitos = new ArrayList<>();
        this.nome = nome;
        this.dia = data.getData().get(0);
        this.mes = data.getData().get(1);
        this.ano = data.getData().get(2);
       
    }
    public int numeroDaSorte(){
        /*
        * A formula matemática para achar o número da sorte, eu achei nesse
        * site https://www.astrolink.com.br/artigo/numeros-da-sorte
        */
        String dataString = dia+""+mes+""+ano;
        return somaDigitos(separarDigitos(dataString));
        
    }
    
    public ArrayList<Integer> separarDigitos(String dados){
        digitos.clear();
        for(String i:dados.split("")){
            digitos.add(Integer.valueOf(i));
        }
        return digitos;
    }
    
    public int somaDigitos(ArrayList<Integer> dados){
        while(dados.size()>1){
            soma = 0;
            for(int i: dados){
                soma += i;
            }
            somaDigitos(separarDigitos(String.valueOf(soma)));
        }
        return soma;
        
    }public String corDaSorte(){
        /*
        * A formula matématica para achar a cor da sorte, eu encontrei nesse
        * site https://www.uol.com.br/universa/horoscopo/noticias/redacao/2023/11/02/cor-pessoal-revela-personalidade-e-estilo-saiba-como-descobrir-a-sua.htm
        * e todo o calculo, é executado na classe CalculadorNumeroPessoal, e me
        * retorna um numero, a qual será corresponde a uma cor
        */
        int numCor = CalculadorNumeroPessoal.calculo(nome);
        switch (numCor) {
            case 1:
                return "Vermelho";
            case 2:
               return "Rosa";
            case 3:
               return "Amarelo ou laranja";
            case 4:
                return "Verde";
            case 5:
                return "Azul";
            case 6:
                return "Azul-Índigo";
            case 7:
                return "Violeta, magenta, lavanda ou roxo";
            case 8:
                return "Púrpura ou vinho";
            case 9:
                return "Pastel, marvim ou branco";
            default:
                return null;
        }
    }
}
