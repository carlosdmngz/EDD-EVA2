public class Principal {
    public static void main(String[] args) {
        Nodo nObj1 = new Nodo();
        nObj1.valor = 100;
        nObj1.siguiente = new Nodo();
        nObj1.siguiente.valor = 200;
        nObj1.siguiente.siguiente = new Nodo();
        nObj1.siguiente.siguiente.valor = 300;
        System.out.println(nObj1.valor);
        System.out.println(nObj1.siguiente.valor);
        System.out.println(nObj1.siguiente.siguiente.valor);
    }
    
}
class Nodo{
    //DATO A ALMACENAR
    int valor;
    Nodo siguiente;
}