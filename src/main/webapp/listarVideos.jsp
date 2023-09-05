<%@page import="java.io.File"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.ObjectInputStream"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.mycompany.serializacionjorge.Video"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Listar videos</title>
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

        .content {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1 {
            font-size: 24px;
            margin-bottom: 20px;
        }

        a {
            text-decoration: none;
            color: #333;
            display: block;
            margin-top: 10px;
            font-weight: bold;
        }

        a:hover {
            color: #555;
        }

        .video-item {
            background-color: #f9f9f9;
            border: 1px solid #ddd;
            padding: 10px;
            margin: 10px 0;
            border-radius: 3px;
        }

        strong {
            font-weight: bold;
        }
    </style>
</head>
<body>
    <header>
        <h1>Listar videos</h1>
    </header>
    <div class="content">
        <a href="index.jsp">Volver al inicio</a>

        <%
          ArrayList<Video> misVideos = null;  
          String dataPath = application.getRealPath("/data/videos.ser");
          File archivo = new File(dataPath);
          if (archivo.exists()) {
              FileInputStream fis = new FileInputStream(dataPath);
              ObjectInputStream ois = new ObjectInputStream(fis);
              misVideos  = (ArrayList<Video>) ois.readObject();
              ois.close();
              out.println("<p>Datos de videos cargados exitosamente desde: " + dataPath + "</p>");
          }
          
          if (misVideos != null && !misVideos.isEmpty()) {
         
              for (Video v : misVideos) {
        %>
                <div class="video-item">
                    <strong>IdVideo:</strong> <%= v.getIdVideo() %><br>
                    <strong>Titulo:</strong> <%= v.getTitulo() %><br>
                    <strong>Autor:</strong> <%= v.getAutor() %><br>
                    <strong>Año:</strong> <%= v.getAnio() %><br>
                    <strong>Categoria:</strong> <%= v.getCategoria() %><br>
                    <strong>Url:</strong> <%= v.getUrl() %><br>
                    <strong>Letra:</strong> <%= v.getLetra() %><br>
                </div>
        <%
              }
          } else {
              out.print("<p>No hay videos disponibles.</p>");
          }
        %>
    </div>
</body>
</html>
