package Controlador;

import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago
 */
public class Control implements ActionListener{
    public Formulario objVista = new Formulario();
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== objVista.getBtnIngresar()){
            File archivo = new File("Usuarios.txt");
            try {
                FileReader Leer = new FileReader(archivo);
                String usu;
                String clave;
                int c;
                while((c = Leer.read())!=1){
                    
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Archivo no existe");
            } catch (IOException ex) {
                Logger.getLogger(Control.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
    
}
