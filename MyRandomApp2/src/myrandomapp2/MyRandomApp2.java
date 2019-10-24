/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myrandomapp2;

import java.util.Random;

/**
 *
 * @author Administrateur
 */
public class MyRandomApp2 {

    public static int genererNombre(int borneInf, int borneSup) {
        Random randomNumber = new Random();
        int nb;
        nb = borneInf + randomNumber.nextInt(borneSup - borneInf);
        return nb;
    }

    public static void main(String[] args) {
        
        int nbARetrouver = genererNombre(0, 1001);
        int currentNumber = -1;
        int compteur = 0;
        System.out.println("intervalle[0, 1000]: " + nbARetrouver);

        while (nbARetrouver != currentNumber) {
            currentNumber = genererNombre(0, 1001);
            compteur++;
        }

        System.out.println("il a fallu " + compteur + " tirages pour retrouver le nombre de départ");
    }
}