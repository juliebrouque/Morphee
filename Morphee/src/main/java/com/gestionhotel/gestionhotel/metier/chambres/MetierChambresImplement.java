package com.gestionhotel.gestionhotel.metier.chambres;

import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.gestionhotel.gestionhotel.daochambres.IDaoChambres;
import com.gestionhotel.gestionhotel.entities.Chambres;
import com.gestionhotel.gestionhotel.exception.MyException;
/**
 * 
 * @author inti0298
 *classe: classe qui définit les méthodes de l'interface métier de la classe chambre
 *version: 1.0.0
 *date : 11/07/2016
 */
@Transactional
public class MetierChambresImplement implements IMetierChambres{
	//Attributs
	
			private IDaoChambres dao;
			Logger log=Logger.getLogger("MetierChambresImplement");
			
	
	public void setDao(IDaoChambres dao) {
		log.info("--------DaoChambre injected-------------");
				this.dao = dao;
			}

	@Override
	public Chambres addChambreSachantHotel(Chambres ch, Long idHotel) throws MyException {
		return dao.addChambreSachantHotel(ch, idHotel);
	}

	@Override
	public Chambres deleteChambre(Long idChambre)throws MyException {
		return dao.deleteChambre(idChambre);
	}

	@Override
	public Chambres updateChambre(Chambres ch) {
		return dao.updateChambre(ch);
	}

	@Override
	public List<Chambres> getAllChambres() {
		return dao.getAllChambres();
	}

	@Override
	public Chambres getChambreById(Long idChambre) {
		return dao.getChambreById(idChambre);
	}

	@Override
	public List<Chambres> getchambresDisponibles(Date dateArrivee,
			Date dateSortie) {
		return dao.getchambresDisponibles(dateArrivee, dateSortie);
	}

}
