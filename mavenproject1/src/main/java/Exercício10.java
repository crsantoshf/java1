/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Receba 2 números reais. Calcule e mostre a diferença desses valores.
 * @author FATEC ZONA LESTE
 */

import javax.swing.JOptionPane;

public class Exercício10 {
    public static void main (String args []){
        double x, y, diferenca;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        
        diferenca = x - y;
        
        JOptionPane.showMessageDialog(null, "x menos y é igual a " + diferenca);
    }
    
}
