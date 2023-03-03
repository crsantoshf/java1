/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Receba os valores do comprimento, largura e altura de um paralelepípedo.
Calcule e mostre seu volume.
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class Exercício7 {
    public static void main (String args []){
        double comprimento, largura, altura, volume;
        
        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento: "));
        largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
        
        volume = comprimento*largura*altura;
        
        JOptionPane.showMessageDialog(null, "O volume é igual a " + volume);
        
    }
    
}
