package Controlador;

import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Santiago
 */
public class Control implements ActionListener{
    public Formulario objVista = new Formulario();
    public Usuarios objUsuario = new Usuarios();

    public Control() {
        objVista.setVisible(true);
        objVista.getBtnIngresar().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== objVista.getBtnIngresar()){
            objUsuario.leerTxt("Usuarios.txt");
            int verificado;
            verificado=objUsuario.VerificarDatos(objVista.getTxtUsuario().getText(),
                    Long.parseLong(objVista.getTxtContrasena().getText()));
            if(verificado == 0){
                int nuevaConfir;
                nuevaConfir = objVista.Exito();
                if(nuevaConfir!=0){
                    // aca se creara el pdf
                    
                }
            }else{
                objVista.ErrorDatos();
            }
        }
    }
    
}
