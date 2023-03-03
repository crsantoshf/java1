/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Receba o raio de uma circunferência. Calcule e mostre o comprimento da
circunferência.
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class Exercício11 {
    public static void main (String args []){
        double x, comprimento;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferência: "));
        
        comprimento = 2*3.14*x;
        
        JOptionPane.showMessageDialog(null, "O comprimento é igual a" + comprimento);
       
    }
    
}
