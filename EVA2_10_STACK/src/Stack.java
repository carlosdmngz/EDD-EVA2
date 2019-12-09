public class Stack {
    private Nodo inicio;
    private Nodo fin;
    
    public Stack() {
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean isEmpty(){
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void Add(Nodo nuevo){
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    
    public void printList(){
        Nodo temp = inicio;
        while(temp != null){
            System.out.print(temp.getiValor() + " - ");
            temp = temp.getSiguiente();
        }
        System.out.println("");
    }
    
    public void addBegin(Nodo nuevo){
        if (isEmpty()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }
    
    public int size(){
        int iCont = 0;
        Nodo temp = inicio;
        while(temp != null){
            iCont++;
            temp = temp.getSiguiente();
        }
        return iCont;
    }
    
    public void insertAt(int pos, Nodo nuevo) throws Exception{
        int iTam = size();
        if (pos < 0 || pos >= iTam) {
            throw new Exception("Posicion invalida");
        } else if(pos == 0){
            addBegin(nuevo);
        } else {
            int iCont = 0;
            Nodo temp = inicio;
            while(iCont < (pos - 1)){
                temp = temp.getSiguiente();
                iCont++;
            }
            nuevo.setSiguiente(temp.getSiguiente());
            temp.setSiguiente(nuevo);
        }
    }
    
    public void clear(){
        inicio = null;
        fin = null;
    }
    
    public void deleteAt(int pos) throws Exception{
        int iTam = size();
        if (isEmpty()){
            throw new Exception("Lista Vacia");
        } else if (pos < 0 || pos >= iTam) {
            throw new Exception("Posicion invalida");
        } else if (iTam == 1){
            clear();
        } else { 
            if (pos == 0){
                inicio = inicio.getSiguiente();
            } else{
                Nodo temp = inicio;
                int cont = 0;
                while(cont < (pos - 1)){
                    temp = temp.getSiguiente();
                    cont++;
                }
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if (pos == (iTam - 1)) {
                    fin = temp;
                } 
            }
        }
    }
    
    public int getAt(int pos) throws Exception{
        int iTam = size();
        if (isEmpty()){
            throw new Exception("Lista Vacia");
        } else if (pos < 0 || pos >= iTam) {
            throw new Exception("Posicion invalida");
        } else{
            Nodo temp = inicio;
            int cont = 0;
            while(cont < pos){
                temp = temp.getSiguiente();
                cont++;
            }
            return temp.getiValor();
        }
    }
    
    public void push(Nodo nuevo){
        addBegin(nuevo);
    }
    
    public int peek() throws Exception{
        return getAt(0);
    }
    
    public int pop() throws Exception{
        int iVal = getAt(0);
        deleteAt(0);
        return iVal;
    }
    
}
