<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Cadastro de volume</title>
	</head>

	<body>
		<body background="http://7-themes.com/data_images/out/31/6875746-wolverine-wallpaper.jpg">
	<form action="CadastroServlet" method="post">
		
		Título:<input type="text" name="titulo"> 
		
		<br>
		 <br>

		Descrição:<textarea name ="descricao" rows="4" cols="50">
				 Entre com a descrição aqui...
				</textarea>
		
		 <br>
		  <br>

		Tipo do Volume:<select name="tipo">
			<option value="livro">Livro</option>
			<option value="periodico">Periódico</option>
			<option value="foto">Foto</option>
			<option value="audio">Áudio</option>
		</select> 
		
		<br> 
		<br> 
		
		Autor:<input type="text" name="autor">
		
		 <br>
		 <br>
		 
		Quantidade de Páginas:<input type="text" name="quantpag">

		<br>
		<br> 
		
		Ano de Lancamento:<input type="text" name="anodelanc"> 
		
		<br> 
		<br> 
		
		Editora:
		
		<select name="editora">
			<option value="jbc">JBC</option>
			<option value="shonen jump">Shonen Jump</option>
			<option value="online">On Line</option>
			<option value="conrad">Conrad</option>
		</select>
		
		 <br>
		 <br>
		 
		 <input type="submit">
	</form>

</body>
</html>