package src;
public class Ejercicio7 {
    
    int[][] matriz1 =  new int [4][3] ;
    int [][] resultado = new int [4][3];
   
    
    
 
    
    public static void main (String [] args ){
            
          Ejercicio7 ejercicio7 = new Ejercicio7();
       }
  
    public Ejercicio7 (){
     
    primerMatriz();
    impresionMatrices();
        
    }
    
    
    public void primerMatriz (){
    
        for (int i = 0; i < matriz1.length; i++) {
            
            for (int j = 0; j < matriz1.length; j++) {
                
                matriz1 [i][j] = (int)(Math.random()*555+0);
            }
            
        }
    }
    
    
    public void impresionMatrices (){
        
        for (int i = 0; i < matriz1.length; i++) {
            
            for (int j = 0; j < matriz1.length; j++) {
                
                System.out.print (" ["+ matriz1[i][j]+"]");
                
            }
            
                if ( i == 1){
                     System.out.print("  +   ");
                }else{
                     System.out.print("      ");
                }
            
           
             
        
             
            for (int j = 0; j < resultado.length; j++) {
                
                System.out.print (" ["+resultado[i][j]+"]");
            }
            
            System.out.println ("");
            
         }
    }
    
  }
             