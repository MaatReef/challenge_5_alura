package modelos.temperaturas;

import javax.swing.JOptionPane;

public class CelsiusFahrenheit {
    
    public void celsiusToFahrenheit(Double opcionDecimalTemp){
        System.out.println("Calculando Temperatura");
        Double resultadoCelsiusToFahrenheit = (opcionDecimalTemp * 1.8) + 32;
        JOptionPane.showMessageDialog(null, "Su unidad equivale en Fahrenheit a : " + resultadoCelsiusToFahrenheit +"º",  "Resultado", 1);
    }
}
