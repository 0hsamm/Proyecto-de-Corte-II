package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.AveDAO;
import co.edu.unbosque.model.persistence.GatoDAO;
import co.edu.unbosque.model.persistence.PerroDAO;
import co.edu.unbosque.model.persistence.PezDAO;
import co.edu.unbosque.model.persistence.ReptilDAO;

public class ModelFacade {

	private PerroDAO perroDao;
	private GatoDAO gatoDao;
	private AveDAO aveDao;
	private PezDAO pezDao;
	private ReptilDAO  reptilDao;
	
	
	public ModelFacade() {
		perroDao= new PerroDAO();
		gatoDao = new GatoDAO();
		aveDao = new AveDAO();
		pezDao = new PezDAO();
		reptilDao = new ReptilDAO();
	}

	public PerroDAO getPerroDao() {
		return perroDao;
	}

	public void setPerroDao(PerroDAO perroDao) {
		this.perroDao = perroDao;
	}

	public GatoDAO getGatoDao() {
		return gatoDao;
	}

	public void setGatoDao(GatoDAO gatoDao) {
		this.gatoDao = gatoDao;
	}

	public AveDAO getAveDao() {
		return aveDao;
	}

	public void setAveDao(AveDAO aveDao) {
		this.aveDao = aveDao;
	}

	public PezDAO getPezDao() {
		return pezDao;
	}

	public void setPezDao(PezDAO pezDao) {
		this.pezDao = pezDao;
	}

	public ReptilDAO getReptilDao() {
		return reptilDao;
	}

	public void setReptilDao(ReptilDAO reptilDao) {
		this.reptilDao = reptilDao;
	}
	
	
	
}
