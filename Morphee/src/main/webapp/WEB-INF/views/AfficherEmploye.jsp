<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AfficherEmploye</title>

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
<div>
<c:if test="${not empty PersonnesModel.tabPersonneEmployeCdi}">
		<h4>Les employés en CDI (contractuels) 
			sont donnés dans le tableau suivant :</h4>
		
			<table class="table">
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
				<c:forEach items="${PersonnesModel.tabPersonneEmployeCdi}" var="x">
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
	<p class="Exception">${PersonnesModel.exceptionEmpPersCdi}</p>
	</div>
	<br />
	<br />
<div>
	<c:if test="${not empty PersonnesModel.tabPersonneEmployeCdd}">
		<h4>Les employés en CDD (saisonniers) sont
			donnés dans le tableau suivant :</h4>
		
			<table class="table">
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
				<c:forEach items="${PersonnesModel.tabPersonneEmployeCdd}" var="x">
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
	<p class="Exception">${PersonnesModel.execptionEmpPersCdd}</p>
	</div>
	<br />
	<br />
</body>
</html>