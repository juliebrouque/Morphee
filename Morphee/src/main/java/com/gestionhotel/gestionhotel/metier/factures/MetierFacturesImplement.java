package com.gestionhotel.gestionhotel.metier.factures;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.gestionhotel.gestionhotel.dao.factures.IDaoFactures;
import com.gestionhotel.gestionhotel.entities.Factures;

/*
 * Projet: Morphee
 * Classe: MétierFacturesImplement
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
@Transactional
public class MetierFacturesImplement implements IMetierFactures{

	//Attributs
	
	private IDaoFactures dao;
	Logger log=Logger.getLogger("MetierFacturesImplement");
	
	//Set
	
	public void setDao(IDaoFactures dao) {
		this.dao = dao;
		log.info("<-----------DaoFactures injected---------->");
	}
	
	@Override
	public Factures addFactures(Factures f) {
		// TODO Auto-generated method stub
		return dao.addFactures(f);
	}

	

	@Override
	public void addReservationFacture(Long idReservation, Long idFacture) {
		dao.addReservationFacture(idReservation, idFacture);
		
	}

	@Override
	public List<Factures> getFactures(Long idClient) {
		// TODO Auto-generated method stub
		return dao.getFactures(idClient);
	}

	@Override
	public double getCoutAnnuelClient(int Année, Long idClient) {
		// TODO Auto-generated method stub
		return dao.getCoutAnnuelClient(Année, idClient);
	}

	@Override
	public double getCoutSemestrielClient(Date dateDebut, Date dateFin,
			Long idClient) {
		// TODO Auto-generated method stub
		return dao.getCoutSemestrielClient(dateDebut, dateFin, idClient);
	}

	@Override
	public Factures getFacture(Long idFacture) {
		// TODO Auto-generated method stub
		return dao.getFacture(idFacture);
	}

}
