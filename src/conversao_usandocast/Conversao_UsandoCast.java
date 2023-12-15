package conversao_usandocast;

import javax.swing.*;

public class Conversao_UsandoCast {

    public static void main(String[] args) {
        
        //1° Questão
        int a = (int)1.5;
        int b = (int)2.7;
        System.out.println("A = "+a+"\n B = "+b+"\n");
        
        //2°Questão
        int nota1 = (int)8.7, nota2 = (int)4.8, nota3 = 7;
        int soma = nota1 + nota2 + nota3;
        double media = (double)soma / 3;
        System.out.println("Soma: "+soma);
        System.out.println("Média das Notas: "+media);
        
        //3° Questão
        int valAltura = Integer.parseInt(JOptionPane.showInputDialog("Informe a medida da Altura da Parede."));
        JOptionPane.showMessageDialog(null, "Altura = "+valAltura);
        
        int valLargura = Integer.parseInt(JOptionPane.showInputDialog("Informe a medida da Largura da Parede."));
        JOptionPane.showMessageDialog(null, "Largura = "+valLargura);
        
        //1 litro pinta 4 metros quadrados;
        //1 lata contém 5 litros;
        //1 lata pinta 20 metros quadrados;
        
        double quantParedRetangular = valLargura * valAltura;
        JOptionPane.showMessageDialog(null, "Medida da parede retangular = "+quantParedRetangular+" metros quadrados");
                
    }
    
}
