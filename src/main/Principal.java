package main;


/**
 *
 * @author tomas
 */

import bridge.Dispositivo;
import bridge.Radio;
import bridge.Television;
import control.ControlRemotoAvanzado;
import control.ControlRemotoSimple;

public class Principal {
    public static void main(String[] args) {
        
        // Creamos los dispositivos (implementaciones)
        Dispositivo tv = new Television();
        Dispositivo radio = new Radio();

        // Creamos los controles remotos (abstracciones)
        ControlRemotoSimple controlSimpleTv = new ControlRemotoSimple(tv);
        ControlRemotoAvanzado controlAvanzadoTv = new ControlRemotoAvanzado(tv);

        ControlRemotoSimple controlSimpleRadio = new ControlRemotoSimple(radio);
        ControlRemotoAvanzado controlAvanzadoRadio = new ControlRemotoAvanzado(radio);

        // Usamos la TV con el control remoto simple
        System.out.println("Controlando la TV con Control Simple:");
        controlSimpleTv.encender();
        controlSimpleTv.aumentarVolumen();
        controlSimpleTv.disminuirVolumen();
        controlSimpleTv.apagar();
  

        // Usamos la TV con el control remoto avanzado
        System.out.println("\nControlando la TV con Control Avanzado:");
        controlAvanzadoTv.encender();
        controlAvanzadoTv.aumentarVolumen();
        controlAvanzadoTv.cambiarCanal(5);
        controlAvanzadoTv.apagar();

        // Usamos la Radio con un control remoto simple
        System.out.println("\nControlando la Radio con Control Simple:");
        controlSimpleRadio.encender();
        controlSimpleRadio.aumentarVolumen();
        controlSimpleRadio.disminuirVolumen();
        controlSimpleRadio.apagar();

        // Usamos la Radio con un control remoto avanzado
        System.out.println("\nControlando la Radio con Control Avanzado:");
        controlAvanzadoRadio.encender();
        controlAvanzadoRadio.cambiarFrecuencia(98.7);
        controlAvanzadoRadio.aumentarVolumen();
        controlAvanzadoRadio.aumentarVolumen();
        controlAvanzadoRadio.aumentarVolumen();
    }
}

