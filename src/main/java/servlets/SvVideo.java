
package servlets;

import com.mycompany.serializacionjorge.Video;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jorge Andres
 */
@WebServlet(name = "SvVideo", urlPatterns = {"/SvVideo"})
public class SvVideo extends HttpServlet {

ArrayList<Video> misVideos =new ArrayList<>();

     @Override
    public void init() throws ServletException {
        super.init();
  
        ServletContext servletContext = getServletContext();

        cargarVideosDesdeArchivo(servletContext);
    }
    


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        String idVideo = request.getParameter("idVideo");
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String anio = request.getParameter("anio");
        String url = request.getParameter("url");
        String categoria = request.getParameter("categoria");
        String letra = request.getParameter("letra");   

        try {
            int idVideoInt = Integer.parseInt(idVideo);

            Video miVideo = new Video(idVideoInt, titulo, autor, anio, categoria, url, letra);
            misVideos.add(miVideo);
        } catch (NumberFormatException e) {

            e.printStackTrace();
            System.out.println("Error al convertir idVideo a entero: " + e.getMessage());
        }


        guardarVideosEnArchivo();

    
        request.setAttribute("misVideos", misVideos);

 
        request.getRequestDispatcher("listarVideos.jsp").forward(request, response);
    }



    private void guardarVideosEnArchivo() {
        try {
   
            String dataPath = getServletContext().getRealPath("/data");

      
            File dataFolder = new File(dataPath);
            if (!dataFolder.exists()) {
                dataFolder.mkdirs();
            }

   
            String filePath = dataPath + File.separator + "videos.ser";
            FileOutputStream zzz = new FileOutputStream(filePath);
            ObjectOutputStream hh = new ObjectOutputStream(zzz);
            hh.writeObject(misVideos);
            hh.close();
            System.out.println("Datos de videos guardados exitosamente en: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al guardar los datos de videos: " + e.getMessage());
        }
    }
    

    public void cargarVideosDesdeArchivo(ServletContext servletContext) {
        try {

            String dataPath = servletContext.getRealPath("/data/videos.ser");
            
    
            
            File archivo = new File(dataPath);
            if (archivo.exists()) {
                FileInputStream fis = new FileInputStream(dataPath);
                ObjectInputStream ois = new ObjectInputStream(fis);
                misVideos  = (ArrayList<Video>) ois.readObject();
                ois.close();
                System.out.println("Datos de videos cargados exitosamente desde: " + dataPath);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error al cargar los datos de videos: " + e.getMessage());
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}    
