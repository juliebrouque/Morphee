<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reservation</title>

<!-- Bootstrap core CSS -->
<link
	href="<%=request.getContextPath()%>/resources/Shield/assets/css/bootstrap.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link
	href="<%=request.getContextPath()%>/resources/Shield/assets/css/main.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/resources/Shield/assets/css/icomoon.css">
<link
	href="<%=request.getContextPath()%>/resources/Shield/assets/css/animate-custom.css"
	rel="stylesheet">



<link
	href='http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Raleway:400,300,700'
	rel='stylesheet' type='text/css'>

<script
	src="<%=request.getContextPath()%>/resources/Shield/assets/js/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/resources/Shield/assets/js/modernizr.custom.js"></script>
</head>
<body>
	<p>
		Pour réserver une chambre <a href="#formulaireSaisonnier">consulter
			d'abord la liste des chambres disponibles</a>
	<div>
		<h4>Remplissez les champs ci-dessous pour ajouter une réservation</h4>
		<f:form modelAttribute="ReservationModel" action="addReservation"
			method="post">

			<table>
				<tr>
					<td>Date d'arrivée</td>
					<td><input type="Date" name="dateArriveeReservation"></td>
					<td><f:errors path="dateArriveeReservation"></f:errors></td>
				</tr>

				<tr>
					<td>Date de sortie</td>
					<td><input type="Date" name="dateSortieReservation"></td>
					<td><f:errors path="dateSortieReservation"></f:errors></td>
				</tr>

				<tr>
					<td>Identifiant du client</td>
					<td><input type="number" name="idClient"></td>
					<td><f:errors path="idClient"></f:errors></td>
				</tr>

				<tr>
					<td>Identifiant de la chambre</td>
					<td><input type="number" name="idChambre"></td>
					<td><f:errors path="idChambre"></f:errors></td>
				</tr>

			</table>
			<button class="btn btn-primary">Enregistrer la réservation</button>

		</f:form>

	</div>

	<p class="Exception">${ReservationModel.exceptionReservationDispo}</p>

	<f:form modelAttribute="AfficherReservationModel"
		action="getReservationById" method="post">
		<label>Rechercher une réservation à partir de son identifiant</label>
		<input type="number" name="idReservation">
		<button type="submit" class="btn btn-primary">Rechercher</button>
		<f:errors path="idReservation"></f:errors>
		</td>
		<c:if test="${not empty AfficherReservationModel.reservation}">
			<table class="table">
				<tr>
					<th>Identifiant</th>
					<th>Date d'arrivée</th>
					<th>Date de sortie</th>
					<th>Identifiant du client</th>
					<th>Identifiant de la chambre</th>
				</tr>

				<tr>
					<td>${AfficherReservationModel.reservation.idReservation}</td>
					<td>${AfficherReservationModel.reservation.dateArrivee}</td>
					<td>$AfficherReservationModel.reservation.dateSortie}</td>
					<td>${AfficherReservationModel.reservation.personne.idPersonnes}</td>
					<td>${AfficherReservationModel.reservation.chambre.idChambre}</td>
				</tr>


			</table>
		</c:if>
		<p class="Exception">${AfficherReservationModel.exceptionReservationById}</p>
	</f:form>


	<f:form modelAttribute="ReservationModel" action="getReservations"
		method="post">
		<c:if test="${not empty ReservationModel.tabReservationExist}">
			<table class="table">
				<tr>
					<th>Identifiant</th>
					<th>Date d'arrivée</th>
					<th>Date de sortie</th>
					<th>Identifiant du client</th>
					<th>Identifiant de la chambre</th>
				</tr>
				<c:forEach items="${ReservationModel.tabReservationExist}" var="cl">
					<tr>

						<td>${cl.idReservation}</td>
						<td>${cl.dateArrivee}</td>
						<td>${cl.dateSortie}</td>
						<td>${cl.personne.idPersonnes}</td>
						<td>${cl.chambre.idChambre}</td>
					</tr>

				</c:forEach>
			</table>
		</c:if>
		<button class="btn btn-primary">Afficher la liste des
			reservations existantes</button>

	</f:form>

	<f:form modelAttribute="AfficherReservationParClientModel"
		action="getReservationByClient" method="post">
		<label>Renseigner l'identifiant d'un client</label>
		<input type="number" name="idClient">
		<td><c:if
				test="${not empty AfficherReservationParClientModel.tabReservationClient}">
				<table class="table">
					<tr>
						<th>Identifiant</th>
						<th>Date d'arrivée</th>
						<th>Date de sortie</th>
						<th>Identifiant du client</th>
						<th>Identifiant de la chambre</th>
					</tr>
					<c:forEach
						items="${AfficherReservationParClientModel.tabReservationClient}"
						var="cl">
						<tr>

							<td>${cl.idReservation}</td>
							<td>${cl.dateArrivee}</td>
							<td>${cl.dateSortie}</td>
							<td>${cl.personne.idPersonnes}</td>
							<td>${cl.chambre.idChambre}</td>
						</tr>

					</c:forEach>
				</table>
			</c:if>
			<button class="btn btn-primary">Afficher la liste des
				reservations d'un client</button> <f:errors path="idClient"></f:errors></td>
		<p class="Exception">${AfficherReservationParClientModel.exceptionReservationClient}</p>
	</f:form>


	<f:form modelAttribute="AfficherReservatinParChambreModel"
		action="getReservationByChambre" method="post">
		<label>Renseigner l'identifiant d'une chambre</label>
		<input type="number" name="idChambre">

		<c:if
			test="${not empty AfficherReservatinParChambreModel.tabRerservationChambre}">
			<table class="table">
				<tr>
					<th>Identifiant</th>
					<th>Date d'arrivée</th>
					<th>Date de sortie</th>
					<th>Identifiant du client</th>
					<th>Identifiant de la chambre</th>
				</tr>
				<c:forEach
					items="${AfficherReservatinParChambreModel.tabRerservationChambre}"
					var="cl">
					<tr>

						<td>${cl.idReservation}</td>
						<td>${cl.dateArrivee}</td>
						<td>${cl.dateSortie}</td>
						<td>${cl.personne.idPersonnes}</td>
						<td>${cl.chambre.idChambre}</td>
					</tr>

				</c:forEach>
			</table>
		</c:if>
		<button class="btn btn-primary">Afficher la liste des
			reservations d'une chambre</button>
		<f:errors path="idChambre"></f:errors>
		</td>
		<p class="Exception">${AfficherReservatinParChambreModel.exceptionReservationChambre}</p>
	</f:form>


	<f:form modelAttribute="CouReservationbyIdModel"
		action="getcoutReservationById" method="post">
		<label>Vérifier le coût d'une réservation</label>
		<input type="number" name="idReservation">
		<button type="submit" class="btn btn-primary">Rechercher</button>
		<f:errors path="idReservation"></f:errors>
		</td>
		<c:if test="${CouReservationbyIdModel.coutResById!=0}">
			<c:if test="${not empty CouReservationbyIdModel.coutResById}">
				<p>Le cout de la réservation est de
					${CouReservationbyIdModel.coutResById} euros</p>
			</c:if>
		</c:if>
		<p class="Exception">${CouReservationbyIdModel.exceptionReservationCoutId}</p>
	</f:form>

	<f:form modelAttribute="ReservationModel" action="getcoutReservations"
		method="post">
		<button type="submit" class="btn btn-primary">Afficher le
			coût des réservations</button>
		<c:if test="${ReservationModel.coutRes!=0}">
			<c:if test="${not empty ReservationModel.coutRes}">
				<p>Le cout des réservations est de ${ReservationModel.coutRes}
					euros</p>
			</c:if>
		</c:if>
	</f:form>


	<f:form modelAttribute="SupReservationModel" action="deleteReservation">
		<select name="idReservation">
			<option value="">Selectionner une réservation</option>
			<c:forEach items="${TabReservationModel.tabReservationIndex}" var="e">
				<option value="${e.idReservation}">${e.idReservation}</option>
			</c:forEach>
		</select>
		<f:errors path="idReservation"></f:errors>
		<button type="submit" class="btn btn-primary">Supprimer</button>
	</f:form>

	<div>
		<h4>Remplissez les champs pour ajouter une consommation à une
			réservation</h4>

		<f:form modelAttribute="ConsommationModel"
			action="addConsommationReservation" method="post">
			<select name="idReservation">
				<option value="">Selectionner une réservation</option>
				<c:forEach items="${TabReservationModel.tabReservationIndex}" var="e">
					<option value="${e.idReservation}">${e.idReservation}</option>
				</c:forEach>
			</select>
			<f:errors path="idReservation"></f:errors>
			</td>

			<select name="idProduit">
				<option value="">Selectionner un produit</option>
				<c:forEach items="${TabReservationModel.tabProduitCons}" var="e">
					<option value="${e.idProduit}">${e.nomProduit}</option>
				</c:forEach>
			</select>
			<f:errors path="idProduit"></f:errors>
			</td>
			<input type="number" name="quantiteConsomee">
			<f:errors path="quantiteConsomee"></f:errors>
			</td>

			<button type="submit" class="btn btn-primary">Ajouter la
				réservation à la facture</button>
		</f:form>
	</div>

</body>
</html>