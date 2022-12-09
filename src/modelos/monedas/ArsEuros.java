package modelos.monedas;

import javax.swing.JOptionPane;

import modelos.utilidad.FormatearResultado;

public class ArsEuros {
    static Double eurosStandard = 0.0057;
    static Double pesosStandard = 176.78;
    
    public void eurosToPesosArg(double opcionDecimal) {
        Double eurosTotalPesosDec = opcionDecimal * pesosStandard;
        String eurosTotalPesos = FormatearResultado.formatoDecim(eurosTotalPesosDec);
        JOptionPane.showMessageDialog(null, opcionDecimal +" euros equivalen a: " + eurosTotalPesos + " pesos Argentinos", "Resultado", 1);
        
        Double pesosTotalEurosDec = eurosStandard * opcionDecimal;
        String pesosTotalEuros = FormatearResultado.formatoDecim(pesosTotalEurosDec);
        JOptionPane.showMessageDialog(null, opcionDecimal +" pesos argentinos equivalen a: " + pesosTotalEuros + " euros", "Resultado", 1);
    }
}
