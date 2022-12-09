package modelos.utilidad;

import javax.swing.JOptionPane;

// import modelos.dimensiones.ResolviendoDimensiones;
// import modelos.monedas.ResolviendoMonedas;
// import modelos.temperaturas.ResolviendoTemperatura;

public class Filtro {
    
    public void opcionElegida(String opcionElegida) {
        System.out.println(opcionElegida);

        switch (opcionElegida) {
            case "Monedas":
                String monedaElegida = (String) (JOptionPane.showInputDialog(null, "¿Qué deseas Convertir?","Conversor de Unidades", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Puede Elegir", "Peso Argentino - Dolar", "Peso Argentino - Euros", "Peso Argentino - Libras","Peso Argentino - Won surcoreano", "Peso Argentino - Yen"}, "Puede Elegir"));
                String opcionInt = (String) (JOptionPane.showInputDialog(null, monedaElegida));
                Double opcionDecimal = Double.parseDouble(opcionInt);
                modelos.monedas.ResolviendoMonedas resolviendo = new modelos.monedas.ResolviendoMonedas();
                resolviendo.opcionElegida(opcionDecimal, monedaElegida);
                break;
            case "Dimensiones":
                String dimensionElegida = (String) (JOptionPane.showInputDialog(null, "¿Qué deseas Convertir?","Conversor de Unidades", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Perímetro de un rectángulo", "Perímetro de una Circunferencia", "Radio de una Circunferencia", "Volumen de un Cubo", "Calcuar Centímetros a Metros-Pulgadas", "Calcuar Metros a Centímetros-Pulgadas", "Calcuar Pulgadas a Centímetros-Metros" }, "Puede Elegir"));
                modelos.dimensiones.ResolviendoDimensiones resolviendoDimension = new modelos.dimensiones.ResolviendoDimensiones();
                resolviendoDimension.opcionElegida(dimensionElegida);
                break;
            
            case "Temperatura":
                String tempElegida = (String) (JOptionPane.showInputDialog(null, "¿Qué deseas Convertir?","Conversor de Unidades", JOptionPane.PLAIN_MESSAGE, null, new Object[]{ "Celsius a Fahrenheit", "Celsius a Kelvin", "Celsius a Rankine", "Fahrenheit a Celsius", "Fahrenheit a Kelvin", "Fahrenheit a Rankine" }, "Puede Elegir"));
                modelos.temperaturas.ResolviendoTemperatura resolviendoTemperatura = new modelos.temperaturas.ResolviendoTemperatura();
                resolviendoTemperatura.opcionElegida(tempElegida);
                break;
            default:
                break;
        }
    }

}
