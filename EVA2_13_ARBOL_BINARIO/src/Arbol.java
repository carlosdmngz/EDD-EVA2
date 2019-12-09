public class Arbol {
    private Nodo root;
    
    public Arbol(){
        root = null;
    }
    
    public void agregarNodo(Nodo nuevo){
        agregarNodoRec(root, nuevo);
    }
    
    private void agregarNodoRec(Nodo actual, Nodo nuevo){
        if(root == null){ //ARBOL VACIO
            root = nuevo;
        }else{
            if(nuevo.getiValor() > actual.getiValor()){ //MAYOR --> DERECHA
                if(actual.getDer() == null){ //ESTA VACIO, HAY ESPACIO
                    actual.setDer(nuevo);
                }else{ //UPS, YA HAY UN NODO
                    agregarNodoRec(actual.getDer(), nuevo);
                }
            }else if(nuevo.getiValor() < actual.getiValor()){ //MENOR --> IZQUIERDA
                if(actual.getIzq() == null){ //ESTA VACIO, HAY ESPACIO
                    actual.setIzq(nuevo);
                }else{ //UPS, YA HAY UN NODO
                    agregarNodoRec(actual.getIzq(), nuevo);
                }
            }else{ //EL VALOR YA EXISTE
                System.out.println("UPS! YA EXISTE EL VALOR");
            }
        }
    }
    public void imprimePostOrder(){
        postOrder(root);
        System.out.println("");
    }
    private void postOrder(Nodo actual){
        if(actual != null){
            //LEER IZQ
            postOrder(actual.getIzq());
            //LEER DER
            postOrder(actual.getDer());
            //IMPRIMIR
            System.out.print(actual.getiValor() + " - ");
        }
    }
    
    public void imprimePreOrder(){
        preOrder(root);
        System.out.println("");
    }
    private void preOrder(Nodo actual){
        if(actual != null){
            //IMPRIMIR
            System.out.print(actual.getiValor() + " - ");
            //LEER IZQ
            preOrder(actual.getIzq());
            //LEER DER
            preOrder(actual.getDer());
        }
    }
    
    public void imprimeInOrder(){
        inOrder(root);
        System.out.println("");
    }
    private void inOrder(Nodo actual){
        if(actual != null){
            //LEER IZQ
            inOrder(actual.getIzq());
            //IMPRIMIR
            System.out.print(actual.getiValor() + " - ");
            //LEER DER
            inOrder(actual.getDer());
        }
    }
}
