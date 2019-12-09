
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
          Lista miLista = new Lista();
          miLista.add(new Nodo(4));
          miLista.add(new Nodo(100));
          miLista.add(new Nodo(15));
          miLista.add(new Nodo(32));
          miLista.add(new Nodo(65));
          miLista.addBeginning(new Nodo(22));
          boolean vacia = miLista.isEmpty();
          if (vacia)
              System.out.println("Lista vacia");
          else
              System.out.println("Lista con nodos");
          miLista.print();
            System.out.println("");
            System.out.println("Cantidad = " + miLista.size());
        try {
            miLista.insertAt(2, new Nodo(159654563));
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
            miLista.print();
            
        try {
            miLista.clearAt(0);
            miLista.print();
            miLista.add(new Nodo(200));
            miLista.print();
            miLista.add(new Nodo(300));
            miLista.print();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("El valor 3 de la lista es " + miLista.getAt(3));
        
      }
    
}
