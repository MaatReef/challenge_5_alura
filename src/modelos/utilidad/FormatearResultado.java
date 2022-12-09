package modelos.utilidad;

import java.text.DecimalFormat;

public class FormatearResultado {
    public static String formatoDecim(Double formato) {
    	DecimalFormat formato1 = new DecimalFormat("0.00");
    	String formatoNuevo = formato1.format(formato);
		return formatoNuevo;
    }
}
