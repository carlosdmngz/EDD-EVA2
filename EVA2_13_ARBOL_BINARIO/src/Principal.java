public class Principal {

    public static void main(String[] args) {
        Arbol xMasTree = new Arbol();
        
        xMasTree.agregarNodo(new Nodo(13));
        xMasTree.agregarNodo(new Nodo(10));
        xMasTree.agregarNodo(new Nodo(18));
        xMasTree.agregarNodo(new Nodo(2));
        xMasTree.agregarNodo(new Nodo(11));
        xMasTree.agregarNodo(new Nodo(17));
        xMasTree.agregarNodo(new Nodo(20));
        xMasTree.agregarNodo(new Nodo(16));
        
        xMasTree.imprimePostOrder();
        xMasTree.imprimePreOrder();
        xMasTree.imprimeInOrder();
    }
    
}
