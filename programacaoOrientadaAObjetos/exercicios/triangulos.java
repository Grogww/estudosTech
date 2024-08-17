package programacaoOrientadaAObjetos.exercicios;

import java.util.Scanner;

// Leia os 03 ângulos e os 03 lados de um triângulo, e classifique-o como: retângulo,
// obtusângulo ou acutângulo; e equilátero, escaleno ou isósceles.

public class triangulos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] angulos = new float[3];
        float[] lados = new float[3];

        for(int i=0; i<3; i++){
            System.out.print(String.format("Entre com o %dº angulo do triangulo: ", i));
            angulos[i] = input.nextFloat();
            System.out.print(String.format("Entre com o %dº lado do triangulo: ", i));
            lados[i] = input.nextFloat();
        }

        clearScreen();
        
        // se soma ang != 180 n é triangulo


        //Ret - 1 angulo de 90
        //obtusangulo - 1 angulo > 90
        //acutângulo - 3 angulos < 90

        //equilatero - 3 lados iguais
        //escaleno - 3 lados diferentes
        //isoceles - 2 lados iguais

        input.close();
    }    

    public static String verificaAngulo(float[] ang){



        return "";
    }

    public static String verificaLado(float[] ang){

        
        
        return "";
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
}
