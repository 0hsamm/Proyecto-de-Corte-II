package co.edu.unbosque.controller;

/**
 * Clase que arranca la app.
 * Crea un Controller y corre la parte de la GUI.
 */
public class AplMain {

   /**
    * Método que se ejecuta al iniciar el programa.
    * Hace un Controller y llama a runGUI() para mostrar la ventana.
    * @param args
    */
    public static void main(String[] args) {
        Controller c = new Controller();
        c.runGUI();
    }

}
