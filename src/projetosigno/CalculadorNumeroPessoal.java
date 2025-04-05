package projetosigno;

import java.util.HashMap;
import java.util.Map;

public class CalculadorNumeroPessoal {
    private static final Map<Character, Integer> VALORES_LETRAS = new HashMap<>();
    static {
        // Configuração dos valores conforme a tabela pitagórica para consoantes
        VALORES_LETRAS.put('J', 1);
        VALORES_LETRAS.put('S', 1);
        VALORES_LETRAS.put('B', 2);
        VALORES_LETRAS.put('K', 2);
        VALORES_LETRAS.put('T', 2);
        VALORES_LETRAS.put('C', 3);
        VALORES_LETRAS.put('L', 3);
        VALORES_LETRAS.put('D', 4);
        VALORES_LETRAS.put('M', 4);
        VALORES_LETRAS.put('V', 4);
        VALORES_LETRAS.put('N', 5);
        VALORES_LETRAS.put('W', 5);
        VALORES_LETRAS.put('F', 6);
        VALORES_LETRAS.put('X', 6);
        VALORES_LETRAS.put('G', 7);
        VALORES_LETRAS.put('P', 7);
        VALORES_LETRAS.put('Y', 7);
        VALORES_LETRAS.put('H', 8);
        VALORES_LETRAS.put('Q', 8);
        VALORES_LETRAS.put('Z', 8);
        VALORES_LETRAS.put('R', 9);
    }
    
    public static int calculo(String nome){
        nome = nome.trim().toUpperCase();
        int somaTotal = 0;
        
        // Divide o nome em partes (nomes e sobrenomes)
        for (String parte : nome.split(" ")) {
            int somaParte = 0;
            
            // Calcula a soma das consoantes de cada parte
            for (char letra : parte.toCharArray()) {
                if (VALORES_LETRAS.containsKey(letra)) {
                    somaParte += VALORES_LETRAS.get(letra);
                }
            }
            
            // Reduz a soma da parte para um único dígito
            somaTotal += reduzirDigito(somaParte);
        }
        
        // Reduz a soma total para obter o número final
        int resultadoFinal = reduzirDigito(somaTotal);
        
        //System.out.println("Número pessoal: " + resultadoFinal);
        return resultadoFinal;
    }
    private static int reduzirDigito(int numero) {
        while (numero > 9) {
            int soma = 0;
            while (numero > 0) {
                soma += numero % 10;
                numero /= 10;
            }
            numero = soma;
        }
        return numero;
    }
    
}
