package modelos.monedas;



public class ResolviendoMonedas {
    
    public void opcionElegida(Double opcionDecimal, String monedaElegida) {
        switch (monedaElegida) {

            case "Peso Argentino - Dolar":
                ArsDolar arsDolar = new ArsDolar();
                arsDolar.dolarToPesosArg(opcionDecimal);
                break;
        
            case "Peso Argentino - Euros":
                ArsEuros arsEuros = new ArsEuros();
                arsEuros.eurosToPesosArg(opcionDecimal);
                break;
        
            case "Peso Argentino - Libras":
                ArsLibras arsLibras = new ArsLibras();
                arsLibras.libraToPesosArg(opcionDecimal);
                break;
        
            case "Peso Argentino - Won surcoreano":
                ArsWonSul arsWon = new ArsWonSul();
                arsWon.wonToPesosArg(opcionDecimal);
                break;

            case "Peso Argentino - Yen":
                ArsYen arsYen = new ArsYen();
                arsYen.yenToPesosArg(opcionDecimal);
                break;
        
            default:
                break;
        }
    
    }
}
