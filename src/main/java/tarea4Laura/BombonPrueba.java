/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4Laura;

/**
 *
 * @author Cris
 */
public class BombonPrueba {

    public static void main(String[] args) {
        Bombon chocolate = new Bombon("chocolate", 12, "cuadrada");
        Bombon fresa = new Bombon("fresa", 6, "redondo");
        
        System.out.println(chocolate.toString());
        System.out.println(fresa.toString());
    }

}
