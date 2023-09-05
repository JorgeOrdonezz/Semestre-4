
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Rockola</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
        }

        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        form {
            margin: 10px 0;
        }

        label {
            display: block;
            font-weight: bold;
        }

        input[type="text"],
        textarea {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        textarea {
            resize: vertical;
        }

        input[type="submit"] {
            background-color: #333;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #555;
        }

        a {
            text-decoration: none;
            color: #333;
            display: block;
            margin-top: 10px;
        }

        a:hover {
            color: #555;
        }
    </style>
</head>
<body>
    <header>
        <h1>Rockola</h1>
    </header>
    <div class="container">
        <form action="SvVideo" method="POST">
            <label for="idVideo">ID del Video:</label>
            <input type="text" name="idVideo">
            
            <label for="titulo">Título:</label>
            <input type="text" name="titulo">
            
            <label for="autor">Autor:</label>
            <input type="text" name="autor">
            
            <label for="anio">Año:</label>
            <input type="text" name="anio">
            
            <label for="url">URL:</label>
            <input type="text" name="url">
            
            <label for="categoria">Categoría:</label>
            <input type="text" name="categoria">
            
            <label for="letra">Letra:</label>
            <textarea id="id" name="letra" rows="5" cols="10"></textarea>
            
            <input type="submit" value="Agregar Video">
        </form>
        <a href="index.jsp">Volver al Menú</a>
    </div>
</body>
</html>
