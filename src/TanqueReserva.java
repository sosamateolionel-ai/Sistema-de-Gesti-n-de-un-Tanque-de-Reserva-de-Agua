public class TanqueReserva {

    private double capacidadMaxima;
    private double nivelActual;

    public TanqueReserva(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.nivelActual = 0;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getNivelActual() {
        return nivelActual;
    }

    public void llenar(double litros) {

        if (litros <= 0) {
            System.out.println("Llenado rechazado: los litros deben ser mayores a cero (" + litros + ").");
            return;
        }

        nivelActual = nivelActual + litros;

        if (nivelActual > capacidadMaxima) {
            nivelActual = capacidadMaxima;
            System.out.println("Tanque lleno: el excedente se descarta. Nivel: " + nivelActual + " L.");
        } else {
            System.out.println("Se agregaron " + litros + " L. Nivel: " + nivelActual + " L.");
        }
    }

    public void consumir(double litros) {

        if (litros <= 0) {
            System.out.println("Consumo rechazado: los litros deben ser mayores a cero (" + litros + ").");
            return;
        }

        nivelActual = nivelActual - litros;

        if (nivelActual < 0) {
            nivelActual = 0;
            System.out.println("Tanque vacío: no había suficiente agua. Nivel: 0.0 L.");
        } else {
            System.out.println("Se consumieron " + litros + " L. Nivel: " + nivelActual + " L.");
        }
    }
}