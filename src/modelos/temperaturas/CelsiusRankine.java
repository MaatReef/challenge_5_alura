package modelos.temperaturas;

import javax.swing.JOptionPane;

public class CelsiusRankine {
    
    public void celsiusToRankine(Double opcionDecimalTempToRankine){
        System.out.println("Calculando Temperatura");
        Double resultadoCelsiusToRankine = ( opcionDecimalTempToRankine * 1.8 ) + 491.67;
        JOptionPane.showMessageDialog(null, "Su unidad equivale en Kelvin a : " + resultadoCelsiusToRankine +"º",  "Resultado", 1);
    }

}
