package modelos.dimensiones;

import javax.swing.JOptionPane;


public class ResolviendoDimensiones {
    
    public void opcionElegida(String dimensionElegida) {
        switch (dimensionElegida) {
            case "Perímetro de un rectángulo":
                Perimetro perimetro = new Perimetro();
                String perimetroLargo = (String) (JOptionPane.showInputDialog(null, "Ingrese el Largo"));
                Double opcionDecimalLargo = Double.parseDouble(perimetroLargo);
                String perimetroAncho = (String) (JOptionPane.showInputDialog(null, "Ingrese el Ancho"));
                Double opcionDecimalAncho = Double.parseDouble(perimetroAncho);
                perimetro.calculoPerimetro(opcionDecimalLargo, opcionDecimalAncho);
                break;
        
            case "Perímetro de una Circunferencia":
                PerimetroCirculo perimetroCirculo = new PerimetroCirculo();
                String perimetroDiametro = (String) (JOptionPane.showInputDialog(null, "Ingrese el Diámetro de su Círculo"));
                Double opcionDecimalDiametro = Double.parseDouble(perimetroDiametro);
                perimetroCirculo.calculoPerimetroCirculo(opcionDecimalDiametro);
                break;
        
            case "Volumen de un Cubo":
                Volumen aristaCubo = new Volumen();
                String aristaCuboString = (String) (JOptionPane.showInputDialog(null, "Ingrese la medida de uno de sus lados de su Cubo"));
                Double opcionDecimalCubo = Double.parseDouble(aristaCuboString);
                aristaCubo.volumenCubo(opcionDecimalCubo);
                break;
            case "Radio de una Circunferencia":
                Radio radioCirunferencia = new Radio();
                String diametroCirunferencia = (String) (JOptionPane.showInputDialog(null, "Ingrese el Diámetro de su Circunferencia"));
                Double opcionDecimalCircunferencia = Double.parseDouble(diametroCirunferencia);
                radioCirunferencia.radioCircunferencia(opcionDecimalCircunferencia);
                break;

            case "Calcuar Centímetros a Metros-Pulgadas":
                CentimetrosMetrosPulgadas cmMtrsIn = new CentimetrosMetrosPulgadas();
                String cmMtrsInInput = (String) (JOptionPane.showInputDialog(null, "Ingrese centímetros a Convertir"));
                Double opcionDecimalcmMtrsIn = Double.parseDouble(cmMtrsInInput);
                cmMtrsIn.calculoCmMtsIn(opcionDecimalcmMtrsIn);
                break;
                
            case "Calcuar Metros a Centímetros-Pulgadas":
                MetrosCentrimetrosPulgadas mtrsCmIn = new MetrosCentrimetrosPulgadas();
                String mtrsCmInInput = (String) (JOptionPane.showInputDialog(null, "Ingrese centímetros a Convertir"));
                Double opcionDecimalmtrsCmIn = Double.parseDouble(mtrsCmInInput);
                mtrsCmIn.calculoMtsCmsIn(opcionDecimalmtrsCmIn);
                break;

            case "Calcuar Pulgadas a Centímetros-Metros":
                PulgadasCentimetrosMetros inCmMtrs = new PulgadasCentimetrosMetros();
                String inCmMtrsInput = (String) (JOptionPane.showInputDialog(null, "Ingrese centímetros a Convertir"));
                Double opcionDecimalInCmMts = Double.parseDouble(inCmMtrsInput);
                inCmMtrs.calculoInCmMts(opcionDecimalInCmMts);
                break;
            default:
                break;
        }
    
    }
}
