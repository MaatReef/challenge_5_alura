package modelos.temperaturas;

import javax.swing.JOptionPane;

public class FahrenheitKelvin {
    
    public void fahrenheitKelvin (Double opcionDecimalFahrenheitoKelvin){
        System.out.println("Calculando Temperatura");
        Double resultadoFahrenheitKelvin = ( opcionDecimalFahrenheitoKelvin + 459.67 ) * 5/9;
        JOptionPane.showMessageDialog(null, "Su unidad equivale en Kelvin a : " + resultadoFahrenheitKelvin +"º",  "Resultado", 1);
    }

}
