package Modelo;
/**
 * @author Santiago
 */
public class Usuarios {
    public String usuario[];
    public long clave[];

    public Usuarios() {
        usuario = new String[2];
        clave = new long[2];
    }

    public int verificarUsuario(String[] infUsu){
        int num = 0;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; i++){
                if(usuario[i].equals(infUsu[j])) {
                    num = 0;
                } else {
                    num = 1;
                }
            }      
        }
        return num;
    }
    public int verificaClave(long [] infCla){
        int num = 0;
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                if(clave[i]==infCla[j]) {
                    num = 0;
                }else {
                    num = 1;
                }  
            }    
        }
        return num;
    }
}
