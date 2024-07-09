package Principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConvertirDivisa {
    public static void convertir(String divisaBase, String divisaObjetivo,
                                 ConsultarDivisa consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;
        DecimalFormat df = new DecimalFormat(".00");

        Divisas divisas = consulta.obtenerDivisas(divisaBase, divisaObjetivo);
        System.out.println("La tasa de conversión para hoy\n1" + divisaBase + " = "
                + df.format(divisas.conversion_rate()) + " " + divisaObjetivo);
        System.out.println("Ingrese la cantidad de " + divisaBase);
        cantidad = Double.parseDouble(String.valueOf(lectura.nextDouble()));
        cantidadConvertida = cantidad * divisas.conversion_rate();
        System.out.println(cantidad + " " + divisaBase + " = " +
                df.format(cantidadConvertida) + " " + divisaObjetivo);

    }
}
