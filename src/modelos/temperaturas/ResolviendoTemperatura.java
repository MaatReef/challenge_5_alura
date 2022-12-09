package modelos.temperaturas;

import javax.swing.JOptionPane;


public class ResolviendoTemperatura {
    public void opcionElegida(String dimensionElegida) {

        switch (dimensionElegida) {
            case "Celsius a Fahrenheit":
            	CelsiusFahrenheit celsiusFahrenheit = new CelsiusFahrenheit();               
                String celsiusFahrenheitInput = (String) (JOptionPane.showInputDialog(null, "Ingrese sus Grados Celsius:"));
                Double opcionDecimalTemp = Double.parseDouble(celsiusFahrenheitInput);
                celsiusFahrenheit.celsiusToFahrenheit(opcionDecimalTemp);
                break;
        
            case "Celsius a Kelvin":
            	CelsiusKelvin celsiusKelvin = new CelsiusKelvin();
                String celsiusKelvinInput = (String) (JOptionPane.showInputDialog(null, "Ingrese sus Grados Celsius:"));
                Double opcionDecimalTempToKelvin = Double.parseDouble(celsiusKelvinInput);
                celsiusKelvin.celsiusToKelvin(opcionDecimalTempToKelvin);
                break;
        
            case "Celsius a Rankine":
                CelsiusRankine celsiusRankine = new CelsiusRankine();
                String celsiusRankineInput = (String) (JOptionPane.showInputDialog(null, "Ingrese sus Grados Celsius:"));
                Double opcionDecimalTempToRankine = Double.parseDouble(celsiusRankineInput);
                celsiusRankine.celsiusToRankine(opcionDecimalTempToRankine);
                break;

            case "Fahrenheit a Celsius":
                FahrenheitCelsius fahrenheitCelsius = new FahrenheitCelsius();
                String fahrenheitCelsiusInput = (String) (JOptionPane.showInputDialog(null, "Ingrese sus Grados Fahrenheit:"));
                Double opcionDecimalTempToCelsius = Double.parseDouble(fahrenheitCelsiusInput);
                fahrenheitCelsius.fahrenheitToCelsius(opcionDecimalTempToCelsius);
                break;

            case "Fahrenheit a Kelvin":
                FahrenheitKelvin fahrenheitKelvin = new FahrenheitKelvin();
                String fahrenheitKelvinInput = (String) (JOptionPane.showInputDialog(null, "Ingrese sus Grados Fahrenheit:"));
                Double opcionDecimalFahrenheitoKelvin = Double.parseDouble(fahrenheitKelvinInput);
                fahrenheitKelvin.fahrenheitKelvin(opcionDecimalFahrenheitoKelvin);
                break;
                
            case "Fahrenheit a Rankine":
                FahrenheitRankine fahrenheitRankine = new FahrenheitRankine();
                String fahrenheitRankineInput = (String) (JOptionPane.showInputDialog(null, "Ingrese sus Grados Fahrenheit:"));
                Double opcionDecimalFahrenheitRankine = Double.parseDouble(fahrenheitRankineInput);
                fahrenheitRankine.fahrenheitRankine(opcionDecimalFahrenheitRankine);
                break;
    
            default:
                break;
        }
    
    }
}

