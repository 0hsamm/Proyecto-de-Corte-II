package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Tecnologia;

/**
 * DAO para manejar los datos de los productos de tecnología.
 * Permite crear, eliminar, actualizar, mostrar,
 * contar y guardar información en archivos de texto o binarios.
 */
public class TecnologiaDAO implements DAO<Tecnologia> {

    private ArrayList<Tecnologia> listaTecnologia;
    private final String FILE_NAME = "Tecnologia.csv";
    private final String SERIAL_FILE_NAME = "Tecnologia.bin";
    private String content = "";

    /**
     * Constructor que inicializa la lista y carga los datos
     * desde los archivos de texto y binario si existen.
     */
    public TecnologiaDAO() {
        listaTecnologia = new ArrayList<Tecnologia>();
        leerDesdeArchivoDeTexto(FILE_NAME);
        cargarDesdeArchivoSerializado();
    }

    /**
     * Agrega un nuevo producto de tecnología a la lista y actualiza los archivos.
     *
     * @param newData objeto de tipo Tecnologia
     */
    @Override
    public void create(Tecnologia newData) {
        listaTecnologia.add(newData);
        escribirEnArchivoDeTexto();
        escribirEnArchivoSerializado();
    }

    /**
     * Elimina un producto de tecnología por su posición.
     *
     * @param index posición del producto
     * @return true si se eliminó, false si no
     */
    @Override
    public boolean delete(int index) {
        if (index < 0 || index >= listaTecnologia.size()) {
            return false;
        } else {
            listaTecnologia.remove(index);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    /**
     * Actualiza un producto de tecnología en la posición indicada.
     *
     * @param index   posición del producto
     * @param newData objeto con los nuevos datos
     * @return true si se actualizó, false si no
     */
    @Override
    public boolean update(int index, Tecnologia newData) {
        if (index < 0 || index >= listaTecnologia.size()) {
            return false;
        } else {
            listaTecnologia.set(index, newData);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

<<<<<<< HEAD
	@Override
	public String showAll() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < listaTecnologia.size(); i++) {
			sb.append(i + 1);
			sb.append(" - ");
			sb.append(listaTecnologia.get(i).toString());
			sb.append("\n");
		}

		return sb.toString();

	}
=======
    /**
     * Muestra todos los productos de tecnología en formato de texto.
     *
     * @return cadena con la información de todos los productos
     */
    @Override
    public String showAll() {
        content = "";
        for (Tecnologia tecnologia : listaTecnologia) {
            content += tecnologia.toString() + "\n";
        }
        return content;
    }

    /**
     * Devuelve la cantidad de productos de tecnología en la lista.
     *
     * @return número de productos
     */
    @Override
    public int count() {
        return listaTecnologia.size();
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git

    /**
     * Lee los productos desde un archivo CSV y los agrega a la lista.
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
                Tecnologia temp = new Tecnologia();
                temp.setNombre(columna[0]);
                temp.setPrecio(Float.parseFloat(columna[1]));
                temp.setCantidad(Integer.parseInt(columna[2]));
                temp.setSistemaOperativo(columna[3]);
                temp.setConectividad(columna[4]);
                listaTecnologia.add(temp);
            }
        }
    }

    /**
     * Escribe los productos de tecnología en un archivo CSV.
     */
    @Override
    public void escribirEnArchivoDeTexto() {
        StringBuilder sb = new StringBuilder();
        for (Tecnologia tecnologia : listaTecnologia) {
            sb.append(tecnologia.getNombre()).append(";");
            sb.append(tecnologia.getPrecio()).append(";");
            sb.append(tecnologia.getCantidad()).append(";");
            sb.append(tecnologia.getSistemaOperativo()).append(";");
            sb.append(tecnologia.getConectividad()).append(";\n");
        }
        FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
    }

    /**
     * Carga los productos de tecnología desde el archivo binario.
     */
    public void cargarDesdeArchivoSerializado() {
        Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
        if (contenido != null) {
            listaTecnologia = (ArrayList<Tecnologia>) contenido;
        } else {
            listaTecnologia = new ArrayList<>();
        }
    }

    /**
     * Guarda los productos de tecnología en el archivo binario.
     */
    public void escribirEnArchivoSerializado() {
        FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaTecnologia);
    }

    public ArrayList<Tecnologia> getListaTecnologia() {
        return listaTecnologia;
    }

    public void setListaTecnologia(ArrayList<Tecnologia> listaTecnologia) {
        this.listaTecnologia = listaTecnologia;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

<<<<<<< HEAD
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaTecnologia = (ArrayList<Tecnologia>) contenido;
		} else {
			listaTecnologia = new ArrayList<>();
		}
	}

	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaTecnologia);
	}
=======
    public String getFILE_NAME() {
        return FILE_NAME;
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git

<<<<<<< HEAD
	public ArrayList<Tecnologia> getListaTecnologia() {
		return listaTecnologia;
	}

	public void setListaTecnologia(ArrayList<Tecnologia> listaTecnologia) {
		this.listaTecnologia = listaTecnologia;
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

