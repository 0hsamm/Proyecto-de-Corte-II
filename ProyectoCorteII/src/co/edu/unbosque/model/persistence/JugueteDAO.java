package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Juguete;

/**
 * DAO para manejar los datos de los juguetes.
 * Permite crear, eliminar, actualizar, mostrar,
 * contar y guardar información en archivos de texto o binarios.
 */
public class JugueteDAO implements DAO<Juguete> {

    private ArrayList<Juguete> listaJuguete;
    private final String FILE_NAME = "Juguete.csv";
    private final String SERIAL_FILE_NAME = "Juguete.bin";
    private String content = "";

    /**
     * Constructor que inicializa la lista y carga los datos
     * desde los archivos de texto y binario si existen.
     */
    public JugueteDAO() {
        listaJuguete = new ArrayList<Juguete>();
        leerDesdeArchivoDeTexto(FILE_NAME);
        cargarDesdeArchivoSerializado();
    }

    /**
     * Agrega un nuevo juguete a la lista y actualiza los archivos.
     *
     * @param newData objeto de tipo Juguete
     */
    @Override
    public void create(Juguete newData) {
        listaJuguete.add(newData);
        escribirEnArchivoDeTexto();
        escribirEnArchivoSerializado();
    }

    /**
     * Elimina un juguete por su posición.
     *
     * @param index posición del juguete
     * @return true si se eliminó, false si no
     */
    @Override
    public boolean delete(int index) {
        if (index < 0 || index >= listaJuguete.size()) {
            return false;
        } else {
            listaJuguete.remove(index);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    /**
     * Actualiza un juguete en la posición indicada.
     *
     * @param index   posición del juguete
     * @param newData objeto con los nuevos datos
     * @return true si se actualizó, false si no
     */
    @Override
    public boolean update(int index, Juguete newData) {
        if (index < 0 || index >= listaJuguete.size()) {
            return false;
        } else {
            listaJuguete.set(index, newData);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

<<<<<<< HEAD
	@Override
	public String showAll() {
		StringBuilder sb = new StringBuilder();
=======
    /**
     * Muestra todos los juguetes en formato de texto.
     *
     * @return cadena con la información de todos los juguetes
     */
    @Override
    public String showAll() {
        content = "";
        for (Juguete juguete : listaJuguete) {
            content += juguete.toString() + "\n";
        }
        return content;
    }

    /**
     * Devuelve la cantidad de juguetes en la lista.
     *
     * @return número de juguetes
     */
    @Override
    public int count() {
        return listaJuguete.size();
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git

<<<<<<< HEAD
		for (int i = 0; i < listaJuguete.size(); i++) {
			sb.append(i + 1);
			sb.append(" - ");
			sb.append(listaJuguete.get(i).toString());
			sb.append("\n");
		}

		return sb.toString();
	}
=======
    /**
     * Lee los datos desde un archivo CSV y los agrega a la lista.
     *
     * @param url nombre o ruta del archivo
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
                Juguete temp = new Juguete();
                temp.setNombre(columna[0]);
                temp.setPrecio(Float.parseFloat(columna[1]));
                temp.setCantidad(Integer.parseInt(columna[2]));
                temp.setEdadRecomendada(columna[3]);
                temp.setMaterial(columna[4]);
                listaJuguete.add(temp);
            }
        }
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git

    /**
     * Escribe los datos en un archivo CSV.
     */
    @Override
    public void escribirEnArchivoDeTexto() {
        StringBuilder sb = new StringBuilder();
        for (Juguete juguete : listaJuguete) {
            sb.append(juguete.getNombre()).append(";");
            sb.append(juguete.getPrecio()).append(";");
            sb.append(juguete.getCantidad()).append(";");
            sb.append(juguete.getEdadRecomendada()).append(";");
            sb.append(juguete.getMaterial()).append(";\n");
        }
        FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
    }

    /**
     * Carga los datos desde un archivo binario.
     */
    public void cargarDesdeArchivoSerializado() {
        Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
        if (contenido != null) {
            listaJuguete = (ArrayList<Juguete>) contenido;
        } else {
            listaJuguete = new ArrayList<>();
        }
    }

    /**
     * Guarda los datos en un archivo binario.
     */
    public void escribirEnArchivoSerializado() {
        FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaJuguete);
    }

    public ArrayList<Juguete> getListaJuguete() {
        return listaJuguete;
    }

    public void setListaJuguete(ArrayList<Juguete> listaJuguete) {
        this.listaJuguete = listaJuguete;
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

<<<<<<< HEAD
	@Override
	public void escribirEnArchivoDeTexto() {
		StringBuilder sb = new StringBuilder();
		for (Juguete juguete : listaJuguete) {
			sb.append(juguete.getNombre() + ";");
			sb.append(juguete.getPrecio() + ";");
			sb.append(juguete.getCantidad() + ";");
			sb.append(juguete.getEdadRecomendada() + ";");
			sb.append(juguete.getMaterial() + ";");
			sb.append("\n");
		}
		FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());

	}

	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaJuguete = (ArrayList<Juguete>) contenido;
		} else {
			listaJuguete = new ArrayList<>();
		}
	}

	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaJuguete);
	}

	public ArrayList<Juguete> getListaJuguete() {
		return listaJuguete;
	}

	public void setListaJuguete(ArrayList<Juguete> listaJuguete) {
		this.listaJuguete = listaJuguete;
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
