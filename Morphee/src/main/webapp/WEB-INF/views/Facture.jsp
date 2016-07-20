<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Facture</title>


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
	<h4>Remplissez les champs pour ajouter une facture</h4>
	
	<f:form modelAttribute="FactureModel" action="addFacture" method="post" >
		   <table> 
		    <tr>
				<td>Date de facturation</td>
				<td><input type="date" name="dateFacturation" ></td>
				<td><f:errors path="dateFacturation"></f:errors></td>
			</tr>
			<tr>
				<td>TVA</td>
				<td><input type="number" step="0.01" name="tva" ></td>
				<td><f:errors path="tva"></f:errors></td>
			</tr>
			<tr>
				<td>Identifiant de la réservation</td>
				<td><input type="number" name="idReservation"  ></td>
				<td><f:errors path="idReservation"></f:errors></td>
			</tr>
			<tr>
			<td></td>
			<td><button class="btn btn-primary" >Ajouter une facture</button></td>
			</tr>
		   </table>
		   </f:form>
		   </div>
<div>
	<h4>Remplissez les champs pour ajouter une réservation à une facture</h4>
	
	<f:form modelAttribute="AddReservationFactureModel" action="addReservationFacture" method="post" >
		  <select name="idReservation">
			<option value="">Selectionner une réservation</option>
				<c:forEach items="${AddReservationFactureModel.tabReservationExi}" var="e">
					<option value="${e.idReservation}">${e.idReservation}</option>
				</c:forEach>
			</select> 
			<f:errors path="idReservation"></f:errors></td>

			<select name="idFactures">
			<option value="">Selectionner une facture</option>
				<c:forEach items="${AddReservationFactureModel.tabFacturesExist}" var="e">
					<option value="${e.idFacture}">${e.idFacture}</option>
				</c:forEach>
			</select> 
			<td><f:errors path="idFactures"></f:errors></td>
			 <button type="submit" class="btn btn-primary">Ajouter la réservation à la facture</button>
		   </f:form>
		   </div>

<f:form modelAttribute="AfficherFactureByIdModel" action="getFactureById" method="post" >
		  <select name="idFacture">
			<option value="">Selectionner une facture</option>
				<c:forEach items="${AddReservationFactureModel.tabFacturesExist}" var="e">
					<option value="${e.idFacture}">${e.idFacture}</option>
				</c:forEach>
			</select> 
			<f:errors path="idFacture"></f:errors>
			 <button type="submit" class="btn btn-primary">Afficher la réservation selectionnée</button>
			 <c:if test="${not empty AfficherFactureByIdModel.facture}">
		<table class="table">
			<tr>
				<th>Identifiant</th>
				<th>Date de facturation</th>
				<th>TVA</th>
			</tr>
			
				<tr>
					<td>${AfficherFactureByIdModel.facture.idFacture}</td>
					<td>${AfficherFactureByIdModel.facture.dateFacturation}</td>
					<td>${AfficherFactureByIdModel.facture.tva}</td>
				</tr>
				
		</table>
		</c:if> 
		   </f:form>
		   </div>

<f:form modelAttribute="AfficherFactureClientModel" action="getFacturesClient" method="post" >
		  <select name="idClient">
			<option value="">Selectionner un client</option>
				<c:forEach items="${AddReservationFactureModel.tabPersonnesExi}" var="e">
					<option value="${e.idPersonnes}">${e.nomPersonne}</option>
				</c:forEach>
			</select> 
			<f:errors path="idClient"></f:errors>
			 <button type="submit" class="btn btn-primary">Afficher les factures du client selectionné</button>
			 <c:if test="${not empty AfficherFactureClientModel.tabFactureClient}">
		<table class="table">
			<tr>
				<th>Identifiant</th>
				<th>Date de facturation</th>
				<th>TVA</th>
			</tr>
			<c:forEach items="${AfficherFactureClientModel.tabFactureClient}" var="e">
				<tr>
					<td>${e.idFacture}</td>
					<td>${e.dateFacturation}</td>
					<td>${e.tva}</td>
				</tr>
				</c:forEach>
		</table>
		</c:if> 
		   </f:form>
		   </div>

<f:form modelAttribute="CoutAnnuelClientModel" action="getCoutAnnuelClient" method="post" >
		  <select name="idClient">
			<option value="">Selectionner un client</option>
				<c:forEach items="${AddReservationFactureModel.tabPersonnesExi}" var="e">
					<option value="${e.idPersonnes}">${e.nomPersonne}</option>
				</c:forEach>
			</select> 
			<f:errors path="idClient"></f:errors>
			 <input type="number" name="annee" >
			 <f:errors path="annee"></f:errors>
			 <button type="submit" class="btn btn-primary">Afficher le coût annuel du client selectionné</button>
			 <c:if test="${CoutAnnuelClientModel.cout!=0}">
	<c:if test="${not empty CoutAnnuelClientModel.cout}">
				<p>Le cout pour l'année ${CoutAnnuelClientModel.annee} du client selectionné est de ${CoutAnnuelClientModel.cout} euros</p>
		</c:if>
		</c:if>
		   </f:form>
		   </div>
		 
		 <f:form modelAttribute="CoutSemestreClientModel" action="getCoutSemestreClient" method="post" >
		  <select name="idClient">
			<option value="">Selectionner un client</option>
				<c:forEach items="${AddReservationFactureModel.tabPersonnesExi}" var="e">
					<option value="${e.idPersonnes}">${e.nomPersonne}</option>
				</c:forEach>
			</select> 
			<f:errors path="idClient"></f:errors></td>
			 <input type="date" name="dateDebut" >
			 <f:errors path="dateDebut"></f:errors></td>
			 <input type="date" name="dateFin" >
			 <f:errors path="dateFin"></f:errors></td>
			 <button type="submit" class="btn btn-primary">Afficher le coût annuel du client selectionné</button>
			 <c:if test="${CoutSemestreClientModel.coutSemestre!=0}">
	<c:if test="${not empty CoutSemestreClientModel.coutSemestre}">
				<p>Le cout pour la période indiquée du client selectionné est de ${CoutSemestreClientModel.coutSemestre} euros</p>
		</c:if>
		</c:if>
		   </f:form>
		   </div>  
</body>
</html>