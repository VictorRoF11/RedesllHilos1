package Sources;

/**
 *
 * @author Victor
 */
public class Abc extends Thread {
    
    public Abc(){
        
    }    
    
    @Override
    public void run(){
        System.out.println("Abecedario");
        int i;
        for ( i = 65; i <= 90; i++) {
            esperarXsegundos(1);
            System.out.println("Hilo2: " + (char)i );                   
        }
    }
    
    private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
    
}
