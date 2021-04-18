import java.util.Scanner;
public class Ejercicio1{

    public static void main(String[] args) {
        
        System.out.println("Arreglo de 4 números\n");
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[4];
        for (int i=0; i<4; i++){

            System.out.println("Ingrese el número en la posición "+(i+1));
            numeros[i] = entrada.nextFloat();
        }

        System.out.println("\nImprimiendo los números del arreglo");
        for (float i:numeros){
            System.out.println(i);
        }
        
    }
}