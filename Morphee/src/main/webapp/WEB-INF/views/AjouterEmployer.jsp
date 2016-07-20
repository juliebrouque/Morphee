<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AjouterEmployer</title>

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
	
	<a href="#formulaireContractuel" class="maClassA">Aller au formulaire d'ajout d'un employé contractuel</a>
	<br/>
	<br/>
		  
	<a href="#formulaireSaisonnier" class="maClassA">Aller au formulaire d'ajout d'un employé saisonnier</a>
	<br/>
	<br/>	  
	
	<div id="formulaireContractuel">
	
	<h4>Formulaire d'ajout d'un employé contractuel</h4><br/>
	<br/>	
		   <table > 
		   <f:form  modelAttribute="AjouterContractuelModel" action="addEmployeContractuel" method="post">
		   <tr>
				<td>Identifiant de l'hotel</td>
				<td><input type="number" name="idHotel"  min="1" max="3"></td>
				<td><f:errors path="idHotel"></f:errors></td>
			</tr>
		    <tr>
				<td>Nom</td>
				<td><input type="text" name="nomEmploye" ></td>
				<td><f:errors path="nomEmploye"></f:errors></td>
			</tr>
			<tr>
				<td>Prenom</td>
				<td><input type="text" name="prenomEmploye" ></td>
				<td><f:errors path="prenomEmploye"></f:errors></td>
			</tr>

			<tr>
				<td>Date de naissance</td>
				<td><input type="date" name="dateNE"  ></td>
				<td><f:errors path="dateNE"></f:errors></td>
			</tr>

			<tr>
				<td>Adresse postale</td>
				<td><input type="text" name="adresseEmploye" ></td>
				<td><f:errors path="adresseEmploye"></f:errors></td>
			</tr>
			
			<tr>
				<td>Adresse mail</td>
				<td><input type="text" name="adresseMailEmploye" ></td>
				<td><f:errors path="adresseMailEmploye"></f:errors></td>
			</tr>
			
			<tr>
				<td>Numéro de téléphone</td>
				<td><input type="text" name="numTelEmploye" ></td>
				<td><f:errors path="numTelEmploye"></f:errors></td>
			</tr>
		
			<tr>
				<td>Date d'entrée</td>
				<td><input type="date" name="dateE" ></td>
				<td><f:errors path="dateE"></f:errors></td>
			</tr>
			
			
			<tr>
				<td>Salaire</td>
				<td><input type="number" step="100" name="salaire"  min="1000" max="5000"></td>
				<td><f:errors path="salaire"></f:errors></td>
			</tr>

			<tr>
				<td>Prime</td>
				<td><input type="number" step="50" name="prime"  min="50" max="2000"></td>
				<td><f:errors path="prime"></f:errors></td>
			</tr>
			<tr>
			<td></td>
			<td><button class="btn btn-primary" >Ajouter un employé contractuel</button></td>
			
			</tr>
		</f:form>
		</table>
		
	 </div>	<br/>
	<br/>	
		 
<div id=formulaireSaisonnier>
<h4>Formulaire d'ajout d'un employé saisonnier</h4><br/>
	<br/>	
		<f:form  modelAttribute="AjouterSaisonnierModel" action="addEmployeSaisonnier" method="post">
		<table>
			 <tr>
				<td>Identifiant de l'hotel</td>
				<td><input type="number" name="idHotel"  min="1" max="3"></td>
				<td><f:errors path="idHotel"></f:errors></td>
			</tr>
		    <tr>
				<td>Nom</td>
				<td><input type="text" name="nomEmploye" ></td>
				<td><f:errors path="nomEmploye"></f:errors></td>
			</tr>
			<tr>
				<td>Prenom</td>
				<td><input type="text" name="prenomEmploye" ></td>
				<td><f:errors path="prenomEmploye"></f:errors></td>
			</tr>

			<tr>
				<td>Date de naissance</td>
				<td><input type="date" name="dateNE"  ></td>
				<td><f:errors path="dateNE"></f:errors></td>
			</tr>

			<tr>
				<td>Adresse postale</td>
				<td><input type="text" name="adresseEmploye" ></td>
				<td><f:errors path="adresseEmploye"></f:errors></td>
			</tr>
			
			<tr>
				<td>Adresse mail</td>
				<td><input type="text" name="adresseMailEmploye" ></td>
				<td><f:errors path="adresseMailEmploye"></f:errors></td>
			</tr>
			
			<tr>
				<td>Numéro de téléphone</td>
				<td><input type="text" name="numTelEmploye" ></td>
				<td><f:errors path="numTelEmploye"></f:errors></td>
			</tr>
		
			<tr>
				<td>Date d'entrée</td>
				<td><input type="date" name="dateE" ></td>
				<td><f:errors path="dateE"></f:errors></td>
			</tr>
			
			
			<tr>
				<td>Salaire</td>
				<td><input type="number" step="100" name="salaire"  min="1000" max="5000"></td>
				<td><f:errors path="salaire"></f:errors></td>
			</tr>
		
			<tr>
				<td>Date de sortie</td>
				<td><input type="date" name="dateS" ></td>
				<td><f:errors path="dateS"></f:errors></td>
			</tr>
			<tr>
			<td></td>
			<td><button class="btn btn-primary" >Ajouter un employé saisonnier</button></td>
			
			</tr>
	 </table>
		</f:form>
		</div><br/>
	<br/>	
</body>
</html>