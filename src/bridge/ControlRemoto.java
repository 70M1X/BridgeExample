package bridge;


/**
 *
 * @author tomas
 */
public abstract class ControlRemoto {
    protected Dispositivo dispositivo;

    public ControlRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract void encender();
    public abstract void apagar();
    public abstract void aumentarVolumen();
    public abstract void disminuirVolumen();
}