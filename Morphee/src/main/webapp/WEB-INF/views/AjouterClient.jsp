<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AjouterClient</title>

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
<script type="text/javascript">


</script>

<div>
	<h4>Remplissez les champs pour ajouter un client</h4>
	
	<f:form modelAttribute="AjouterClientModel" action="addClient" method="post" >
		   <table> 
		    <tr>
				<td>Nom</td>
				<td><input type="text" name="nomClient" ></td>
				<td><f:errors path="nomClient"></f:errors></td>
			</tr>
			<tr>
				<td>Prenom</td>
				<td><input type="text" name="prenomClient" ></td>
				<td><f:errors path="prenomClient"></f:errors></td>
			</tr>

			<tr>
				<td>Date de naissance</td>
				<td><input type="date" name="dateN"  ></td>
				<td><f:errors path="dateN"></f:errors></td>
			</tr>

			<tr>
				<td>Adresse postale</td>
				<td><input type="text" name="adresseClient" ></td>
				<td><f:errors path="adresseClient"></f:errors></td>
			</tr>
			
			<tr>
				<td>Adresse mail</td>
				<td><input type="text" name="adresseMailClient" ></td>
				<td><f:errors path="adresseMailClient"></f:errors></td>
			</tr>
			
			<tr>
				<td>Numéro de téléphone</td>
				<td><input type="text" name="numTelClient" ></td>
				<td><f:errors path="numTelClient"></f:errors></td>
			</tr>
			
			<tr>
				<td>Date d'inscription</td>
				<td><input type="date" name="dateI" ></td>
				<td><f:errors path="dateI"></f:errors></td>
			</tr>
			
			<tr>
				<td>Réduction</td>
				<td><input type="number" step="0.1" name="reduction"  min="0" max="1"></td>
				<td><f:errors path="reduction"></f:errors></td>
			</tr>
			<tr>
				<td>Identifiant de l'hotel</td>
				<td><input type="number" name="idHotel"  min="1" max="3"></td>
				<td><f:errors path="idHotel"></f:errors></td>
			</tr>
			<tr>
			<td></td>
			<td><button class="btn btn-primary" >Ajouter un client</button></td>
			
			</tr>
		   
		   </table>
		   
		   </f:form>
		   </div>
</body>
</html>