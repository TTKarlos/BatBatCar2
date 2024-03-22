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
    }
    
    public void listarViajes() {
        List<Viaje> viajes = viajesManager.findAll();
        System.out.println(new ListadoViajesView(viajes));
    }

    public void anyadirViaje() {
        this.viajesManager.add(new Viaje());
    }
}
