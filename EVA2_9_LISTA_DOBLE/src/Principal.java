public class Principal {
    
    public static void main(String[] args) throws Exception {
        ListaDoble miLista = new ListaDoble();
        miLista.add(new Nodo(100));
        miLista.add(new Nodo(200));
        miLista.add(new Nodo(300));
        miLista.add(new Nodo(400));
        miLista.print();
        miLista.printBckwrds();
        System.out.println(miLista.size());
        System.out.println("Posicion 3: " + miLista.getAt(2));
        miLista.addBeginning(new Nodo(50));
        miLista.print();
        miLista.printBckwrds();
        miLista.insertAt(0, new Nodo(25));
        miLista.print();
    }
    
}
