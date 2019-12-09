
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {
    
    public static void main(String[] args) {
        Stack miStack = new Stack();
        miStack.push(new Nodo(100));
        miStack.push(new Nodo(200));
        miStack.push(new Nodo(300));
        miStack.push(new Nodo(400));
        try {
            System.out.println("Cima del stack " + miStack.peek());
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            miStack.pop();
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        miStack.printList();
}    
}
    
