<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personnes</title>


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


	
	<f:form modelAttribute="PersonnesModel" action="getPersonneByMc">
	<div>
	<label>Rechercher une personne à partir d'un mot clé</label>
		<input type="text" name="motClePersonne">
		<button type="submit" class="btn btn-primary">Rechercher</button>
		<c:if test="${not empty PersonnesModel.tabPersonne}">
		<table class="table">
			<tr>
				<th>Identifiant</th>
				<th>Nom</th>
				<th>Prenom</th>
				<th>Date de naissance</th>
				<th>Adresse</th>
				<th>Adresse mail</th>
				<th>Numéro de téléphone</th>
			</tr>
			<c:forEach items="${PersonnesModel.tabPersonne}" var="cl">
				<tr>
				
					<td>${cl.idPersonnes}</td>
					<td>${cl.nomPersonne}</td>
					<td>${cl.prenomPersonne}</td>
					<td>${cl.dateDeNaissance}</td>
					<td>${cl.adressePersonne}</td>
					<td>${cl.adresseMailPersonne}</td>
					<td>${cl.numTelPersonnne}</td>
				</tr>
				
			</c:forEach>
		</table>
		</c:if>
		<p class="Exception">${PersonnesModel.execptionPersonneMotCle}</p>
	</f:form>
	
<div>

<a href="AfficherClient" target="_blank">Cliquer ici pour afficher uniquement la liste des clients</a>&nbsp;&nbsp;&nbsp;

<a href="AfficherEmploye" target="_blank">Cliquer ici pour afficher uniquement la liste des employes</a>
	
<h3>Choisissez le type de personne que vous souhaitez ajouter</h3>

	<a href="AjouterClient" target="_blank">Ajouter un client</a>&nbsp;&nbsp;&nbsp;

	<a href="AjouterEmployer" target="_blank">Ajouter un employé</a>
	
	</div>



 <f:form modelAttribute="PersonnesModel" action="deletePersonne" >
<select name="idPersonnes" id="selectSupr">
			<option value="0">Choisir une personnes</option>
				<c:forEach items="${PersonnesModel.tabPersonne}" var="e">
					<option value="${e.idPersonnes}">${e.nomPersonne}</option>
				</c:forEach>
			</select>  <button type="submit" class="btn btn-primary">Supprimer</button>
</f:form>
 
 <f:form modelAttribute="PersonnesModel" action="getPersonneById" >
<select name="idPersonnes" id="selectSupr">
			<option value="0">Choisir une personnes</option>
				<c:forEach items="${PersonnesModel.tabPersonne}" var="e">
					<option value="${e.idPersonnes}">${e.nomPersonne}</option>
				</c:forEach>
			</select>  <button type="submit" class="btn btn-primary">Modifier les infos de la personne</button>
</f:form>
<f:form modelAttribute="PersonnesModel" action="updatePersonne">
<table class="table">
					<tr>
				<th>Identifiant</th>
				<th>Nom</th>
				<th>Prenom</th>
				<th>Date de naissance</th>
				<th>Adresse</th>
				<th>Adresse mail</th>
				<th>Numéro de téléphone</th> 
					</tr>
					<tr>
						<td><input type="number" name="idPersonnes" value="${PersonnesModel.idPersonnes}"></td>
						<td><input type="text" name="nomPersonne" value="${PersonnesModel.nomPersonne}"></td>
						<td><input type="text" name="prenomPersonne" value="${PersonnesModel.prenomPersonne}"></td>
						<td><input type="date" name="dateDeNaissance" value="${PersonnesModel.dateDeNaissance}"></td>
						<td><input type="text" name="adressePersonne" value="${PersonnesModel.adressePersonne}"></td>
						<td><input type="text" name="adresseMailPersonne" value="${PersonnesModel.adresseMailPersonne}"></td>
						<td><input type="text" name="numTelPersonne" value="${PersonnesModel.numTelPersonne}"></td>
					</tr>
				</table>
				<button type="submit" class="btn btn-primary">Mise à jour de la personne</button>
			</form>

</f:form>

</body>
</html>