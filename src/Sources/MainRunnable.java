
package Sources;

import Sources.Hilo;

/**
 *
 * @author Victor
 */
public class MainRunnable implements Runnable{
    private Hilo hilo;
    
    public MainRunnable(Hilo hilo){
       this.hilo = hilo;
    }
        
    public static void main(String[] args) {
        
        Hilo hilo1 = new Hilo("hilo1",1); //Nombre y tipo de hilo para saber que función realiza
        Hilo hilo2 = new Hilo("hilo2",2);
        
        Runnable proceso1 = new MainRunnable(hilo1);
        Runnable proceso2 = new MainRunnable(hilo2);
        
        new Thread(proceso1).start();
        new Thread(proceso2).start();
                
    }
        @Override
	public void run() {
		this.hilo.funcionHilo();                 
	}
       
 
}
