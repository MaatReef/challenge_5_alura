package modelos.temperaturas;

import javax.swing.JOptionPane;

public class FahrenheitCelsius {
    
    public void fahrenheitToCelsius(Double opcionDecimalTempToCelsius){
        System.out.println("Calculando Temperatura");
        Double resultadoFahrenheitCelsius = ( opcionDecimalTempToCelsius - 32 ) * 5/9;
        JOptionPane.showMessageDialog(null, "Su unidad equivale en Celsius a : " + resultadoFahrenheitCelsius +"º",  "Resultado", 1);
    }


}
