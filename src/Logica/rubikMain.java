/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Interfaz.rubiktimer;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Christian
 */
public class rubikMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rubiktimer r = new rubiktimer();
        r.setDefaultCloseOperation(EXIT_ON_CLOSE);
        r.setSize(1305, 765);
        r.setVisible(true);
        r.cerrar();
       /* 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rubiktimer().setVisible(true);
                
            }
            
        });
    */
    }
    
}
