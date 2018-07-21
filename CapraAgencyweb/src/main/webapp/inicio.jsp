<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Capra_agency_start</title>
</head>
<body>
	
	<form action="insert.do">
	${mensaje}
		<h1>Insertar</h1>
		<table>
			<tr>
				<td>Nom</td>
				<td><input type="text" name="nom"></td>
			</tr>
			<tr>
				<td>Ulls</td>
				<td><select name="ulls">
					<option value="blaus">Blaus</option>
					<option value="verds">Verds</option>
					<option value="grisos">Grisos</option>
					<option value="marrons">Marrons</option>
					<option value="negres">Negres</option>
				</select></td>
			</tr>
			<tr>
				<td>Cabells</td>
				<td><select name="cabell">
					<option value="blaus">Pel-roig</option>
					<option value="negres">Negres</option>
					<option value="rossos">Rossos</option>
					<option value="castanys">Castanys</option>
				</select></td>
			</tr>
			<tr>
				<td>Edat</td>
				<td><input type="text" name="edat"></td>
			</tr>
			<tr>
				<td>Altura[cm]</td>
				<td><input type="text" name="altura"></td>
			</tr>
			<tr>
				<td>Telèfon</td>
				<td><input type="text" name="telf"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td></td>
				<td align=right><input type="submit" value="insertar"></td>
			</tr>			
		</table>
	</form>
	<br>
	<hr>
	<br>
	<a href="buscar.do">Ver todos</a>
	<br>
	<hr>
	<br>
	<br>
	<form action=recuperar_avanzado.do>
		<h1>Busqueda avanzada</h1>
		<table>			
			<tr>
				<td>Ulls</td>
				<td><select name="ulls">
					<option value="blaus">Blaus</option>
					<option value="verds">Verds</option>
					<option value="grisos">Grisos</option>
					<option value="marrons">Marrons</option>
					<option value="negres">Negres</option>
					<option value="*">Tots</option>
				</select></td>
			</tr>
			<tr>
				<td>Cabells</td>
				<td><select name="cabells">
					<option value="negres">Negres</option>
					<option value="rossos">Rossos</option>
					<option value="castanys">Castanys</option>
					<option value="*">Tots</option>					
				</select></td>
			</tr>
			<tr>
				<td>Edat minima</td>
				<td><input type="text" name=edatMin></td>
			</tr>
			<tr>
				<td>Edat maxima</td>
				<td><input type="text" name=edatMax></td>
			</tr>
			<td>Altura minima</td>
				<td><input type="text" name=altMin></td>
			</tr>
			<tr>
				<td>Altura maxima</td>
				<td><input type="text" name=altMax></td>
			</tr>
			<tr>
				<td></td>
				<td align=right><input type="submit" value="buscar"></td>
			</tr>	
		</table>
	</form>

</body>
</html>
