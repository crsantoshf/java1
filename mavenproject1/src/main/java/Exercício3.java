/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class Exercício3 {
    public static void main (String args []){
        double base, altura, area;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triângulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triângulo"));
        
        area = base*altura/2;
        
        JOptionPane.showMessageDialog(null, "A área do triângulo é igual a " + area);
        
        
    }
    
}
