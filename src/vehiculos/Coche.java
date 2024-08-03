package vehiculos;

public class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marcaYmodelo, int año, int numeroDePuertas) {
        super(marcaYmodelo, año);
        this.numeroDePuertas = numeroDePuertas;
    }

    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }
}
