package modelos.temperaturas;

import javax.swing.JOptionPane;

public class FahrenheitRankine {
    
    public void fahrenheitRankine (Double opcionDecimalFahrenheitRankine){
        System.out.println("Calculando Temperatura");
        Double resultadoFahrenheitRankine =  opcionDecimalFahrenheitRankine + 459.67;
        JOptionPane.showMessageDialog(null, "Su unidad equivale en Rankine a : " + resultadoFahrenheitRankine +"º",  "Resultado", 1);
    }

}
