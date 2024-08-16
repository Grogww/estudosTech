// Faça um programa que leia e armazene em um vetor a nota de 10
// alunos de uma turma. Calcule:
// A maior e a menor nota
// A média da turma
import java.util.Scanner;

public class exemplo1{
    public static void main(String[] args){
        //Leitura do vetor notas
        float[] notas = new float[10];
        notas = LerVetor(notas);

        //impressão da maior e menor nota
        MaiorEMenorNota(notas);
        //impressão da média da turma
        MediaNotas(notas);
    }

    public static float[] LerVetor(float[] notas){
        //Leitura dos inputs de notas
        Scanner input = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.print(String.format("\nDigite a nota nº%d: ", i+1));
            notas[i] = input.nextFloat();
        }
        input.close();

        //limpeza da tela e retorno dos valores recebidos
        clearScreen();
        return notas;
    }

    public static void MaiorEMenorNota(float[] notas){
        float maiorNota = notas[0];
        float menorNota = notas[0];

        for(int i=0; i<10; i++){
            if(notas[i] > maiorNota){
                maiorNota = notas[i];
            }
            if(notas[i] < menorNota){
                menorNota = notas[i];
            }
        }
        System.out.println(String.format("\nMaior nota dos alunos é: %,.2f", maiorNota));
        System.out.println(String.format("Menor nota dos alunos é: %,.2f\n", menorNota));
    }

    public static void MediaNotas(float[] notas){
        float mediaNotas = 0;
        for(int i=0; i<10; i++){
            mediaNotas += notas[i];
        }
        mediaNotas = mediaNotas / notas.length;
        System.out.println(String.format("A Média das notas é: %,.2f\n", mediaNotas));
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

}