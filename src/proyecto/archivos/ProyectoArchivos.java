package proyecto.archivos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ProyectoArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ARCHIVO MEIA
        File file = new File("C:\\MEIA");
        if (!file.exists()) {
            if (file.mkdir()) {
            } 
        }
        //ARCHIVO DE FOTOS
         file = new File("C:\\MEIA\\Fotos");
        if (!file.exists()) {
            if (file.mkdir()) {
            } 
        }
     //ARCHIVO USUARIO
        String ruta = "C:/MEIA/Usuario.txt" ;
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) 
        {
            try{
               bw = new BufferedWriter(new FileWriter(archivo.getAbsoluteFile(), true));
               bw.write("");
               bw.close();
            }
            catch(IOException ex){
            }
        }    
        else 
        {
            try{
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("");
            bw.close();
            }
            catch(IOException ex){
            }
        }
        //DESCRIPTOR DE USUARIO
        ruta = "C:/MEIA/desc_Usuario.txt" ;
        archivo = new File(ruta);
        if(archivo.exists()) 
        {
            try{
               bw = new BufferedWriter(new FileWriter(archivo.getAbsoluteFile(), true));
               bw.write("");
               bw.close();
            }
            catch(IOException ex){
            }
        }    
        else 
        {
            try{
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("");
            bw.close();
            }
            catch(IOException ex){
            }
        }
        //ARCHIVO BITACORA
        ruta = "C:/MEIA/Bitacora.txt" ;
        archivo = new File(ruta);
        if(archivo.exists()) 
        {
            try{
               bw = new BufferedWriter(new FileWriter(archivo.getAbsoluteFile(), true));
               bw.write("");
               bw.close();
            }
            catch(IOException ex){
            }
        }    
        else 
        {
            try{
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("");
            bw.close();
            }
            catch(IOException ex){
            }
        }
        //ARCHIVO DESCRIPTOR DE BITACORA
        ruta = "C:/MEIA/desc_Bitacora.txt" ;
        archivo = new File(ruta);
        if(archivo.exists()) 
        {
            try{
               bw = new BufferedWriter(new FileWriter(archivo.getAbsoluteFile(), true));
               bw.write("");
               bw.close();
            }
            catch(IOException ex){
            }
        }    
        else 
        {
            try{
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("");
            bw.close();
            }
            catch(IOException ex){
            }
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Usuario().setVisible(true);
            }
        });
    }    
}
