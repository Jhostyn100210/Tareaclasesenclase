package vehiculos;

public class Vehiculo {
    private String marcaYmodelo;
    private int año;

    public Vehiculo(String marcaYmodelo, int año) {
        this.marcaYmodelo = marcaYmodelo;
        this.año = año;
    }

    public String getMarcaYmodelo() {
        return marcaYmodelo;
    }

    public void setMarcaYmodelo(String marcaYmodelo) {
        this.marcaYmodelo = marcaYmodelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void mostrarDetalles() {
        System.out.println("Marca y Modelo: " + marcaYmodelo);
        System.out.println("Año: " + año);
    }
}
