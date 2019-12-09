public class Nodo {
    private int iValor;
    private Nodo siguiente;

    public Nodo() {
        this.siguiente = null;
    }

    public Nodo(int iValor) {
        this.iValor = iValor;
        this.siguiente = null;
    }
    
    public int getiValor() {
        return iValor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}


