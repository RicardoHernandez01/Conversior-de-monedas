import com.google.gson.Gson;
import http.Api;
import model.MonedaDTO;
import view.Menu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        float monto = 0f;
        int opcion = 0;
        String[] monedaSeleccionada;
        Menu menu = new Menu();
        Scanner sn = new Scanner(System.in);
        Gson gson = new Gson();

        try{
            menu.mostrarLetrero();
            opcion = sn.nextInt();
            sn.nextLine();

            while(opcion > 0 && opcion < 6){
                monedaSeleccionada = getMonedas(opcion);
                System.out.println("Ingresa el monto a convertir");
                monto = sn.nextFloat();
                sn.nextLine();


                Api api = new Api(monedaSeleccionada, monto);

                MonedaDTO monedaDto = gson.fromJson(api.getResponse().body(), MonedaDTO.class);

                System.out.println("La conversion de " + monto + " " + monedaSeleccionada[0] + " -> "
                        + monedaSeleccionada[1] + " = "+monedaDto.conversion_result());
                System.out.println();

                menu.mostrarLetrero();
                opcion = sn.nextInt();
                sn.nextLine();

            }
        }catch (InputMismatchException e){
            System.out.println("error al elegir una opcion ");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("El programa ha finalizado");

    }

    public static String[] getMonedas(int opcion){
        String[] monedas = {"USD","MXN","ARS","EUR"};
        switch (opcion){
            case 1 -> {
                return new String[]{monedas[0], monedas[1]};
            }
            case 2 -> {
                return new String[]{monedas[1], monedas[0]};
            }
            case 3 -> {
                return new String[]{monedas[2], monedas[1]};
            }
            case 4 -> {
                return new String[]{monedas[3], monedas[0]};
            }
            case 5 -> {
                return new String[]{monedas[0], monedas[3]};
            }
            default -> throw new RuntimeException(
                    "se ha producido un error en la seleccion de las monedas");
        }
    }
}
