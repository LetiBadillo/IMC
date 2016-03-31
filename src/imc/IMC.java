/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
/**
 *
 * @author ASUS
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        calcularIMC calcular= new calcularIMC();
                calcular.setTitle("Calculadora de IMC");
 		calcular.setSize (300,150);
 		calcular.setLocationRelativeTo(null);
 		calcular.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  		calcular.setVisible(true);

        // TODO code application logic here
    }
    
}
