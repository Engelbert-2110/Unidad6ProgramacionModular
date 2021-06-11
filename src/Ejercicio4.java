package src;
public class Ejercicio4 {

    int[] valores = new int[10];   

    public static void main (String [] argss){

        Ejercicio4 ejercicio4 = new Ejercicio4();
    }


    public Ejercicio4 (){

        int distancia;
       
        for (int i = 0 ;  i < 10 ; i++){

            valores[i] = obtenerAleatorio(i);
            System.out.println (" El indice es "+i+ " el valor es = "+valores[i]);
        }

         System.out.println("-------------------------------------------");
         diferenciaNumeros();
    }

    public int obtenerAleatorio (int aleatorio){

        aleatorio = (int)(Math.random()*15+1);
        return aleatorio;
    } 

    public void diferenciaNumeros ( ){

        int distancia;
        for (int i = 0; i < 10; i++) {

             distancia =  15 - valores[i];
            System.out.println(" La distancia entre "+ 15 + " - "+ valores[i] +" es : "+distancia);
        }
    } 
}