/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge;


public interface Dispositivo {
    void encender();
    void apagar();
    void aumentarVolumen();
    void disminuirVolumen();
    boolean estaEncendido();
}