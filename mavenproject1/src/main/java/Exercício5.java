/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Receba os coeficientes A, B e C de uma equação do 2º grau
(AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a
equação possue2 raízes).
 * @author FATEC ZONA LESTE
 */
import javax.swing.JOptionPane;

public class Exercício5 {
    public static void main (String args []){
        double a, b, c, delta, raiz1, raiz2;
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c: "));
        
        delta = (b*b)-(4*a*c);
        raiz1 = (-b + Math.sqrt(delta))/(2*a);
        raiz2 = (-b - Math.sqrt(delta))/(2*a);
        
        JOptionPane.showMessageDialog(null, "os valores das raízes são: " + raiz1 + " " + raiz2);
 
        
        
        

    }
    
}
