package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Electrodomestico;

/**
 * DAO para manejar los datos de los electrodomésticos.
 * Permite crear, eliminar, actualizar, mostrar,
 * contar y guardar información en archivos de texto o binarios.
 */
public class ElectrodomesticoDAO implements DAO<Electrodomestico> {

    private ArrayList<Electrodomestico> listaElectrodomestico;
    private final String FILE_NAME = "Electrodomesticos.csv";
    private final String SERIAL_FILE_NAME = "Electrodomesticos.bin";
    private String content = "";

    /**
     * Constructor que inicializa la lista y carga los datos
     * desde los archivos de texto y binario si existen.
     */
    public ElectrodomesticoDAO() {
        listaElectrodomestico = new ArrayList<>();
        leerDesdeArchivoDeTexto(FILE_NAME);
        cargarDesdeArchivoSerializado();
    }

    @Override
    public void create(Electrodomestico newData) {
        listaElectrodomestico.add(newData);
        escribirEnArchivoDeTexto();
        escribirEnArchivoSerializado();
    }

    @Override
    public boolean delete(int index) {
        if (index < 0 || index >= listaElectrodomestico.size()) {
            return false;
        } else {
            listaElectrodomestico.remove(index);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    @Override
    public boolean update(int index, Electrodomestico newData) {
        if (index < 0 || index >= listaElectrodomestico.size()) {
            return false;
        } else {
            listaElectrodomestico.set(index, newData);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    @Override
    public String showAll() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listaElectrodomestico.size(); i++) {
            sb.append(i + 1)
              .append(" - ")
              .append(listaElectrodomestico.get(i).toString())
              .append("\n");
        }
        return sb.toString();
    }

    @Override
    public int count() {
        return listaElectrodomestico.size();
    }

    @Override
    public void leerDesdeArchivoDeTexto(String url) {
        String contenido = FileHandler.leerDesdeArchivoDeTexto(url);
        if (contenido == null || contenido.isBlank()) {
            return;
        }
        String[] fila = contenido.split("\n");
        for (String f : fila) {
            String[] columna = f.split(";");
            Electrodomestico temp = new Electrodomestico();
            temp.setNombre(columna[0]);
            temp.setPrecio(Float.parseFloat(columna[1]));
            temp.setCantidad(Integer.parseInt(columna[2]));
            temp.setConsumoEnergia(columna[3]);
            temp.setCapacidad(columna[4]);
            listaElectrodomestico.add(temp);
        }
    }

    @Override
    public void escribirEnArchivoDeTexto() {
        StringBuilder sb = new StringBuilder();
        for (Electrodomestico electrodomestico : listaElectrodomestico) {
            sb.append(electrodomestico.getNombre()).append(";")
              .append(electrodomestico.getPrecio()).append(";")
              .append(electrodomestico.getCantidad()).append(";")
              .append(electrodomestico.getConsumoEnergia()).append(";")
              .append(electrodomestico.getCapacidad()).append(";\n");
        }
        FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
    }

    public void cargarDesdeArchivoSerializado() {
        Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
        if (contenido != null) {
            listaElectrodomestico = (ArrayList<Electrodomestico>) contenido;
        } else {
            listaElectrodomestico = new ArrayList<>();
        }
    }

    public void escribirEnArchivoSerializado() {
        FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaElectrodomestico);
    }

    public ArrayList<Electrodomestico> getListaElectrodomestico() {
        return listaElectrodomestico;
    }

    public void setListaElectrodomestico(ArrayList<Electrodomestico> listaElectrodomestico) {
        this.listaElectrodomestico = listaElectrodomestico;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFILE_NAME() {
        return FILE_NAME;
    }

    public String getSERIAL_FILE_NAME() {
        return SERIAL_FILE_NAME;
    }
}
