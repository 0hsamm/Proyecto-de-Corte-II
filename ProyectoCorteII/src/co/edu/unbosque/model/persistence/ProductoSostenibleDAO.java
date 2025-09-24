package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.ProductoSostenible;

/**
 * DAO para manejar los datos de los productos sostenibles.
 * Permite crear, eliminar, actualizar, mostrar,
 * contar y guardar información en archivos de texto o binarios.
 */
public class ProductoSostenibleDAO implements DAO<ProductoSostenible> {

    private ArrayList<ProductoSostenible> listaProductoSostenible;
    private final String FILE_NAME = "ProductoSostenible.csv";
    private final String SERIAL_FILE_NAME = "ProductoSostenible.bin";
    private String content = "";

    /**
     * Constructor que inicializa la lista y carga los datos
     * desde los archivos de texto y binario si existen.
     */
    public ProductoSostenibleDAO() {
        listaProductoSostenible = new ArrayList<ProductoSostenible>();
        leerDesdeArchivoDeTexto(FILE_NAME);
        cargarDesdeArchivoSerializado();
    }

    /**
     * Agrega un nuevo producto sostenible a la lista y actualiza los archivos.
     *
     * @param newData objeto de tipo ProductoSostenible
     */
    @Override
    public void create(ProductoSostenible newData) {
        listaProductoSostenible.add(newData);
        escribirEnArchivoDeTexto();
        escribirEnArchivoSerializado();
    }

    /**
     * Elimina un producto sostenible por su posición.
     *
     * @param index posición del producto
     * @return true si se eliminó, false si no
     */
    @Override
    public boolean delete(int index) {
        if (index < 0 || index >= listaProductoSostenible.size()) {
            return false;
        } else {
            listaProductoSostenible.remove(index);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

    /**
     * Actualiza un producto sostenible en la posición indicada.
     *
     * @param index   posición del producto
     * @param newData objeto con los nuevos datos
     * @return true si se actualizó, false si no
     */
    @Override
    public boolean update(int index, ProductoSostenible newData) {
        if (index < 0 || index >= listaProductoSostenible.size()) {
            return false;
        } else {
            listaProductoSostenible.set(index, newData);
            escribirEnArchivoDeTexto();
            escribirEnArchivoSerializado();
            return true;
        }
    }

<<<<<<< HEAD
	@Override
	public String showAll() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < listaProductoSostenible.size(); i++) {
			sb.append(i + 1);
			sb.append(" - ");
			sb.append(listaProductoSostenible.get(i).toString());
			sb.append("\n");
		}

		return sb.toString();
	}
=======
    /**
     * Muestra todos los productos sostenibles en formato de texto.
     *
     * @return cadena con la información de todos los productos
     */
    @Override
    public String showAll() {
        content = "";
        for (ProductoSostenible productoSostenible : listaProductoSostenible) {
            content += productoSostenible.toString() + "\n";
        }
        return content;
    }

    /**
     * Devuelve la cantidad de productos sostenibles en la lista.
     *
     * @return número de productos
     */
    @Override
    public int count() {
        return listaProductoSostenible.size();
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
                ProductoSostenible temp = new ProductoSostenible();
                temp.setNombre(columna[0]);
                temp.setPrecio(Float.parseFloat(columna[1]));
                temp.setCantidad(Integer.parseInt(columna[2]));
                temp.setCertificacion(columna[3]);
                temp.setMaterialEcologico(columna[4]);
                listaProductoSostenible.add(temp);
            }
        }
    }

    /**
     * Escribe los productos sostenibles en un archivo CSV.
     */
    @Override
    public void escribirEnArchivoDeTexto() {
        StringBuilder sb = new StringBuilder();
        for (ProductoSostenible productoSostenible : listaProductoSostenible) {
            sb.append(productoSostenible.getNombre()).append(";");
            sb.append(productoSostenible.getPrecio()).append(";");
            sb.append(productoSostenible.getCantidad()).append(";");
            sb.append(productoSostenible.getCertificacion()).append(";");
            sb.append(productoSostenible.getMaterialEcologico()).append(";\n");
        }
        FileHandler.escribirEnArchivoDeTexto(FILE_NAME, sb.toString());
    }

    /**
     * Carga los productos sostenibles desde el archivo binario.
     */
    public void cargarDesdeArchivoSerializado() {
        Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
        if (contenido != null) {
            listaProductoSostenible = (ArrayList<ProductoSostenible>) contenido;
        } else {
            listaProductoSostenible = new ArrayList<>();
        }
    }

    /**
     * Guarda los productos sostenibles en el archivo binario.
     */
    public void escribirEnArchivoSerializado() {
        FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaProductoSostenible);
    }

    public ArrayList<ProductoSostenible> getListaProductoSostenible() {
        return listaProductoSostenible;
    }

    public void setListaProductoSostenible(ArrayList<ProductoSostenible> listaProductoSostenible) {
        this.listaProductoSostenible = listaProductoSostenible;
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
	public void cargarDesdeArchivoSerializado() {
		Object contenido = FileHandler.leerDesdeArchivoSerializado(SERIAL_FILE_NAME);
		if (contenido != null) {
			listaProductoSostenible = (ArrayList<ProductoSostenible>) contenido;
		} else {
			listaProductoSostenible = new ArrayList<>();
		}
	}

	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaProductoSostenible);
	}

	public ArrayList<ProductoSostenible> getListaProductoSostenible() {
		return listaProductoSostenible;
	}

	public void setListaProductoSostenible(ArrayList<ProductoSostenible> listaProductoSostenible) {
		this.listaProductoSostenible = listaProductoSostenible;
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
