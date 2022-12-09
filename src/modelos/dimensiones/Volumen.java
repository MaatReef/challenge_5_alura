package modelos.dimensiones;

import javax.swing.JOptionPane;

public class Volumen {
    public void volumenCubo(Double opcionDecimalCubo){
        System.out.println("Calculando Volumen del Cubo");
        Double resultadoVolumenCubo = (opcionDecimalCubo * opcionDecimalCubo * opcionDecimalCubo) ;
        JOptionPane.showMessageDialog(null, "El Volumen de su cubo es: " + resultadoVolumenCubo,  "Resultado", 1);
    }  
}
