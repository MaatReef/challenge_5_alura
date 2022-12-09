package modelos.monedas;

import javax.swing.JOptionPane;

import modelos.utilidad.FormatearResultado;

public class ArsYen {
    Double yenStandard = 0.80;
    Double pesosStandard = 1.25;
    
    public void yenToPesosArg(double opcionDecimal) {
        Double yenTotalPesosDec = opcionDecimal * pesosStandard;
        String yenTotalPesos = FormatearResultado.formatoDecim(yenTotalPesosDec);
        JOptionPane.showMessageDialog(null, opcionDecimal +" yen equivalen a: " + yenTotalPesos + " pesos Argentinos", "Resultado", 1);

        Double pesosTotalYenDec = yenStandard * opcionDecimal;
        String pesosTotalYen = FormatearResultado.formatoDecim(pesosTotalYenDec);
        JOptionPane.showMessageDialog(null, opcionDecimal +" pesos argentinos equivalen a: " + pesosTotalYen + " yen", "Resultado", 1);

    }
}
