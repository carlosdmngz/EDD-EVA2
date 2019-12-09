
import java.util.LinkedList;

public class Principal {

    public static void main(String[] args) {
        LinkedList<String> listaLnkd = new LinkedList<String>();
        listaLnkd.add("Hola");
        //listaLnkd.add(" ");
        listaLnkd.add("mundo");
       // listaLnkd.add(" ");
        listaLnkd.add("cagado");
        listaLnkd.add("!!!");
        listaLnkd.addFirst("XXXXX");
        
        for (String string : listaLnkd) {
            System.out.print(string + " - ");
        }
        System.out.println("");
        System.out.println("Cantidad de elementos " + listaLnkd.size());
        listaLnkd.remove(1);
        System.out.println(listaLnkd);
    }
    
    
}
class Algo{
    
}