package bridge;


/**
 *
 * @author tomas
 */

public class Radio implements Dispositivo {
    private boolean encendido = false;
    private int volumen = 10;
    private double frecuencia = 101.1;

    public void encender() {
        encendido = true;
        System.out.println("Radio encendida");
    }

    public void apagar() {
        encendido = false;
        System.out.println("Radio apagada");
    }

    public void aumentarVolumen() {
        volumen++;
        System.out.println("Volumen de Radio: " + volumen);
    }

    public void disminuirVolumen() {
        volumen--;
        System.out.println("Volumen de Radio: " + volumen);
    }

    public void cambiarFrecuencia(double nuevaFrecuencia) {
        frecuencia = nuevaFrecuencia;
        System.out.println("Frecuencia de Radio cambiada a: " + frecuencia);
    }

    public boolean estaEncendido() {
        return encendido;
    }
}
