/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.faculdade;

import java.util.Random;

/**
 *
 * @author richard.bernardo
 */
public class FaculdadeMain {

    public static void main(String[] args) {
        Faculdade tes[] = new Faculdade[10];

        Pos_graduacao alun2 = new Pos_graduacao("TM", 14, 2);

         alun2.Mostrar();
         
         
        for (int i = 0; i < tes.length; i++) {
            Random rd = new Random();
            if (tes[i] instanceof Graduacao) {
                System.out.println(" ");
                tes[i] = new Graduacao("TM1", 19, 1);
                tes[i].Mostrar();
            } else {
                System.out.println(" ");
                tes[i] = new Pos_graduacao("TM2", 14, 2);
                tes[i].Mostrar();
            }

        }

    }
}
