
package juegoejemplo;

import java.util.Scanner;

//Federico Sarmiento
//Ramiro Romero
//Juan Diego Arce
//Abregu Juan Demetrio

public class JuegoEjemplo {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        Auto ford = new Auto("rojo", 10,5);
        
        Escena escena = new Escena(ford);
        
        System.out.println("Posicion(X,Y)"+ford.getPosX()+" "+ford.getPosY());
        
        escena.jugar();
        
        System.out.println("Fin del juego");
    }
    
}
