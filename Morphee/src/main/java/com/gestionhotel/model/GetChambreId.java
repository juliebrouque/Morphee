package com.gestionhotel.model;

import javax.validation.constraints.NotNull;

public class GetChambreId {
	/*-----------attributs-----*/
@NotNull(message="Sélectionner l'id Chambre")
	private Long idChambre;
/*-------------getters et setters---------*/

public Long getIdChambre() {
	return idChambre;
}

public void setIdChambre(Long idChambre) {
	this.idChambre = idChambre;
}

}
