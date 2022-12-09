import javax.swing.JOptionPane;

import modelos.utilidad.*;

public class Principal {

	public static void main(String[] args) {

        boolean continuar = true;

        while (continuar) {
            String opcionElegida = (String) (JOptionPane.showInputDialog(null, "¿Qué deseas Convertir?","Conversor de Unidades", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Monedas", "Dimensiones", "Temperatura"}, "Puede Elegir"));
            Filtro seleccion = new Filtro();
            try {
                seleccion.opcionElegida(opcionElegida);
            } catch (Exception e) {
            }
            Integer confirmar = JOptionPane.showConfirmDialog(null, "¿Deseas Continuar?");
            if (confirmar == 1 || confirmar == 2 ) {
                JOptionPane.showMessageDialog(null, "Gracias por su Atención");
                continuar = false;
            }
        }
    }
}