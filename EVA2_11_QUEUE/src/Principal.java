
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        Queue miQueue = new Queue();
        miQueue.add(new Nodo(100));
        miQueue.add(new Nodo(200));
        miQueue.add(new Nodo(300));
        miQueue.add(new Nodo(400));
        
        try {
            System.out.println(miQueue.leer());
            miQueue.quitar();
            System.out.println(miQueue.leer());
            miQueue.quitar();
            System.out.println(miQueue.leer());
            miQueue.quitar();
            System.out.println(miQueue.leer());
            miQueue.quitar();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
