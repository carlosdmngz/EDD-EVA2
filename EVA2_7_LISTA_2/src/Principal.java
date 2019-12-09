public class Principal {

    public static void main(String[] args) {
        Nodo n1 = new Nodo(20);
        Nodo n2 = new Nodo(21);
        Nodo n3 = new Nodo(22);
        
        n1.setSiguiente(n2);
        n2.setSiguiente(n3);
        
        Nodo temp = n1;
                
        while (temp != null){
            System.out.print(temp.getValor() + " - ");
            temp = temp.getSiguiente();
        }
                
    }
    
}
class Nodo{
    private int valor;
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
    }

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
    
        public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}