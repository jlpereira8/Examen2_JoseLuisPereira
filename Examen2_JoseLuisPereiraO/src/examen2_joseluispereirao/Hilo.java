/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_joseluispereirao;

import javax.swing.JLabel;

/**
 *
 * @author j0c3lwiz
 */
public class Hilo implements Runnable {

    private JLabel duracion;
    private double fin;

    //public Hilo(JLabel duracion, double fin) {
      //  this.duracion = duracion;
  //      this.fin = fin;
   // }

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    System.out.println(m + " : " + s);
                                                  
                }
            }
            } catch (InterruptedException e) {

            }
        }
    }

}
