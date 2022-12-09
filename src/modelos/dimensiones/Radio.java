package modelos.dimensiones;

import javax.swing.JOptionPane;

public class Radio {
    public void radioCircunferencia(Double opcionDecimalCircunferencia){
        System.out.println("Calculando Radio de la Circunferencia");
        Double resultadoRadio = (opcionDecimalCircunferencia / 2) ;
        JOptionPane.showMessageDialog(null, "El Radio de su Circunferencia es: " + resultadoRadio,  "Resultado", 1);
    }  
}
