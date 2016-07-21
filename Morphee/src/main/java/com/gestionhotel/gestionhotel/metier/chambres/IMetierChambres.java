package com.gestionhotel.gestionhotel.metier.chambres;

import java.util.Date;
import java.util.List;

import com.gestionhotel.gestionhotel.entities.Chambres;
import com.gestionhotel.gestionhotel.exception.MyException;
/**
 * 
 * @author inti0298
 *classe: interface de la classe chambre
 *version:1.0.0
 *date: 11/07/2016
 */
public interface IMetierChambres {
	public Chambres addChambreSachantHotel(Chambres ch, Long idHotel)throws MyException;
	public Chambres deleteChambre(Long idChambre)throws MyException;
	public Chambres updateChambre (Chambres ch);
	public List<Chambres>getAllChambres();
	public Chambres getChambreById(Long idChambre);
	public List<Chambres> getchambresDisponibles(Date dateArrivee, Date dateSortie);
}
