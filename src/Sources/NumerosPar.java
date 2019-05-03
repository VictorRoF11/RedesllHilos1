package Sources;

/**
 *
 * @author Victor
 */
public class NumerosPar extends Thread{
    
    public void NumerosPar(){
        
    }
    @Override
    public void run(){
        System.out.println("Numeros Pares");
        
        for (int i = 0; i < 50; i+=2) {
            esperarXsegundos(1);
            System.out.println("Hilo1: "+i);
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
