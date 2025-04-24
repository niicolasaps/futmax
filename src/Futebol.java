package src;

import java.util.Scanner;

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
        int n = skills.length;


        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (skills[j] < skills[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = skills[i];
            skills[i] = skills[minIndex];
            skills[minIndex] = temp;
        }

        int maxTamanho = 0;
        int esquerda = 0;

        for (int direita = 0; direita < n; direita++) {
            while (skills[direita] - skills[esquerda] > 5) {
                esquerda++;
            }
            int tamanhoAtual = direita - esquerda + 1;
            if (tamanhoAtual > maxTamanho) {
                maxTamanho = tamanhoAtual;
            }
        }

        return maxTamanho;
    }
}
