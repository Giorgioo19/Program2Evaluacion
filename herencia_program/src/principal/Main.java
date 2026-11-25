
package principal;

public class Main {

    public static void main(String[] args) {

        // Primera excursión
        Excursion excursion1 = new Excursion(
                "EX001", Destino.MONTANA, 20, 15.5, 4);

        // Segunda excursión
        Excursion excursion2 = new Excursion(
                "EX002", "PLAYA", 25, 10, 2);

        // Mostrar datos
        excursion1.mostrarDatos();
        excursion2.mostrarDatos();

        // Comprobar si los grupos están completos
        System.out.println("Excursión 1 completa: "
                + excursion1.grupoCompleto());

        System.out.println("Excursión 2 completa: "
                + excursion2.grupoCompleto());
    }
}
