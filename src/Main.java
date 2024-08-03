import vehiculos.Coche;
import vehiculos.Moto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Coche
        Coche coche = new Coche("Toyota Corolla", 2020, 4);
        System.out.println("Detalles del Coche:");
        coche.mostrarDetalles();

        // Crear una instancia de Moto
        Moto moto = new Moto("Harley Davidson", 2019, true);
        System.out.println("\nDetalles de la Moto:");
        moto.mostrarDetalles();
    }

}