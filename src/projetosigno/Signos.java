package projetosigno;

public class Signos {
    private final int dia, mes;
    
    public Signos(CalcularIdade data){
        // recupero a lista com data da classe CalcularIdade.
        this.dia = data.getData().get(0);
        this.mes = data.getData().get(1);
    }
    
    public String procurarSigno(){
        if( (mes == 3 && dia >= 21 && dia <= 31) ||
                (mes == 4 && dia >=1 && dia <= 20) ){
            return "Áries";
        }
        else if( (mes == 4 && dia >= 21 && dia <= 30) ||
                (mes == 5 && dia >= 1 && dia <= 20) ){
            return "Touro";
        }
        else if( (mes == 5 && dia >= 21 && dia <= 31) ||
                (mes == 6 && dia >= 1 && dia <= 20) ){
            return "Gêmeos";
        }
        else if( (mes == 6 && dia >= 21 && dia <= 30) ||
                (mes == 7 && dia >= 1 && dia <= 21) ){
            return "Câncer";
        }
        else if( (mes == 7 && dia >= 22 && dia <= 31) ||
                (mes == 8 && dia >= 1 && dia <= 22) ){
            return "Leão";
        }
        else if( (mes == 8 && dia >= 23 && dia <= 31) ||
                (mes == 9 && dia >= 1 && dia <= 22) ){
            return "Virgem";
        }
        else if( (mes == 9 && dia >= 23 && dia <= 30) ||
                (mes == 10 && dia >= 1 && dia <= 22) ){
            return "Libra";
        }
        else if( (mes == 10 && dia >= 23 && dia <= 31) ||
                (mes == 11 && dia >= 1 && dia <= 21) ){
            return "Escorpião";
        }
        else if( (mes == 11 && dia >= 22 && dia <= 30) ||
                (mes == 12 && dia >= 1 && dia <= 21) ){
            return "Sargitário";
        }
        else if( (mes == 12 && dia >= 22 && dia <= 31) ||
                (mes == 1 && dia >= 1 && dia <= 20) ){
            return "Capricórnio";
        }
        else if( (mes == 1 && dia >= 21 && dia <= 31) ||
                (mes == 2 && dia >= 1 && dia <= 19) ){
            return "Aquário";
        }
        else if( (mes == 2 && dia >= 20 && dia <= 29) ||
                (mes == 3 && dia >= 1 && dia <= 20) ){
            return "Peixe";
        }else{
            return null; 
        }
    }
}
