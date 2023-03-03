/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Receba os valores em x e y. Efetua a troca de seus valores e mostre seus
conteúdos.
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class Exercício6 {
    public static void main (String args []){
        double x, y;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y: "));
        
        JOptionPane.showMessageDialog(null, "O valor de x é " + y);
        JOptionPane.showMessageDialog(null, "O valor de y é " + x);
    }
    
}
