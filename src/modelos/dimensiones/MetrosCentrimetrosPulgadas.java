package modelos.dimensiones;

import javax.swing.JOptionPane;

import modelos.utilidad.FormatearResultado;

public class MetrosCentrimetrosPulgadas {

    public void calculoMtsCmsIn(Double opcionDecimalmtrsCmIn){
        System.out.println("Calculando Centímetros-Metros-Pulgadas");
        Double resultadoCmsDec = (opcionDecimalmtrsCmIn * 100);
        String resultadoCms = FormatearResultado.formatoDecim(resultadoCmsDec);
        JOptionPane.showMessageDialog(null, "Su unidad " + opcionDecimalmtrsCmIn + "mts equivale a: " + resultadoCms + "cms.",  "Resultado Metros a Centímetros", 1);
        
        Double resultadoInDec = (opcionDecimalmtrsCmIn * 39.37);
        String resultadoIn = FormatearResultado.formatoDecim(resultadoInDec);
        JOptionPane.showMessageDialog(null, "Su unidad " + opcionDecimalmtrsCmIn + "mts equivale a: " + resultadoIn + "In.",  "Resultado Metros a Pulgadas", 1);

    }
    
}
