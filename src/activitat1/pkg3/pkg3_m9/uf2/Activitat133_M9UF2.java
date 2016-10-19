
package activitat1.pkg3.pkg3_m9.uf2;

import java.util.concurrent.ExecutionException;
import static java.util.concurrent.Executors.newSingleThreadScheduledExecutor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class Activitat133_M9UF2 {


    public static void main(String[] args) throws InterruptedException{
        //Creem l'unic fil que utilitzara el programa.
        ScheduledExecutorService executor = newSingleThreadScheduledExecutor();
        
        Display DP = new Display();
        
        //Tenemos el executor que cridara al Display.
        executor.scheduleWithFixedDelay(DP, 0, 5, TimeUnit.SECONDS);
        
        //Despues de 60 segundos el executor parará.
        executor.awaitTermination(60, TimeUnit.SECONDS); 
         
         //Aquí termina el executor. 
         executor.shutdown();  
    }
    
}
