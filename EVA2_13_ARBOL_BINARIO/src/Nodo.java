public class Nodo {
    private int iValor;
    private Nodo izq;
    private Nodo der;

    public Nodo() {
        this.izq = null;
        this.der = null;
    }

    public Nodo(int iValor) {
        this.iValor = iValor;
        this.izq = null;
        this.der = null;
    }
    
    public int getiValor() {
        return iValor;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setiValor(int iValor) {
        this.iValor = iValor;
    }

    public void setIzq(Nodo siguiente) {
        this.izq = siguiente;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo previo) {
        this.der = previo;
    }
}
