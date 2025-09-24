package co.edu.unbosque.model.persistence;

import java.util.ArrayList;
import co.edu.unbosque.model.Carrito;
import co.edu.unbosque.model.Producto;

/**
 * Clase que maneja la lista de carritos de compras.
 * Permite agregar, eliminar, actualizar y mostrar carritos,
 * así como añadir productos a carritos específicos.
 */
public class CarritoDAO implements DAO<Carrito> {

    private ArrayList<Carrito> listaCarritos;
    private final String FILE_NAME = "Carrito.csv";
    private final String SERIAL_FILE_NAME = "Carrito.bin";
    private String content = "";

    /**
     * Constructor que inicializa la lista de carritos vacía.
     */
    public CarritoDAO() {
        listaCarritos = new ArrayList<>();
    }

<<<<<<< HEAD
	@Override
	public void create(Carrito newData) {
		listaCarritos.add(newData);
		// escribirEnArchivoDeTexto();
		// escribirEnArchivoSerializado();
=======
    /**
     * Agrega un nuevo carrito a la lista.
     *
     * @param newData objeto de tipo Carrito
     */
    @Override
    public void create(Carrito newData) {
        listaCarritos.add(newData);
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git

    /**
     * Elimina un carrito de la lista según el índice.
     *
     * @param index posición del carrito en la lista
     * @return true si se eliminó, false si no
     */
    @Override
    public boolean delete(int index) {
        if (index < 0 || index >= listaCarritos.size()) {
            return false;
        } else {
            listaCarritos.remove(index);
            return true;
        }
    }

<<<<<<< HEAD
	@Override
	public boolean delete(int index) {
		if (index < 0 || index >= listaCarritos.size()) {
			return false;
		} else {
			listaCarritos.remove(index);
			// escribirEnArchivoDeTexto();
			// escribirEnArchivoSerializado();
			return true;
		}
	}
=======
    /**
     * Actualiza un carrito en la lista.
     *
     * @param index   posición del carrito en la lista
     * @param newData carrito con los nuevos datos
     * @return true si se actualizó, false si no
     */
    @Override
    public boolean update(int index, Carrito newData) {
        if (index < 0 || index >= listaCarritos.size()) {
            return false;
        } else {
            listaCarritos.set(index, newData);
            return true;
        }
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git

<<<<<<< HEAD
	@Override
	public boolean update(int index, Carrito newData) {
		if (index < 0 || index >= listaCarritos.size()) {
			return false;
		} else {
			listaCarritos.set(index, newData);
			// escribirEnArchivoDeTexto();
			// escribirEnArchivoSerializado();
			return true;
		}
	}
=======
    /**
     * Muestra todos los carritos en forma de texto.
     *
     * @return cadena con la información de cada carrito
     */
    @Override
    public String showAll() {
        content = "";
        for (Carrito carrito : listaCarritos) {
            content += carrito.toString() + "\n";
        }
        return content;
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git

<<<<<<< HEAD
	@Override
	public String showAll() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < listaCarritos.size(); i++) {
			sb.append(i + 1);
			sb.append(" - ");
			sb.append(listaCarritos.get(i).toString());
			sb.append("\n");
		}

		return sb.toString();
	}
=======
    /**
     * Devuelve el número de carritos en la lista.
     *
     * @return cantidad de carritos
     */
    @Override
    public int count() {
        return listaCarritos.size();
    }

    /**
     * Método vacío porque no se está leyendo desde archivo de texto.
     *
     * @param url ruta o nombre del archivo
     */
    @Override
    public void leerDesdeArchivoDeTexto(String url) {
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git

    /**
     * Método vacío porque no se está escribiendo en archivo de texto.
     */
    @Override
    public void escribirEnArchivoDeTexto() {
    }

    /**
     * Guarda los carritos en un archivo serializado.
     */
    public void escribirEnArchivoSerializado() {
        FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaCarritos);
    }

<<<<<<< HEAD
	@Override
	public void leerDesdeArchivoDeTexto(String url) {

	}
=======
    /**
     * Añade un producto a un carrito específico.
     *
     * @param indexCarrito índice del carrito en la lista
     * @param p            producto que se quiere añadir
     * @return true si se agregó el producto, false si no
     */
    public boolean añadirProductoAlCarrito(int indexCarrito, Producto p) {
        if (indexCarrito < 0 || indexCarrito >= listaCarritos.size()) {
            return false;
        } else {
            listaCarritos.get(indexCarrito).añadirProducto(p);
            return true;
        }
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git

<<<<<<< HEAD
	@Override
	public void escribirEnArchivoDeTexto() {
=======
    public ArrayList<Carrito> getListaCarritos() {
        return listaCarritos;
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git

<<<<<<< HEAD
	}

	public void escribirEnArchivoSerializado() {
		FileHandler.escribirEnArchivoSerializado(SERIAL_FILE_NAME, listaCarritos);
	}

	public boolean añadirProductoAlCarrito(int indexCarrito, Producto p) {
		if (indexCarrito < 0 || indexCarrito >= listaCarritos.size()) {
			return false;
		} else
			listaCarritos.get(indexCarrito).añadirProducto(p);
		return true;
	}
=======
    public void setListaCarritos(ArrayList<Carrito> listaCarritos) {
        this.listaCarritos = listaCarritos;
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

<<<<<<< HEAD
	public String getFILE_NAME() {
		return FILE_NAME;
	}

	public String getSERIAL_FILE_NAME() {
		return SERIAL_FILE_NAME;
	}

=======
    public String getFILE_NAME() {
        return FILE_NAME;
    }

    public String getSERIAL_FILE_NAME() {
        return SERIAL_FILE_NAME;
    }
>>>>>>> branch 'main' of https://github.com/0hsamm/Proyecto-de-Corte-II.git
}
