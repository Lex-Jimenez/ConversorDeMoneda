package Principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        ConsultarDivisa consulta = new ConsultarDivisa();

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("""
                    \n************************************************
                    \nSea bienvenido/a al Conversor de moneda =]
                    \n1) Dólar ==>> Peso argentino
                    2) Peso argentino ==>> Dólar
                    3) Dólar ==>> Real brasileño
                    4) Real brasileño ==>> Dólar
                    5) Dólar ==>> Peso colombiano
                    6) Peso colombiano ==>> Dólar
                    7) Salir
                    \nElija una opción valida:
                    \n************************************************
                    """);
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1: {
                    ConvertirDivisa.convertir("USD", "ARS", consulta, lectura);
                    break;
                }
                case 2: {
                    ConvertirDivisa.convertir("ARS", "USD", consulta, lectura);
                    break;
                }
                case 3: {
                    ConvertirDivisa.convertir("USD", "BRL", consulta, lectura);
                    break;
                }
                case 4: {
                    ConvertirDivisa.convertir("BRL", "USD", consulta, lectura);
                    break;
                }
                case 5: {
                    ConvertirDivisa.convertir("USD", "COP", consulta, lectura);
                    break;
                }
                case 6: {
                    ConvertirDivisa.convertir("COP", "USD", consulta, lectura);
                    break;
                }
                case 7: {
                    System.out.println("Terminando programa");
                    break;
                }
            }
        }
    }
}