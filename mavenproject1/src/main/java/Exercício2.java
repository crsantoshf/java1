/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Receba o salário de um funcionário e mostre o novo salário com reajuste
de 15%.
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class Exercício2 {
    public static void main (String args []){
        double salario, reajuste;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário"));
        reajuste = salario*1.15;
        
        JOptionPane.showMessageDialog(null, "Seu salário é igual a " + reajuste);
        
}
    
}
