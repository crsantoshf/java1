/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.

 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class Exercício9 {
    public static void main (String args []){
        double x, y, soma;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite um número inteiro: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite outro númeor inteiro: "));
        
        soma = Math.pow(x,2)+ Math.pow(y,2);
        
        JOptionPane.showMessageDialog(null, "O valor da soma dos quadrados é igual a " + soma);
    }
    
}
