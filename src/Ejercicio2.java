package src;

public  class Ejercicio2{
    
    public static void main(String[] args){
    Ejercicio2  Ejercicio = new Ejercicio2();
    }
    //Globales
   
    int [] enteros = new int[10];
    
    public  Ejercicio2(){
       for (int i = 0; i < 10; i++) {
          enteros[i]=obtenerAleatorio(i);
          System.out.println("El indice es "+(i)+ " el valor = "+enteros[i] );
       } 
      
        mostrarMayor();
        repitencia();
        
      
    }

     public void repitencia (){
         int cantidad = 0;
         for (int i = 0; i < 10; i++) {
             if (enteros[i] == obtenerAleatorio(i)) {
                 cantidad = cantidad + 1;
             }
         }
         System.out.println("\nSe repiten "+cantidad);
         
     }


    public void mostrarMayor( ){
       int maximo = 0;
        for (int i = 0; i < 10; i++) {
            if(enteros[i] > maximo){
                maximo = enteros[i];
            }
        }
        System.out.println("\nEl mayor "+ maximo );
    }
    
    
    public int obtenerAleatorio(int aleatorio){ 
        aleatorio = (int)(Math.random()*99+0); 
        return aleatorio;
    }  
}