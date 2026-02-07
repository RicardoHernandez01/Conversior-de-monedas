package view;

public class Menu {
    public void mostrarLetrero() {
        System.out.println("""
                Bienvenidos al conversor de monedas
                -----------------------------------
                Elije una opcion:
                1) Unites States Dollar -> Mexican Peso
                2) Mexican Peso -> Unites States Dollar
                3) Argentine Peso -> Mexican Peso
                4) Euro -> Unites States Dollar
                5) Unites States Dollar -> Euro
                6) salir
                """);
    }
}
