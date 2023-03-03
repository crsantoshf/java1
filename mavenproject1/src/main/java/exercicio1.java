/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Coletar o valor do lado de um quadrado, calcular sua área e apresentar o
resultado.

 * @author FATEC ZONA LESTE
 */ 

import javax.swing.JOptionPane;

public class exercicio1 {
    public static void main (String args []){
        double lado = 0, area = 0;
        
        lado = Double.parseDouble(JOptionPane.showInputDialog("Insira o número"));
        area = lado*lado;
        JOptionPane.showMessageDialog(null, "O valor da área é igual a " + area);
    }
    
    
}
