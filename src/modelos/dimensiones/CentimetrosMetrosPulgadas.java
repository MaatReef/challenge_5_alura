package modelos.dimensiones;

import javax.swing.JOptionPane;

import modelos.utilidad.FormatearResultado;

public class CentimetrosMetrosPulgadas {
    
    public void calculoCmMtsIn(Double opcionDecimalcmMtrsIn){
        System.out.println("Calculando Centímetros-Metros-Pulgadas");
        Double resultadoMtsDec = (opcionDecimalcmMtrsIn /100);
        String resultadoMts = FormatearResultado.formatoDecim(resultadoMtsDec);
        JOptionPane.showMessageDialog(null, "Su unidad " + opcionDecimalcmMtrsIn + "cms equivale a: " + resultadoMts + "mts.",  "Resultado Centímetros a Metros", 1);
        

        Double resultadoInDec = (opcionDecimalcmMtrsIn * 39.37);
        String resultadoIn = FormatearResultado.formatoDecim(resultadoInDec);
        JOptionPane.showMessageDialog(null, "Su unidad " + opcionDecimalcmMtrsIn + "cms equivale a: " + resultadoIn + "In.",  "Resultado Centímetros a Pulgadas", 1);

    }

}
