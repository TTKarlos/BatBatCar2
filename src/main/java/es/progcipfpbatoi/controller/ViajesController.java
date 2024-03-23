package es.progcipfpbatoi.controller;

import es.progcipfpbatoi.model.entidades.Usuario;
import es.progcipfpbatoi.model.entidades.Viaje;
import es.progcipfpbatoi.model.managers.ViajesManager;
import es.progcipfpbatoi.views.ListadoViajesView;
import java.util.List;

public class ViajesController {

    private Usuario usuario;
    private ViajesManager viajesManager;

    public ViajesController() {
        this.viajesManager = new ViajesManager();
        
        /* Por defecto, no hay establecido ningún usuario. Se deberá establecer a posteriori
         Si no quieres realizar el caso de uso 1 hasta el final puedes establecer un usuario
         por defecto. Por ejemplo: this.usuario = new Usuario("roberto1979", "12345"); */
        this.usuario = null;
    }
    
    /**
     * Lista todos los viajes del sistema.
     */
    public void listarViajes() {
        List<Viaje> viajes = viajesManager.findAll();
        System.out.println(new ListadoViajesView(viajes));
    }

    /**
     * Añade un viaje al sistema, preguntando previamente por toda la información necesaria para crearlo.
     */
    public void anyadirViaje() {
        this.viajesManager.add(new Viaje());
    }
}
