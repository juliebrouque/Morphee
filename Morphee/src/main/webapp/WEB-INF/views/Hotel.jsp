<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hotel</title>

<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/Shield/style.css">

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

	<div id="navbar-main">
		<!-- Fixed navbar -->
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="icon icon-shield"
							style="font-size: 30px; color: #3498db;"></span>
					</button>
					<a class="navbar-brand hidden-xs hidden-sm" href="#home"><span
						class="icon icon-shield" style="font-size: 18px; color: #3498db;"></span></a>
				</div>
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li><a href="#Hotels" class="smoothScroll">Hotels</a></li>
						<li><a href="#Reservations" class="smoothScroll">
								Reservations</a></li>
						<li><a href="#Chambres" class="smoothScroll"> Services</a></li>
						<li><a href="#Factures" class="smoothScroll"> Chambres</a></li>
						<li><a href="#Produits" class="smoothScroll"> Produits</a></li>
						<li><a href="#Personnes" class="smoothScroll"> Personnes</a></li>
				</div>
				<!--/.nav-collapse -->
			</div>
		</div>
	</div>

	<div id="headerwrap" id="home">
		<header class="clearfix">
		<h1>
			<span class="icon icon-shield"></span>
		</h1>
		<p>Hotel</p>
		<p>Ibis - Ritz - Campanile</p>
		</header>
	</div>
	<!-- /headerwrap -->
	<br />
	<br />

	<h4>Consulter les informations d'un hotel :</h4>

	<div>
		<form action="getHotel">
			<h3>Selectionner un hotel</h3>
			<select name="idHotel" id="variable">
				<option value="0">Selectionner</option>
				<option value="1">Ibis</option>
				<option value="2">Ritz</option>
				<option value="3">Campanile</option>
			</select> &nbsp; &nbsp; &nbsp;
			<button class="btn btn-primary">Consulter les infos de
				l'hotel</button>
			<p></p>
			<!-- <span class="Exception" id="error1"></span> -->
		</form>
	</div>
	<br />
	<br />
	
	
	<c:if test="${not empty HotelModel.tabHotel}">
	<section class="section-divider textdivider divider6">
			<div class="container">
		<h4>Les attributs de l'hotel selectionné sont donnés dans le
			tableau suivant :</h4>
		<div>
			<table class="table2">
				<tr>
					<th>Identifiant</th>
					<th>Nom</th>
					<th>Classe</th>
					<th>Adresse</th>
					<th>Code postal</th>
					<th>Pays</th>
					<th>Numéro de téléphone</th>
					<th>Numéro de fax</th>
					<th>Adresse mail</th>
				</tr>
				<c:forEach items="${HotelModel.tabHotel}" var="x">
					<tr>
						<td><c:out value="${x.idHotel}"></c:out></td>
						<td><c:out value="${x.nomHotel}"></c:out></td>
						<td><c:out value="${x.classeHotel}"></c:out></td>
						<td><c:out value="${x.adresseHotel}"></c:out></td>
						<td><c:out value="${x.codePostal}"></c:out></td>
						<td><c:out value="${x.pays}"></c:out></td>
						<td><c:out value="${x.numTel}"></c:out></td>
						<td><c:out value="${x.numFax}"></c:out></td>
						<td><c:out value="${x.adresseMail}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
		</div>
		</div>
	</section>
	</c:if>
	
	
	<br />
	<br />


	<c:if test="${not empty HotelModel.tabEmployeHotelCdi}">
		<h4>Les employés en CDI (contractuels) de l'hotel selectionné
			sont donnés dans le tableau suivant :</h4>
		<div>
			<table class="table1">
				<tr>
					<th>Identifiant</th>
					<th>Nom</th>
					<th>Prenom</th>
					<th>Date de naissance</th>
					<th>Adresse</th>
					<th>Adresse mail</th>
					<th>Numéro de téléphone</th>
					<th>Date d'entrée</th>
					<th>Salaire</th>
					<th>Prime</th>
				</tr>
				<c:forEach items="${HotelModel.tabEmployeHotelCdi}" var="x">
					<tr>
						<td><c:out value="${x.idPersonnes}"></c:out></td>
						<td><c:out value="${x.nomPersonne}"></c:out></td>
						<td><c:out value="${x.prenomPersonne}"></c:out></td>
						<td><c:out value="${x.dateDeNaissance}"></c:out></td>
						<td><c:out value="${x.adressePersonne}"></c:out></td>
						<td><c:out value="${x.adresseMailPersonne}"></c:out></td>
						<td><c:out value="${x.numTelPersonnne}"></c:out></td>
						<td><c:out value="${x.dateEntrePersonne}"></c:out></td>
						<td><c:out value="${x.salaire}"></c:out></td>
						<td><c:out value="${x.prime}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
	</c:if>
	<p class="Exception">${HotelModel.exceptionEmployeCdi}</p>
	</div>
	<br />
	<br />

	<c:if test="${not empty HotelModel.tabEmployeHotelCdd}">
		<h4>Les employés en CDD (saisonniers) de l'hotel selectionné sont
			donnés dans le tableau suivant :</h4>
		<div>
			<table class="table1">
				<tr>
					<th>Identifiant</th>
					<th>Nom</th>
					<th>Prenom</th>
					<th>Adresse</th>
					<th>Adresse mail</th>
					<th>Numéro de téléphone</th>
					<th>Adresse mail</th>
					<th>Date d'entrée</th>
					<th>Salaire</th>
					<th>Date de sortie</th>
				</tr>
				<c:forEach items="${HotelModel.tabEmployeHotelCdd}" var="x">
					<tr>
						<td><c:out value="${x.idPersonnes}"></c:out></td>
						<td><c:out value="${x.nomPersonne}"></c:out></td>
						<td><c:out value="${x.prenomPersonne}"></c:out></td>
						<td><c:out value="${x.dateDeNaissance}"></c:out></td>
						<td><c:out value="${x.adressePersonne}"></c:out></td>
						<td><c:out value="${x.adresseMailPersonne}"></c:out></td>
						<td><c:out value="${x.numTelPersonnne}"></c:out></td>
						<td><c:out value="${x.dateEntrePersonne}"></c:out></td>
						<td><c:out value="${x.salaire}"></c:out></td>
						<td><c:out value="${x.dateSortieSaisonnier}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
	</c:if>
	<p class="Exception">${HotelModel.exceptionEmployeCdd}</p>
	</div>
	<br />
	<br />

	<c:if test="${not empty HotelModel.tabClientHotel}">
		<h4>Les clients de l'hotel selectionné sont donnés dans le
			tableau suivant :</h4>
		<div>
			<table class="table1">
				<tr>
					<th>Identifiant</th>
					<th>Nom</th>
					<th>Prenom</th>
					<th>Adresse</th>
					<th>Adresse mail</th>
					<th>Numéro de téléphone</th>
					<th>Adresse mail</th>
					<th>Nombre de réservations</th>
					<th>Reduction</th>
				</tr>
				<c:forEach items="${HotelModel.tabClientHotel}" var="x">
					<tr>
						<td><c:out value="${x.idPersonnes}"></c:out></td>
						<td><c:out value="${x.nomPersonne}"></c:out></td>
						<td><c:out value="${x.prenomPersonne}"></c:out></td>
						<td><c:out value="${x.dateDeNaissance}"></c:out></td>
						<td><c:out value="${x.adressePersonne}"></c:out></td>
						<td><c:out value="${x.adresseMailPersonne}"></c:out></td>
						<td><c:out value="${x.numTelPersonnne}"></c:out></td>
						<td><c:out value="${x.nbReservation}"></c:out></td>
						<td><c:out value="${x.reduction}"></c:out></td>
					</tr>
				</c:forEach>
			</table>
	</c:if>
	<p class="Exception">${HotelModel.execptionClient}</p>
	</div>
	<br />
	<br />

<div id="footerwrap">
			<div class="container">
				<h4>Nous vous remercions de votre visite</h4>
			</div>
		</div>
</body>
</html>