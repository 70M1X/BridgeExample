package control;


/**
 *
 * @author tomas
 */

import bridge.Dispositivo;
import bridge.ControlRemoto;


public class ControlRemotoSimple extends ControlRemoto {

    public ControlRemotoSimple(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void encender() {
        if (!dispositivo.estaEncendido()) {
            dispositivo.encender();
        } else {
            System.out.println("El dispositivo ya está encendido.");
        }
    }

    @Override
    public void apagar() {
        if (dispositivo.estaEncendido()) {
            dispositivo.apagar();
        } else {
            System.out.println("El dispositivo ya está apagado.");
        }
    }

    @Override
    public void aumentarVolumen() {
        dispositivo.aumentarVolumen();
    }

    @Override
    public void disminuirVolumen() {
        dispositivo.disminuirVolumen();
    }
}


