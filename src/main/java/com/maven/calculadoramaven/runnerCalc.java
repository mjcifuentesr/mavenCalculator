/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.calculadoramaven;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class runnerCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculadora cal=new calculadora();
        
        // TODO code application logic here
        Double numero1=Double.parseDouble(JOptionPane.showInputDialog("Digite el primero numero"));
        Double numero2=Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero"));
        
        
        JOptionPane.showMessageDialog(null, "Esta es la suma: "+cal.suma(numero1, numero2));
        JOptionPane.showMessageDialog(null, "Esta es la resta: "+cal.resta(numero1, numero2));
        JOptionPane.showMessageDialog(null, "Esta es la multiplicacion: "+cal.multiplicacion(numero1, numero2));
        JOptionPane.showMessageDialog(null, "Esta es la division: "+cal.division(numero1, numero2));
        
    }
    
}
