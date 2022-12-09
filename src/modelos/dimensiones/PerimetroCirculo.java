package modelos.dimensiones;

import javax.swing.JOptionPane;

public class PerimetroCirculo {    
    public void calculoPerimetroCirculo(Double opcionDiametro){
        System.out.println("Calculando Perimetro del Circulo");
        Double resultadoPerimetroCirculo = (opcionDiametro * 3.14) ;
        JOptionPane.showMessageDialog(null, "El Perímetro total de su Círculo es: " + resultadoPerimetroCirculo,  "Resultado", 1);
    }   
}
    