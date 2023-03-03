/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Receba o valor de um depósito em poupança. Calcule e mostre o valor
após 1 mês de aplicação sabendo que rende 1,3% a. m.

 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class Exercício8 {
    public static void main (String args []){
        double saldo, deposito;
        
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));
        saldo = deposito * 1.013;
        
        JOptionPane.showMessageDialog(null, "Seu saldo é de " + saldo);
        
    }
    
}
