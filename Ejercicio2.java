import java.util.Scanner;
public class Ejercicio2 {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    String arreglo[] = new String[6];
    Scanner entrada = new Scanner(System.in);

    for(int i=0; i<arreglo.length; i++){

        System.out.println("\nIngrese un caracter: ");
        arreglo[i] = entrada.next();
    }
    System.out.println("\nLos caracteres al inverso son: ");
    for (int i=5; i>=0; i--){
            System.out.println(arreglo[i]);
        }

  }
}