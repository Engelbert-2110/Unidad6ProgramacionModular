package src;
import java.util.*;
public  class Ejercicio3{
    
    Scanner entrada = new Scanner(System.in);
    int [] numeros = new int[8];
    int buscar;
    
    public static void main(String[] args){
    Ejercicio3  Ejercicio = new Ejercicio3();
    }
   
    public Ejercicio3(){
        System.out.println("");
        for (int i = 0; i < 8; i++) {
            pedirDatos(i);
        }

        buscarDatos();

        realizarBusqueda();

    }
    
    public void realizarBusqueda(){
        for (int i = 0; i < 8; i++) {
            if (numeros[i] == buscar) {
                System.out.println("Se encontro el nuemro en la posición "+(i+1));
            }
		

        }
	
    }

    
    public void buscarDatos(){
      System.out.println("Ingrese el numero a buscar ");
       buscar = entrada.nextInt();
    }

    public void pedirDatos(int numero){
        System.out.println("Ingrese el valor No. "+(numero+1));
        numeros[numero] = entrada.nextInt();
    }
           
}