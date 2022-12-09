package modelos.dimensiones;

import javax.swing.JOptionPane;

import modelos.utilidad.FormatearResultado;

public class PulgadasCentimetrosMetros {
    public void calculoInCmMts(Double opcionDecimalInCmMts){
        System.out.println("Calculando Centímetros-Metros-Pulgadas");
        Double resultadoCmsDec = (opcionDecimalInCmMts * 2.54);
        String resultadoCms = FormatearResultado.formatoDecim(resultadoCmsDec);
        JOptionPane.showMessageDialog(null, "Su unidad " + opcionDecimalInCmMts + "in equivale a: " + resultadoCms + "cms.",  "Resultado Pulgadas a Centímetros", 1);
        
        Double resultadoMtsDec = (opcionDecimalInCmMts / 39.37);
        String resultadoMts = FormatearResultado.formatoDecim(resultadoMtsDec);
        JOptionPane.showMessageDialog(null, "Su unidad " + opcionDecimalInCmMts + "in equivale a: " + resultadoMts + "mts.",  "Resultado Pulgadas a Metros", 1);

    }
}
