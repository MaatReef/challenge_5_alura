package modelos.monedas;

import javax.swing.JOptionPane;

import modelos.utilidad.FormatearResultado;

public class ArsLibras {
    Double libraStandard = 0.0048;
    Double pesosStandard = 206.80;
    
    public void libraToPesosArg(double opcionDecimal) {
        Double libraTotalPesosDec = opcionDecimal * pesosStandard;
        String libraTotalPesos  = FormatearResultado.formatoDecim(libraTotalPesosDec);
        JOptionPane.showMessageDialog(null, opcionDecimal +" libras equivalen a: " + libraTotalPesos + " pesos Argentinos", "Resultado", 1);
        
        Double pesosTotalLibraDec = libraStandard * opcionDecimal;
        String pesosTotalLibra = FormatearResultado.formatoDecim(pesosTotalLibraDec);
        JOptionPane.showMessageDialog(null, opcionDecimal +" pesos argentinos equivalen a: " + pesosTotalLibra + " libras", "Resultado", 1);

    }
}
