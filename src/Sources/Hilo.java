package Sources;

/**
 *
 * @author Victor
 */
public class Hilo {
    String nombre;
    int tipoHilo;

    public Hilo() {
    }

    public Hilo(String nombre, int tipoHilo) {
        this.nombre = nombre; //Nombre del hilo
        this.tipoHilo = tipoHilo; //Tipo de hilo para saber que función realiza
    }
    
    public void funcionHilo(){
        System.out.println("Iniciando " + nombre); //Muestra el nombre del hilo
        
        if(tipoHilo == 1) //Si es tipo 1 realiza ese proceso
        {
            System.out.println("Abecedario");
            int i;
            for ( i = 65; i <= 90; i++) {
                esperarXsegundos(1);
                System.out.println(nombre +" "+ (char)i );                   
            }
        }
        if(tipoHilo == 2)
        {
            System.out.println("Numeros Pares");
        
            for (int i = 0; i < 50; i+=2) {
                esperarXsegundos(1);
                System.out.println(nombre +" "+ i);
            }
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
