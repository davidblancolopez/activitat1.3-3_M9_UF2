
package activitat1.pkg3.pkg3_m9.uf2;


public class Display implements Runnable{
    //Creem l'array amb els missatges que volem mostrar, tenim 5 missatges en total.
    String [] missatges = {"Hidrata’t bé", "Beu dos litres d’aigua al dia", "Camina 5km cada dia", "Fes esport diàriament", "Menja 5 peces de fruita al dia"};
    
    public Display(){
        
    }
    
    //El metode run Mostrara un missatge que s'escollira de forma aleatoria
    //amb el Math.random
    public void run(){
        System.out.println(missatges[ (int)(Math.random()*(5-0)+0) ]);
    }
}
