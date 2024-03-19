/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoejemplo;

import java.util.Scanner;

/**
 *
 * @author Nedisane
 */
public class Escena {
    Scanner leer = new Scanner(System.in);
    
    private Auto auto;
    private Pared pared;
    
    public Escena(Auto auto) {
        this.auto = auto;
        this.pared = new Pared();
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    public void jugar() {
        //Utilizando Scanner
        //A ---> Izquierda
        //S ---> Abajo
        //D ---> Derecha
        //W ---> Para arriba
        //E.. Salir del juego
        //Si el auto choca con la pared, el auto queda chocado
        auto.setChocado(false);
        String letra = "";
        System.out.println("X: "+pared.getPosX()+" Y: "+pared.getPosY());
        while (!letra.equals("E")) {
            System.out.println("Para donde se quiere mover");
            letra = leer.nextLine();
            //if (!auto.isChocado()) {
                switch (letra) {
                    case "A":
                        auto.moverIzquierda();
                        break;
                    case "S":
                        auto.moverAbajo();
                        break;
                    case "D":
                        auto.moverDerecha();
                        break;
                    case "W":
                        auto.moverArriba();
                        break;
                    default:
                        System.out.println("Se ingreso una letra incorrecta");
                    }
                
                    if (auto.getPosX() > pared.getPosX() && auto.getPosX() < (pared.getPosX() + 5)){
                        if (auto.getPosY() < pared.getPosY() && auto.getPosY() > (pared.getPosX() + 5)){
                            auto.setChocado(true);
                        }
                    }
                                    System.out.println(auto.isChocado());
                }
                    
//                if (auto.getPosX() < pared.getPosX() && auto.getPosX() > pared.getPosX()+5) {
//                    if (auto.getPosY() > pared.getPosY() && auto.getPosY() < pared.getPosY()+5) {
//                        auto.setChocado(false);
//                    } else {
//                        auto.setChocado(true);
//                    }
//                } else {
//                    auto.setChocado(true);
    }
}
            //}  else {
            //    System.out.println("CHOCASTE CABEZON");
            //}
        
    

