package vehiculos;

public class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String marcaYmodelo, int año, boolean tieneSidecar) {
        super(marcaYmodelo, año);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tiene Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}