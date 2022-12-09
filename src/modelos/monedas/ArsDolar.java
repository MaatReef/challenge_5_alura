package modelos.monedas;

import javax.swing.JOptionPane;
import modelos.utilidad.*;

public class ArsDolar {
    Double dolarStandard = 0.0059;
    Double pesosStandard = 168.18;
    
    public void dolarToPesosArg(double opcionDecimal) {
        Double dolarTotalPesosDec = opcionDecimal * pesosStandard;
        String dolarTotalPesos = FormatearResultado.formatoDecim(dolarTotalPesosDec);
        JOptionPane.showMessageDialog(null, opcionDecimal +" dólares equivalen a: " + dolarTotalPesos + " pesos Argentinos", "Resultado", 1);

        Double pesosTotalDolarDec = dolarStandard * opcionDecimal;
        String pesosTotalDolar = FormatearResultado.formatoDecim(pesosTotalDolarDec);
        JOptionPane.showMessageDialog(null, opcionDecimal +" pesos argentinos equivalen a: " + pesosTotalDolar + " dólares", "Resultado", 1);
    }
}
