package control;


/**
 *
 * @author tomas
 */

import bridge.Dispositivo;
import bridge.ControlRemoto;


public class ControlRemotoAvanzado extends ControlRemoto {

    public ControlRemotoAvanzado(Dispositivo dispositivo) {
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

    
    // Métodos nuevos que se agregan específicamente para este control
    
    
    public void cambiarCanal(int canal) {
        if (dispositivo instanceof bridge.Television) {
            ((bridge.Television) dispositivo).cambiarCanal(canal);
        } else {
            System.out.println("Cambio de canal no soportado por este dispositivo.");
        }
    }

    public void cambiarFrecuencia(double frecuencia) {
        if (dispositivo instanceof bridge.Radio) {
            ((bridge.Radio) dispositivo).cambiarFrecuencia(frecuencia);
        } else {
            System.out.println("Cambio de frecuencia no soportado por este dispositivo.");
        }
    }
}
