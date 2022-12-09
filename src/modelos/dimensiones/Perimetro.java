package modelos.dimensiones;

import javax.swing.JOptionPane;

public class Perimetro {

    public void calculoPerimetro(Double opcionDecimalLargo, Double opcionDecimalAncho){
        System.out.println("Calculando Perimetro");
        Double resultadoPerimetro = (opcionDecimalLargo * 2) + (opcionDecimalAncho * 2);
        JOptionPane.showMessageDialog(null, "El Perímetro total es: " + resultadoPerimetro,  "Resultado", 1);
    }
    
}
