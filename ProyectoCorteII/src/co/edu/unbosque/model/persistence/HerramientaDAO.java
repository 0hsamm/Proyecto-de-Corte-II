package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Herramienta;

/**
 * Clase que maneja la lista de herramientas.
 * Permite agregar, eliminar, actualizar y mostrar herramientas,
 * además de guardar los datos en archivos de texto y binarios.
 */
public class HerramientaDAO implements DAO<Herramienta> {

    private ArrayList<Herramienta> listaHerramienta;
    private final String FILE_NAME = "Herramienta.csv";
    private final String SERIAL_FILE_NAME = "Herramienta.bin";

    /**
     * Constructor que inicializa la lista de herramientas.
     * También carga los datos desde los archivos de texto y binario.
     */
    public HerramientaDAO() {
        listaHerramienta = new ArrayList<>();
        leerDesdeArchivoDeTexto(FILE_NAME);
        cargarDesdeArchivoSerializado();
    }

    /**
     * Agrega una nueva herramienta a la lista.
     * @param newData herramienta que se desea agregar
     */
    @Override
    public void create(Herramienta newData) {
        listaHerramienta.add(newData);
        escribirEnArchivoDeTexto();
        escribirEnArchivoSerializado();
    }

    /**
     * Elimina una herramienta de la lista según el índice.
     * @param index posición de la herramienta a eliminar
     * @return true si se eliminó, false si no
     */
    @Override
    public boolean delete(int index) {
        if (index < 0 || index >= listaHerramienta.size()) {
            return false;
        } else {
            listaHerramienta.remove(index);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    /**
     * Actualiza una herramienta de la lista según el índice.
     * @param index posición de la herramienta a actualizar
     * @param newData nueva herramienta que reemplaza la anterior
     * @return true si se actualizó, false si no
     */
    @Override
    public boolean update(int index, Herramienta newData) {
        if (index < 0 || index >= listaHerramienta.size()) {
            return false;
        } else {
            listaHerramienta.set(index, newData);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    String content = "";

<<<<<<< HEAD
	@Override
	public String showAll() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < listaHerramienta.size(); i++) {
			sb.append(i + 1);
			sb.append(" - ");
			sb.append(listaHerramienta.get(i).toString());
			sb.append("\n");
		}

		return sb.toString();

	}
=======
    /**
     * Muestra todas las herramientas en forma de texto.
     * @return cadena con la información de cada herramienta
     */
    @Override
    public String showAll() {
        content = "";
        for (Herramienta herramienta : listaHerramienta) {
            content += herramienta.toString() + "\n";
        }
        return content;
    }

    /**
     * Devuelve el número de herramientas que hay en la lista.
     * @return cantidad de herramientas
     */
    @Override
    public int count() {
        return listaHerramienta.size();
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git

    /**
     * Método que lee herramientas desde un archivo de texto CSV
     * y las agrega a la lista.
     * @param url ruta o nombre del archivo
     */
    @Override
    public void leerDesdeArchivoDeTexto(String url) {
        String contenido = FileHandler.leerDesdeArchivoDeTexto(url);
        if (contenido == null || contenido.isBlank()) {
            return;
        } else {
            String[] fila = contenido.split("\n");
            for (String f : fila) {
                String[] columna = f.split(";");
                Herramienta temp = new Herramienta();
                temp.setNombre(columna[0]);
                temp.setPrecio(Float.parseFloat(columna[1]));
                temp.setCantidad(Integer.parseInt(columna[2]));
                temp.setTipoAlimentacion(columna[3]);
                temp.setMaterial(columna[4]);
                listaHerramienta.add(temp);
            }
        }
    }

    /**
     * Escribe la lista de herramientas en un archivo de texto CSV.
     */
    @Override
    public void escribirEnArchivoDeTexto() {
        StringBuilder sb = new StringBuilder();
        for (Herramienta herramienta : listaHerramienta) {
            sb.append(herramienta.getNombre()).append(";");
            sb.append(herramienta.getPrecio()).append(";");
            sb.append(herramienta.getCantidad()).append(";");
            sb.append(herramienta.getTipoAlimentacion()).append(";");
            sb.append(herramienta.getMaterial()).append(";\n");
        }
        FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
    }

    /**
     * Carga la lista de herramientas desde un archivo binario serializado.
     */
    public void cargarDesdeArchivoSerializado() {
        Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
        if (contenido != null) {
            listaHerramienta = (ArrayList<Herramienta>) contenido;
        } else {
            listaHerramienta = new ArrayList<>();
        }
    }

    /**
     * Guarda la lista de herramientas en un archivo binario serializado.
     */
    public void escribirEnArchivoSerializado() {
        FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaHerramienta);
    }

    public ArrayList<Herramienta> getListaHerramienta() {
        return listaHerramienta;
    }

    public void setListaHerramienta(ArrayList<Herramienta> listaHerramienta) {
        this.listaHerramienta = listaHerramienta;
    }

    public String getContent() {
        return content;
    }

<<<<<<< HEAD
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaHerramienta = (ArrayList<Herramienta>) contenido;
		} else {
			listaHerramienta = new ArrayList<>();
		}
	}

	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaHerramienta);
	}
=======
    public void setContent(String content) {
        this.content = content;
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git

    public String getFILE_NAME() {
        return FILE_NAME;
    }

<<<<<<< HEAD
	public void setListaHerramienta(ArrayList<Herramienta> listaHerramienta) {
		this.listaHerramienta = listaHerramienta;
	}

	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIAL_FILE_NAME() {
		return SERIAL_FILE_NAME;
	}

=======
    public String getSERIAL_FILE_NAME() {
        return SERIAL_FILE_NAME;
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git
}

