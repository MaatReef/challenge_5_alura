package modelos.temperaturas;

import javax.swing.JOptionPane;

public class CelsiusKelvin {

    public void celsiusToKelvin(Double opcionDecimalTempToKelvin){
        System.out.println("Calculando Temperatura");
        Double resultadoCelsiusToKelvin = opcionDecimalTempToKelvin + 273.15;
        JOptionPane.showMessageDialog(null, "Su unidad equivale en Kelvin a : " + resultadoCelsiusToKelvin +"º",  "Resultado", 1);
    }
    
}
