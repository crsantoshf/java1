/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Receba a temperatura em graus Celsius. Calcule e mostre a sua
temperatura convertida em fahrenheit F = (9*C+160) /5.

 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class Exercício4 {
    public static void main (String args []){
        double celsius, fahrenheit;
        
        celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius "));
        fahrenheit = ((9*celsius) + 160)/5;
        
        JOptionPane.showMessageDialog(null, fahrenheit + "F");
                
        
    }
    
}
