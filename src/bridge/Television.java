package bridge;


/**
 *
 * @author tomas
 */

public class Television implements Dispositivo {
    private boolean encendido = false;
    private int volumen = 10;
    private int canal = 1;

    public void encender() {
        encendido = true;
        System.out.println("Televisión encendida");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Televisión apagada");
    }

    public void aumentarVolumen() {
        volumen++;
        System.out.println("Volumen de Televisión: " + volumen);
    }

    public void disminuirVolumen() {
        volumen--;
        System.out.println("Volumen de Televisión: " + volumen);
    }

    public void cambiarCanal(int nuevoCanal) {
        canal = nuevoCanal;
        System.out.println("Canal de Televisión cambiado a: " + canal);
    }

    public boolean estaEncendido() {
        return encendido;
    }
}
