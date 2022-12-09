package modelos.monedas;

import javax.swing.JOptionPane;

import modelos.utilidad.FormatearResultado;

public class ArsWonSul {
    Double wonStandard = 7.74;
    Double pesosStandard = 0.13;
    
    public void wonToPesosArg(double opcionDecimal) {
        Double wonTotalPesosDec = opcionDecimal * pesosStandard;
        String wonTotalPesos = FormatearResultado.formatoDecim(wonTotalPesosDec);
        JOptionPane.showMessageDialog(null, opcionDecimal +" won surcoreanos equivalen a: " + wonTotalPesos + " pesos Argentinos", "Resultado", 1);

        Double pesosTotalWonDec = wonStandard * opcionDecimal;
        String pesosTotalWon = FormatearResultado.formatoDecim(pesosTotalWonDec);
        JOptionPane.showMessageDialog(null, opcionDecimal +" pesos argentinos equivalen a: " + pesosTotalWon + " won surcoreano", "Resultado", 1);
    }

    
}
