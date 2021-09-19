package Modelo;
/**
 * @author Santiago
 */
public class CajeroThread extends Thread{
    public String nombre;
    public Cliente cliente;
    private long initialTime;

    public CajeroThread(String nombre, Cliente cliente, long initialTime) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.initialTime = initialTime;
    }
    @Override
    public void run(){
        
    }
    private void esperarXsegundos(int segundos) {
            try{
                Thread.sleep(segundos*1000);
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
}
