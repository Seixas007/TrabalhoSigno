package projetosigno;
import java.util.ArrayList;
import java.util.Calendar;

/*
* Classe usada para fazer todo o tratamento da data
* usando o '/' para distinguir o dia, mes e ano
* convertendo em inteiro, e passando para uma lista
* e usada posteiormente para fazer o calculo da idade.
*/

public class CalcularIdade {
    private final Calendar hoje = Calendar.getInstance();
    private final String dataNascimentoString;
    private final ArrayList<Integer> dataNascimentoListaInt;
    private final int diaAtual = hoje.get(Calendar.DATE);
    private final int mesAtual = hoje.get(Calendar.MONTH) + 1;
    private final int anoAtual = hoje.get(Calendar.YEAR);
    private int idade;
    
    public CalcularIdade(String dataNascimentoString){
        this.dataNascimentoListaInt = new ArrayList<>();
        this.dataNascimentoString = dataNascimentoString;
    }
    
    private ArrayList<Integer> extrairDadosdaData(){
        /*
        * Esse método é respondavel para receber a data no formato de
        * uma String, fazer a separação do dia, mês e ano, converter para
        * inteiro e passar o valor para a lista dataNascimentoListaInt.
        */
        
        dataNascimentoListaInt.clear();
        for(String i: dataNascimentoString.split("/")){
            dataNascimentoListaInt.add(Integer.valueOf(i));
        }
        return dataNascimentoListaInt;
    }
    public int extrairIdade(){
        try {
            int diaNascimento = extrairDadosdaData().get(0);
            int mesNascimento = extrairDadosdaData().get(1);
            int anoNascimento = extrairDadosdaData().get(2);
            idade = anoAtual - anoNascimento;

            // Diminui um ano da idade, caso o mês ou o dia ainda não foram completado
            if(mesAtual < mesNascimento){ 
                idade--;
            }
            else if(mesAtual == mesNascimento && diaAtual < diaNascimento){
                idade--;
            }
            
        } catch (IndexOutOfBoundsException e) {
            System.out.println("O Formato para a data de nascimento, deverá"
                    + " ser nesse tipo de formato: 20/01/2010");
            System.exit(0);
        } catch(Exception e){
            System.out.println("Erro "+e);
        }
        return idade;
    }
    
    public ArrayList<Integer> getData(){
        // Lança a data para poder ser usada por outras classes
        return dataNascimentoListaInt;
    }
}
