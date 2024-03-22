package es.progcipfpbatoi.menu;

import es.progcipfpbatoi.controller.ViajesController;

public class Menu {

    private static final int OPCION_SALIR = 9;
    
    private ViajesController agenteViajesController;
    
    public Menu() {
        this.agenteViajesController = new ViajesController();
    }

    public void iniciar(){

        System.out.println("BatBatCar");
        System.out.println("=========");
        
        // Ampliar método para que se soliciten las opciones hasta que se indique la opción salir        
        mostrarOpciones();
        int opcionSeleccionada = solicitarOpcion();
        ejecutarOpcion(opcionSeleccionada);
        
    }

    private void mostrarOpciones() {
        System.out.println("2.Mostrar todos los viajes");
        // .. resto de ocpciones
    }
    
    private int solicitarOpcion() {
        // Implementar método para solicitar la opción al usuario
        System.out.println("Introduce la opción:");
        return 2;
    }
    
    private void ejecutarOpcion(int opcionSeleccionada) {
        
        // Implementar método para ejecutar la opción recibida
        switch (opcionSeleccionada) {
            case 2 -> agenteViajesController.listarViajes();
            default -> throw new UnsupportedOperationException("Por implementar");
        }
    }

}
