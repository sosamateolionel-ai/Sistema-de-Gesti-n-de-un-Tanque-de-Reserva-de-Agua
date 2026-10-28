//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    TanqueReserva tanque = new TanqueReserva(1000.0);

    System.out.println("Nivel inicial: " + tanque.getNivelActual() + " L de "
            + tanque.getCapacidadMaxima() + " L");

    System.out.println("\n--- Ingresos de agua ---");
    tanque.llenar(600);
    tanque.llenar(700);     // excedente: supera la capacidad
    tanque.llenar(-20);     // inválido

    System.out.println("\n--- Extracciones ---");
    tanque.consumir(300);
    tanque.consumir(2000);  // excedente: más de lo que hay
    tanque.consumir(0);     // inválido

    System.out.println("\nNivel final: " + tanque.getNivelActual() + " L");

}
