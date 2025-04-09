package src;

import java.util.Scanner;

/*
 * Problema:
 * 
 * "Dado um array de skills de jogadores de futebol, determinar o 
 * maior time balanceado possível em que a diferença de skills
 * entre quaisquer pares de jogadores no mesmo time não seja
 * maior que 5."
 * 
 * Exemplos de input/output: tests/
 * 
 * Não é permitido o uso da biblioteca Arrays.
 * É permitido o uso de códigos próprios
 * desenvolvidas em aulas anteriores.
 * 
 * Ver especificação em pdf para mais detalhes.
*/
public class Futebol {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Leitura do número de jogadores
        int n = leitor.nextInt();
        int[] skills = new int[n];
        
        // Leitura das skills
        for (int i = 0; i < n; i++) {
            skills[i] = leitor.nextInt();
        }
        leitor.close();
        
        // Cálculo do maior time possível
        int maxTeamSize = maiorTimePossivel(skills);

        System.out.println(maxTeamSize);
    }

    private static int maiorTimePossivel(int[] skills) {
        // Implementar a lógica para calcular o maior time possível
        throw new UnsupportedOperationException("Não implementado");
    }
}
